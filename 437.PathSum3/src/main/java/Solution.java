public class Solution {
  private int count = 0;

  public int pathSum(TreeNode root, int sum) {
    if (root != null) {
      traverse(root, sum, 0);
      pathSum(root.left, sum);
      pathSum(root.right, sum);
    }
    return count;
  }

  private void traverse(TreeNode node, int targetSum, int currentSum) {
    if (node == null) {
      return;
    }
    currentSum += node.val;
    if (currentSum == targetSum) {
      count++;
    }
    traverse(node.left, targetSum, currentSum);
    traverse(node.right, targetSum, currentSum);
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
