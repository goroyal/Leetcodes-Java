class _198HouseRobber {
  public int rob(int[] nums) {
    if (nums.length == 0) {
      return 0;
    }
    // 表示如果上家不被偷可得总数
    int previousNotRobbed = 0;
    // 表示如果上家被偷可得总数
    int previousRobbed = 0;

    for (int i = 0; i < nums.length; i++) {
      int currentRobbed = previousNotRobbed + nums[i];
      int currentNotRobbed = Math.max(previousNotRobbed, previousRobbed);

      previousNotRobbed = currentNotRobbed;
      previousRobbed = currentRobbed;
    }
    return Math.max(previousNotRobbed, previousRobbed);
  }


  // recursion way, time execution exceed
  private int rob(int[] nums, int i) {
    if (i == 0) {
      return nums[0];
    } else if (i == 1) {
      return Math.max(nums[0], nums[1]);
    } else {
      return Math.max(nums[i] + rob(nums, i-2), rob(nums, i-1));
    }
  }

}