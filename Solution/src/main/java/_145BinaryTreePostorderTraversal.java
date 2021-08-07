import java.util.ArrayList;
import java.util.List;

public class _145BinaryTreePostorderTraversal {
  public List<Integer> postorderTraversal(TreeNode root) {
    List<Integer> result = new ArrayList<>();
    if (root == null) {
      return result;
    }
    postorder(root, result);
    return result;
  }

  private void postorder(TreeNode node, List<Integer> result) {
    if (node != null) {
      postorder(node.left, result);
      postorder(node.right, result);
      result.add(node.val);
    }
  }
}
