class Solution {
  public int findMaxConsecutiveOnes(int[] nums) {
    int result = 0;
    int count = 0;
    for (int item : nums) {
      if (item == 1) {
        count++;
      } else {
        count = 0;
      }
      if (count > result) {
        result = count;
      }
    }
    return result;
  }
}