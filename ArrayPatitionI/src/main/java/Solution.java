import java.util.Arrays;

/**
 * Created by dgq on 2017/7/23.
 */
public class Solution {
	public int arrayPairSum(int[] nums) {
		Arrays.sort(nums);
		int result = 0;
		for (int i = 0; i < nums.length; i += 2) {
			result += nums[i];
		}
		return result;
	}
}
