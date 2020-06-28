public class _665NondecreasingArray {
  public boolean checkPossibility(int[] nums) {
    boolean checked = false;

    for (int i = 1; i < nums.length; i++) {
      if (nums[i] >= nums[i - 1]) {
        continue;
      }
      if (checked) {
        return false;
      }
      if (i - 1 == 0 || i == nums.length - 1) {
        checked = true;
        continue;
      }
      if (nums[i - 2] <= nums[i] || nums[i - 1] <= nums[i + 1]) {
        checked = true;
      } else {
        return false;
      }
    }
    return true;
  }
}
