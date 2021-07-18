/**
 * Given a binary tree, determine if it is height-balanced.
 * For this problem, a height-balanced binary tree is defined as
 * a binary tree in which the depth of the two subtrees of every node never differ by more than 1.
 */
public class _110BalancedBinaryTree {
  public boolean isBalanced(TreeNode root) {
    if (root == null){
      return true;
    }
    if (Math.abs(getHeight(root.left) - getHeight(root.right)) > 1){
      return false;
    }
    return isBalanced(root.left) && isBalanced(root.right);
  }

  private int getHeight(TreeNode node){
    if (node == null){
      return 0;
    }
    if (node.left == null && node.right == null){
      return 1;
    }
    int leftHeight = getHeight(node.left);
    int rightHeight = getHeight(node.right);
    return 1 + Math.max(leftHeight, rightHeight);
  }
}
