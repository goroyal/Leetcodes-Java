import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/two-sum/
 * Created by dgq on 16/6/10.
 */
public class Solution {
	/**
	 * Time complexity: O(n2)
	 * Space complexity: O(1)
	 * @param nums
	 * @param target
	 * @return
	 */
	int[] twoSum(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++){
			for (int j = i + 1; j < nums.length; j++){
				if (nums[i] + nums[j] == target){
					return new int[]{i, j};
				}
			}
		}
		throw new IllegalArgumentException("No two sum solution");
	}

	/**
	 * Time complexity: O(n)
	 * Space complexity: O(n)
	 * @param nums
	 * @param target
	 * @return
	 */
	int[] twoSum2(int[] nums, int target){
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++){
			int value = target - nums[i];
			if (map.containsKey(value)){
				return new int[]{map.get(value), i};
			}
			map.put(nums[i], i);
		}
		throw new IllegalArgumentException("No two sum solution");
	}
}
