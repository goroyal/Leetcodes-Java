import java.util.ArrayList;
import java.util.List;

public class _448FindDisappearedNumbers {
  public List<Integer> findDisappearedNumbers(int[] nums) {
    List<Integer> results = new ArrayList<>();

    for (int i = 0; i < nums.length; i++) {
      int indexToChange = Math.abs(nums[i])  - 1;
      int value = nums[indexToChange];
      nums[indexToChange] = value > 0 ? -value : value;
    }

    for (int i = 0; i < nums.length; i++) {
      if (nums[i] > 0) {
        results.add(i + 1);
      }
    }
    return results;
  }
}
