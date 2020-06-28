public class _724FindPivotIndex {
  public int pivotIndex(int[] nums) {
    int sum = 0, leftSum = 0;
    for (int num : nums) {
      sum += num;
    }
    for (int i = 0; i < nums.length; i++) {
      if (sum - leftSum - nums[i] == leftSum) {
        return i;
      }
      leftSum += nums[i];
    }

    return -1;
  }
}
