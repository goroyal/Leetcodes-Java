class Solution {
	public int rob(int[] nums) {
		if (nums.length == 1) {
			return nums[0];
		}
		return Math.max(rob(nums, 0, nums.length - 2), rob(nums, 1, nums.length - 1));
	}

	private int rob(int[] nums, int start, int end) {
		if (start > end) {
			return 0;
		}
		// 表示如果上家不被偷可得总数
		int previousNotRobbed = 0;
		// 表示如果上家被偷可得总数
		int previousRobbed = 0;

		for (int i = start; i <= end; i++) {
			int currentRobbed = previousNotRobbed + nums[i];
			int currentNotRobbed = Math.max(previousNotRobbed, previousRobbed);

			previousNotRobbed = currentNotRobbed;
			previousRobbed = currentRobbed;
		}
		return Math.max(previousNotRobbed, previousRobbed);
	}
}