public class _530MinimumAbsoluteDifferenceInBST {
  public int getMinimumDifference(TreeNode root) {
    if (root == null) {
      return Integer.MAX_VALUE;
    }
    TreeNode left = root.left != null ? getLargestNode(root.left) : null;
    TreeNode right = root.right != null ? getSmallestNode(root.right) : null;
    int current;
    if (left != null && right != null) {
      current = Math.min(root.val - left.val, right.val - root.val);
    } else if (left == null && right != null){
      current = right.val - root.val;
    } else if (left != null && right == null) {
      current = root.val - left.val;
    } else {
      return Integer.MAX_VALUE;
    }
    int leftResult = getMinimumDifference(root.left);
    int rightResult = getMinimumDifference(root.right);
    return Math.min(Math.min(leftResult, rightResult), current);
  }

  private TreeNode getLargestNode(TreeNode root) {
    TreeNode p = root;
    while (p.right != null) {
      p = p.right;
    }
    return p;
  }

  private TreeNode getSmallestNode(TreeNode root) {
    TreeNode p = root;
    while (p.left != null) {
      p = p.left;
    }
    return p;
  }
}
