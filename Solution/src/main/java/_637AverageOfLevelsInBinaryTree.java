import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _637AverageOfLevelsInBinaryTree {
  public List<Double> averageOfLevels(TreeNode root) {
    if (root == null) {
      return Collections.emptyList();
    }
    List<Double> result = new ArrayList<>();
    List<Integer> count = new ArrayList<>();
    average(0, root, result, count);

    for (int i = 0; i < result.size(); i++) {
      result.set(i, result.get(i) / count.get(i));
    }
    return result;
  }

  private void average(int level,  TreeNode node, List<Double> sum, List<Integer> count) {
    if (node == null) {
      return;
    }
    if (level < sum.size()) {
      sum.set(level, sum.get(level) + node.val);
      count.set(level, count.get(level) + 1);
    } else {
      sum.add(1.0 * node.val);
      count.add(1);
    }

    average(level + 1, node.left, sum, count);
    average(level + 1, node.right, sum, count);
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
