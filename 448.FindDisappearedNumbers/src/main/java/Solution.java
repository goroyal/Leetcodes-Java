import java.util.ArrayList;
import java.util.List;

class Solution {
  public List<Integer> findDisappearedNumbers(int[] nums) {
    List<Integer> result = new ArrayList<>(nums.length);

    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != nums[nums[i]-1]) {
        swap(nums, i, nums[i]-1);
      }
    }
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != nums[nums[i]-1]) {
        result.add(i);
      }
    }
    return result;
  }

  private void swap(int[] nums, int x, int y) {
    int temp = nums[x];
    nums[x] = nums[y];
    nums[y] = temp;
  }
}