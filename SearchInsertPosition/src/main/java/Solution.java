/**
 * Created by dgq on 2017/8/27.
 */
public class Solution {
	public int searchInsert(int[] nums, int target) {
		if (nums.length == 0){
			return 0;
		}
		for (int i = 0; i < nums.length; i++){
			if (nums[i] >= target){
				return i;
			}
		}
		// means that all elements in nums smaller than target
		return nums.length;
	}
}
