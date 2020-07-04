import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _090Subsets2 {
  public List<List<Integer>> subsetsWithDup(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();
    if (nums == null || nums.length == 0) {
      return result;
    }

    Arrays.sort(nums);
    addSubsets(result, nums, 0, new ArrayList<>());
    return result;
  }

  private void addSubsets(List<List<Integer>> result, int[] nums, int index, List<Integer> subset){
    result.add(subset);
    for (int i = index; i < nums.length; i++) {
      if (i > index && nums[i] == nums[i-1]) continue; //这样判断是为了让第一个元素能够开始进入subset
      List<Integer> newSubset = new ArrayList<>(subset);
      newSubset.add(nums[i]);
      addSubsets(result, nums, i + 1, newSubset);
    }
  }
}