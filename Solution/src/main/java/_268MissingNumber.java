public class _268MissingNumber {
  public int missingNumber(int[] nums) {
    int actualSum = 0;
    for (int i = 0; i < nums.length; i++) {
      actualSum += nums[i];
    }
    int theorySum = nums.length * (nums.length + 1) / 2;
    return theorySum - actualSum;
  }
}
