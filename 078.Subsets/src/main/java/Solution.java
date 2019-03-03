import java.util.ArrayList;
import java.util.List;

/**
 * 从一个集合里面找出所有可能的子集。原集合不含重复数字。
 */
public class Solution {
  public List<List<Integer>> subsets(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();

    List<Integer> emptySet = new ArrayList<>();
    result.add(emptySet);
    for (int num : nums) {
      int currentExistedSize = result.size();
      for (int i = 0; i < currentExistedSize; i++) {
        List<Integer> set = new ArrayList<>(result.get(i));
        set.add(num);
        result.add(set);
      }
    }

    return result;
  }
}