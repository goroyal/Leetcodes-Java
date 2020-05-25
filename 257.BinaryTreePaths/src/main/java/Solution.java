import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
  public List<String> binaryTreePaths(TreeNode root) {
    if (root == null) {
      return Collections.emptyList();
    }
    List<String> list = new ArrayList<>();
    binaryTreePaths(list, "", root);
    return list;
  }

  private void binaryTreePaths(List<String> list, String path, TreeNode node) {
    if (node.left == null && node.right == null) {
      list.add(path + node.val);
    }
    path = path + node.val + "->";
    if (node.left != null) {
      binaryTreePaths(list, path, node.left);
    }
    if (node.right != null) {
      binaryTreePaths(list, path, node.right);
    }
  }

  static class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
      val = x;
    }
  }
}
