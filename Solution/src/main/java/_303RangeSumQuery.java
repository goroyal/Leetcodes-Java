public class _303RangeSumQuery {
  public class NumArray {
    private int[] sums;

    public NumArray(int[] nums) {
      sums = new int[nums.length];
      sums[0] = nums[0];
      for (int i = 1; i < nums.length; i++) {
        sums[i] = sums[i-1] + nums[i];
      }
    }

    public int sumRange(int left, int right) {
      if (left == 0) {
        return sums[right];
      }
      return sums[right] - sums[left-1];
    }
  }

}
