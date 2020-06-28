public class _628MaximumProductOfThreeNumbers {
  public int maximumProduct(int[] nums) {
    Integer max = null;
    Integer secondMax = null;
    Integer thirdMax = null;
    Integer min = null;
    Integer secondMin = null;
    Integer thirdMin = null;

    for (int i = 0; i < nums.length; i++) {
      if (max == null || nums[i] > max) {
        thirdMax = secondMax;
        secondMax = max;
        max = nums[i];
      } else if (secondMax == null || nums[i] > secondMax) {
        thirdMax = secondMax;
        secondMax = nums[i];
      } else if (thirdMax == null || nums[i] > thirdMax) {
        thirdMax = nums[i];
      }
      if (min == null || nums[i] < min) {
        thirdMin = secondMin;
        secondMin = min;
        min = nums[i];
      } else if (secondMin == null || nums[i] < secondMin) {
        thirdMin = secondMin;
        secondMin = nums[i];
      } else if (thirdMin == null || nums[i] < thirdMin) {
        thirdMin = nums[i];
      }
    }

    return Math.max(Math.max(max * secondMax * thirdMax, min * secondMin * thirdMin), max * min * secondMin);
  }
}
