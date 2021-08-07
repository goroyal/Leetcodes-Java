import java.util.ArrayList;
import java.util.List;

/**
 * Given an integer n, return all the structurally unique BST's (binary search trees),
 * which has exactly n nodes of unique values from 1 to n. Return the answer in any order.
 */
public class _095UniqueBinarySearchTreesII {
  public List<TreeNode> generateTrees(int n) {
    return generate(1, n);
  }

  private List<TreeNode> generate(int start, int end) {
    List<TreeNode> result = new ArrayList<>();
    if (start > end) {
      return result;
    }
    if (start == end) {
      result.add(new TreeNode(start));
      return result;
    }
    for (int i = start; i <= end; i++) {
      List<TreeNode> left = generate(start, i - 1);
      List<TreeNode> right = generate(i + 1, end);
      result.addAll(appendTrees(i, left, right));
    }
    return result;
  }

  private List<TreeNode> appendTrees(int number, List<TreeNode> left, List<TreeNode> right) {
    List<TreeNode> result = new ArrayList<>();
    if (left.isEmpty() && right.isEmpty()) {
      result.add(new TreeNode(number));
      return result;
    }
    if (left.isEmpty()) {
      for (TreeNode r : right) {
        TreeNode current = new TreeNode(number);
        current.right = r;
        result.add(current);
      }
      return result;
    }
    if (right.isEmpty()) {
      for (TreeNode l : left) {
        TreeNode current = new TreeNode(number);
        current.left = l;
        result.add(current);
      }
      return result;
    }
    for (TreeNode l : left) {
      for (TreeNode r : right) {
        TreeNode current = new TreeNode(number);
        current.left = l;
        current.right = r;
        result.add(current);
      }
    }
    return result;
  }
}

