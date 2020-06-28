/**
 * Created by dgq on 1/6/2016.
 */
public class _226InvertBinaryTree {
  public TreeNode invertTree(TreeNode root) {
    if (root == null){
      return root;
    }
    TreeNode left = root.left;
    TreeNode right = root.right;
    if (left == null){
      left = right;
      right = null;
    }
    return null;
  }
}
