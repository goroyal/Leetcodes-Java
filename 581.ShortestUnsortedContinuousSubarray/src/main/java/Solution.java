class Solution {
	public int findUnsortedSubarray(int[] nums) {
		int length = nums.length;
		int min = nums[length - 1], max = nums[0];
		int left = length, right = 0;
		for (int i = 0; i < length; i++) {
			max = Math.max(max, nums[i]);
			min = Math.min(min, nums[length - 1 - i]);
			if (max > nums[i]) {
				right = i;
			}
			if (min < nums[length - 1 - i]) {
				left = length - 1 - i;
			}
		}
		return right > left ? right - left + 1 : 0;
	}

	/**
	 * Time limit exceed approach
	 *
	 * @param nums
	 * @return
	 */
	public int inlineLoopWay(int[] nums) {
		int left = nums.length, right = 0;
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] > nums[j]) {
					left = Math.min(left, i);
					right = Math.max(right, j);
				}
			}
		}
		return right > left ? right - left + 1 : 0;
	}
}