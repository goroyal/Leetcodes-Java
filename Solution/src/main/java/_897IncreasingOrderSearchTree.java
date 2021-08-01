import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 897. Increasing Order Search Tree
 *
 * Given the root of a binary search tree, rearrange the tree in in-order so that the leftmost node in the tree
 * is now the root of the tree, and every node has no left child and only one right child.
 */
public class _897IncreasingOrderSearchTree {
  public TreeNode increasingBSTII(TreeNode root) {
    return inorder(root, null);
  }

  private TreeNode inorder(TreeNode root, TreeNode tail) {
    if (root == null) {
      return tail;
    }
    TreeNode res = inorder(root.left, root);
    root.left = null;
    root.right = inorder(root.right, tail);
    return res;
  }

  public TreeNode increasingBST(TreeNode root) {
    if (root == null) {
      return null;
    }
    List<TreeNode> nodes = new ArrayList<>();
    inOrderTraverse(nodes, root);
    TreeNode start = new TreeNode(0);
    TreeNode current = start;
    for (TreeNode node : nodes) {
      current.right = new TreeNode(node.val);
      current = current.right;
    }
    return start.right;
  }

  private void inOrderTraverse(List<TreeNode> nodes, TreeNode root) {
    if (root == null) {
      return;
    }
    inOrderTraverse(nodes, root.left);
    nodes.add(root);
    inOrderTraverse(nodes, root.right);
  }
}

