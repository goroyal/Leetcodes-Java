import java.util.ArrayList;
import java.util.List;

public class _144BinaryTreePreorderTraversal {
  public List<Integer> preorderTraversal(TreeNode root) {
    List<Integer> result = new ArrayList<>();
    if (root == null) {
      return result;
    }
    preorder(root, result);
    return result;
  }

  private void preorder(TreeNode node, List<Integer> result) {
    if (node != null) {
      result.add(node.val);
      preorder(node.left, result);
      preorder(node.right, result);
    }
  }
}
