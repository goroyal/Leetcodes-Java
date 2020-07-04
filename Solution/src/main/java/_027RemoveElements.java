/**
 * Given an array and a value, remove all instances of that value in place and return the new length.
 * The order of elements can be changed. It doesn't matter what you leave beyond the new length.
 * https://leetcode.com/problems/remove-element/
 * Created by goroyal on 15/12/6.
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
}
