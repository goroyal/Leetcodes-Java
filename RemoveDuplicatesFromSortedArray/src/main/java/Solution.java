/**
 * Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.
 * Do not allocate extra space for another array, you must do this in place with constant memory.
 * For example,
 * Given input array nums = [1,1,2],
 * Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively.
 * It doesn't matter what you leave beyond the new length.
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 */
public class Solution {
  public int removeDuplicates(int[] nums) {
    int p,q;
    p = 0;
    q = 1;
    while (q < nums.length){
      if (nums[p] == nums[q]){
        q++;
      }
      if (q < nums.length && nums[p] < nums[q]){
        p++;
        nums[p] = nums[q];
      }
    }
    return p+1;
  }
}

