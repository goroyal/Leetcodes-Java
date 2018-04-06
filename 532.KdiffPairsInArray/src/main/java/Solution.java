import java.util.HashSet;
import java.util.Set;

class Solution {
	public int findPairs(int[] nums, int k) {
		if (nums == null || nums.length == 0 || k < 0) {
			return 0;
		}
		Set<Integer> scannedUniques = new HashSet<>();
		Set<Integer> smallerNums = new HashSet<>();
		for (int i = 0; i < nums.length; i++) {
			if (scannedUniques.contains(nums[i] - k)) {
				smallerNums.add(nums[i] - k);
			}
			if (scannedUniques.contains(nums[i] + k)) {
				smallerNums.add(nums[i]);
			}
			scannedUniques.add(nums[i]);
		}
		return smallerNums.size();
	}
}