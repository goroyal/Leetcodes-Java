import java.util.ArrayList;
import java.util.List;

/**
 * 1382. Balance a Binary Search Tree
 *
 * Given a binary search tree, return a balanced binary search tree with the same node values.
 *
 * A binary search tree is balanced if and only if the depth of the two subtrees of every node never differ by more than 1.
 *
 * If there is more than one answer, return any of them.
 */
public class _1382BalanceBinarySearchTree {
  public TreeNode balanceBST(TreeNode root) {
    if (root == null) {
      return null;
    }
    List<TreeNode> list = new ArrayList<>();
    inOrderTraverse(list, root);
    return constructBinarySearchTree(list, 0, list.size() - 1);
  }

  private void inOrderTraverse(List<TreeNode> list, TreeNode root) {
    if (root == null) {
      return;
    }
    inOrderTraverse(list, root.left);
    list.add(root);
    inOrderTraverse(list, root.right);
  }

  private TreeNode constructBinarySearchTree(List<TreeNode> list, int low, int high) {
    if (low > high) {
      return null;
    }
    int mid = (low + high) / 2;
    TreeNode root = list.get(mid);
    root.left = constructBinarySearchTree(list, low, mid - 1);
    root.right = constructBinarySearchTree(list, mid + 1, high);
    return root;
  }
}
