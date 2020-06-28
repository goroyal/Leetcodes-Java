public class _581ShortestUnsortedContinuousSubarray {
  public int findUnsortedSubarray(int[] nums) {
    int length = nums.length;
    int max = nums[0];
    int min = nums[length-1];

    int left = length;
    int right = 0;
    for (int i = 0; i < nums.length; i++) {
      max = Math.max(max, nums[i]);
      min = Math.min(min, nums[length - 1 - i]);

      // 当前值一直比它左边的某个max小，说明那个max的位置始终应该还在当前这个值后面
      // 那么right标志位就可以在每次比较后往右移，直到当前值大于或等于之前的最大值
      if (max > nums[i]) {
        right = i;
      }
      // 同理，从右往左开始找合适的最小值的位置
      if (min < nums[length - 1 - i]) {
        left = length - 1 - i;
      }
    }
    // 最后得到的left和right分别在这个区间的左和右的位置，计算的时候需要加1表示包括边界
    return right > left ? right - left + 1: 0;
  }
}
