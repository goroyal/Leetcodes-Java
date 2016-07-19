/**
 * Rotate an array of n elements to the right by k steps.
 * For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is
 * rotated to [5,6,7,1,2,3,4].
 * Note:
 * Try to come up as many solutions as you can,
 * there are at least 3 different ways to solve this problem.
 * Hint:
 * Could you do it in-place with O(1) extra space?
 * Related problem: Reverse Words in a String II.
 *
 * https://leetcode.com/problems/rotate-array/
 */
public class RotateArray {
  public void rotate(int[] nums, int k) {
    reverseWay(nums, k);
  }

  private void reverseWay(int[] nums, int k){
    if (nums == null || nums.length == 0 || k < 0){
      throw new IllegalArgumentException("Illegal Argument");
    }
    k = k % nums.length;
    int reversePoint = nums.length - k;
    reverse(nums, 0, nums.length-1);
    reverse(nums, 0, k-1);
    reverse(nums, k, nums.length-1);
  }

  private void reverse(int[] nums, int left, int right){
    if (nums == null || nums.length == 1){
      return;
    }
    while (left < right){
      int temp = nums[left];
      nums[left] = nums[right];
      nums[right] = temp;
      left++;
      right--;
    }
  }

  public static void main(String[] args){
    int[] nums = {1,2,3};
    int k = 1;
    new RotateArray().reverseWay(nums, k);
    for (int num : nums){
      System.out.println(num);
    }
  }


}
