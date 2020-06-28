public class _543DiameterOfBinaryTree {
  public int diameterOfBinaryTree(TreeNode root) {
    if (root == null) {
      return 0;
    }

    int leftDepth = depth(root.left);
    int rightDepth = depth(root.right);
    int diameter = depth(root.left) + depth(root.right);
    int subDiameter = leftDepth > rightDepth
        ? diameterOfBinaryTree(root.left)
        : diameterOfBinaryTree(root.right);
    return Math.max(diameter, subDiameter);
  }

  private int depth(TreeNode root) {
    if (root == null) {
      return 0;
    }
    int left = 1 + depth(root.left);
    int right = 1 + depth(root.right);
    return Math.max(left, right);
  }
}
