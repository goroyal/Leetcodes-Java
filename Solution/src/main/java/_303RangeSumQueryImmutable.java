public class _303RangeSumQueryImmutable {
  public int sumOfLeftLeaves(TreeNode root) {
    if (root == null || root.left == null && root.right == null)
      return 0;
    return sum(root);
  }

  private int sum(TreeNode node) {
    if (node == null) {
      return 0;
    }

    return findLeft(node) + sum(node.right);
  }

  private int findLeft(TreeNode node) {
    if (node.left != null) {
      if (node.left.left == null && node.left.right == null) {
        return node.left.val;
      }
    }
    return sum(node.left);
  }
}
