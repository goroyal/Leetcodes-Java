import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _501FindModeInBinarySearchTree {
  public int[] findMode(TreeNode root) {
    Map<Integer, Integer> map = new HashMap<>();
    traverse(root, map);

    List<Integer> maxOccurrence = new ArrayList<>();
    int max = 0;

    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
      if (entry.getValue() > max) {
        max = entry.getValue();
        maxOccurrence.clear();
        maxOccurrence.add(entry.getKey());
      } else if (entry.getValue() == max) {
        maxOccurrence.add(entry.getKey());
      }
    }
    return maxOccurrence.stream().mapToInt(i->i).toArray();
  }

  private void traverse(TreeNode node, Map<Integer, Integer> map) {
    if (node == null) {
      return;
    }
    if (map.containsKey(node.val)) {
      map.put(node.val, map.get(node.val) + 1);
    } else {
      map.put(node.val, 1);
    }
    traverse(node.left, map);
    traverse(node.right, map);
  }
}
