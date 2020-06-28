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
    if (!(isBalanced(root.left))){
      return false;
    }
    if (!isBalanced(root.right)){
      return false;
    }
    int leftHeight = getHeight(root.left);
    int rightHeght = getHeight(root.right);
    if (Math.abs(leftHeight-rightHeght) > 1){
      return false;
    }
    return true;
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
    if (node.left == null){
      return rightHeight+1;
    }
    if (node.right == null){
      return leftHeight+1;
    }
    return (leftHeight>rightHeight) ? leftHeight+1 : rightHeight+1;
  }
}
