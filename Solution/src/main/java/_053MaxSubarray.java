class _053MaxSubarray {
	public int maxSubArray(int[] nums) {
		int maxResult = nums[0];
		int maxCurrent = nums[0];
		for (int i = 1; i < nums.length; i++) {
			if (maxCurrent > 0) {
				maxCurrent += nums[i];
			} else {
				maxCurrent = nums[i];
			}
			if (maxCurrent > maxResult) {
				maxResult = maxCurrent;
			}
		}
		return maxResult;
	}
}