import java.util.ArrayList;
import java.util.List;

public class _094BinaryTreeInorderTraversal {
  public List<Integer> inorderTraversal(TreeNode root) {
    List<Integer> result = new ArrayList<>();
    if (root == null) {
      return result;
    }
    inorder(root, result);
    return result;
  }

  private void inorder(TreeNode node, List<Integer> result) {
    if (node != null) {
      inorder(node.left, result);
      result.add(node.val);
      inorder(node.right, result);
    }
  }
}
