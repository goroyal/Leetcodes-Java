import java.util.ArrayList;
import java.util.List;

class Solution {
  public List<Integer> findDisappearedNumbers(int[] nums) {
    List<Integer> result = new ArrayList<>(nums.length);

    for (int i = 0; i < nums.length; i++) {
	    // 第i个数的值所表示的位置，将它设为负的。
	    int position = Math.abs(nums[i]) - 1;
	    if (nums[position] > 0) {
		    nums[position] = -nums[position];
      }
    }
	  // 到最后，如果缺少哪些数，那么这些数所指向的位置的值就没有更改过
    for (int i = 0; i < nums.length; i++) {
	    if (nums[i] > 0) {
		    result.add(i + 1);
      }
    }
    return result;
  }
}