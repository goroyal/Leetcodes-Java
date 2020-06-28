import java.util.ArrayList;
import java.util.List;

public class _590NaryTreePostorderTraversal {
  public List<Integer> postorder(Node root) {
    List<Integer> result = new ArrayList<>();
    postorder(result, root);
    return result;
  }

  private void postorder(List<Integer> traversalResult, Node node) {
    if (node == null) {
      return;
    }
    for (Node child : node.children) {
      postorder(traversalResult, child);
    }
    traversalResult.add(node.val);
  }
}
