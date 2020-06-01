public class Solution {
  public int findTilt(TreeNode root) {
    if (root == null) {
      return 0;
    }

    int rootTilt = Math.abs(getSum(root.left) - getSum(root.right));
    return rootTilt + findTilt(root.left) + findTilt(root.right);
  }

  private int getSum(TreeNode node) {
    if (node == null) {
      return 0;
    }
    return node.val + getSum(node.left) + getSum(node.right);
  }

  static class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
      val = x;
    }
  }
}
