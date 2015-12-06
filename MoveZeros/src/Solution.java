/**
 * Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 * For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].
 * Note:
 * You must do this in-place without making a copy of the array.
 * Minimize the total number of operations.
 * Created by dgq on 15/9/24.
 * 难度：容易
 */
public class Solution {
	public void moveZeroes(int[] nums) {
		int i = 0;
		for(int num : nums){
			if(num != 0){
				nums[i++] = num;
			}
		}
		while (i < nums.length){
			nums[i++] = 0;
		}
	}

	public static void main(String[] args){
		int[] nums = new int[]{0,1,0,3,12};
		new Solution().moveZeroes(nums);
		for (int num : nums){
			System.out.println(num);
		}

	}
}
