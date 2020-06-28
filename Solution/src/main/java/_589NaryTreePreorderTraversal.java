import java.util.ArrayList;
import java.util.List;

public class _589NaryTreePreorderTraversal {
  public List<Integer> preorder(Node root) {
    List<Integer> result = new ArrayList<>();
    preorder(result, root);
    return result;
  }

  private void preorder(List<Integer> traversalResult, Node node) {
    if (node == null) {
      return;
    }
    traversalResult.add(node.val);
    for (Node child : node.children) {
      preorder(traversalResult, child);
    }
  }
}
