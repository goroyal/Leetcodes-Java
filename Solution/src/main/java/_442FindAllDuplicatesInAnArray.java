import java.util.ArrayList;
import java.util.List;

public class _442FindAllDuplicatesInAnArray {
  public List<Integer> findDuplicates(int[] nums) {
    List<Integer> result = new ArrayList<>();
    for (int i = 0; i < nums.length; i++) {
      int index = Math.abs(nums[i]) - 1;
      if (nums[index] > 0) {
        nums[index] *= -1;
      } else {
        // 为负数说明前面同样的地方已经被改动过了
        result.add(Math.abs(nums[i]));
      }
    }
    return result;
  }
}
