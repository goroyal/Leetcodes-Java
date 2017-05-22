/**
 * Given an array and a value, remove all instances of that value in place and return the new length.
 * The order of elements can be changed. It doesn't matter what you leave beyond the new length.
 * https://leetcode.com/problems/remove-element/
 * Created by dgq on 15/12/6.
 */
public class RemoveElement {
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
		int[] nums = {3,2,2,3};
		System.out.println(new RemoveElement().removeElement(nums,3));
		for (int num : nums){
			System.out.print(num);
		}
		System.out.println();
	}
}
