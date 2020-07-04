/**
 * Created by goroyal on 1/6/2016.
 */
public class _226InvertBinaryTree {
  public TreeNode invertTree(TreeNode root) {
    if (root == null) {
      return null;
    }
    invert(root, root.left, root.right);
    return root;
  }

  private void invert(TreeNode node, TreeNode leftChild, TreeNode rightChild) {
    node.left = rightChild;
    node.right = leftChild;
    if (leftChild != null) {
      invert(leftChild, leftChild.left, leftChild.right);
    }
    if (rightChild != null) {
      invert(rightChild, rightChild.left, rightChild.right);
    }
  }
}
