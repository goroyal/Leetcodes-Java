/**
 * Given an array and a value, remove all instances of that value in place and return the new length.
 * The order of elements can be changed. It doesn't matter what you leave beyond the new length.
 * Created by dgq on 15/9/24.
 */
public class Solution {
	public int removeElement(int[] nums, int val) {
		int p=0,q=0;
		while (q < nums.length){
			if (nums[q] == val){
				q++;
			}
			if (q != nums.length && nums[q] != val){
				nums[p] = nums[q];
				p++;
				q++;
			}
		}
		return p;
	}

	public static void main(String[] args){
		int[] nums = {3,3};
		System.out.println(new Solution().removeElement(nums,3));
	}
}
