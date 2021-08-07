public class _112PathSum {
  public boolean hasPathSum(TreeNode root, int sum) {
    if (root == null) {
      return false;
    }

    return hasPathSum(root, 0, sum);
  }

  private boolean hasPathSum(TreeNode node, int traversaledSum, int sum) {
    if (node.left == null && node.right == null) {
      return node.val + traversaledSum == sum;
    }
    boolean left = node.left != null && hasPathSum(node.left, node.val + traversaledSum, sum);
    boolean right = node.right != null && hasPathSum(node.right, node.val + traversaledSum, sum);
    return left || right;
  }
}
