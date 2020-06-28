import java.util.HashSet;
import java.util.Set;

public class _653TwoSumIVInputIsBST {
  public boolean findTarget(TreeNode root, int k) {
    Set<Integer> set = new HashSet<>();
    return findTarget(root, k, set);
  }

  private boolean findTarget(TreeNode node, int k, Set<Integer> set) {
    if (node == null) {
      return false;
    }
    if (set.contains(k - node.val)) {
      return true;
    }
    set.add(node.val);
    return findTarget(node.left, k, set) || findTarget(node.right, k, set);
  }
}
