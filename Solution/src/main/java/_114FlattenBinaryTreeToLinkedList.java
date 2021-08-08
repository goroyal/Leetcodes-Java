import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * Given the root of a binary tree, flatten the tree into a "linked list": <br/>
 * <br/>
 * The "linked list" should use the same TreeNode class where the right child pointer points to the next node in the list and the left child pointer is always null. <br/>
 * The "linked list" should be in the same order as a pre-order traversal of the binary tree. <br/>
 */
public class _114FlattenBinaryTreeToLinkedList {
  public void flatten(TreeNode root) {
    if (root == null) {
      return;
    }
    Deque<TreeNode> deque = new ArrayDeque<>();
    deque.add(root);
    List<TreeNode> list = new ArrayList<>();
    while (!deque.isEmpty()) {
      TreeNode node = deque.pop();
      list.add(node);
      if (node.right != null) {
        deque.push(node.right);
      }
      if (node.left != null) {
        deque.push(node.left);
      }
    }
    root.left = null;
    TreeNode pointer = root;
    for (int i = 1; i < list.size(); i++) {
      TreeNode current = list.get(i);
      pointer.right = current;
      current.left = null;
      pointer = current;
    }
  }
}
