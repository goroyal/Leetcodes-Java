/**
 * Created by dgq on 2017/7/23.
 */
public class Solution {
	/**
	 * Get the two indexes where the values' sum equals to target
	 *
	 * @param numbers array sorted in ascending order
	 * @param target  sum target
	 * @return two indexes
	 */
	public int[] twoSum(int[] numbers, int target) {
		int[] result = new int[2];
		int low = 0;
		int high = numbers.length - 1;
		while (low < high) {
			int sum = numbers[low] + numbers[high];
			if (sum == target) {
				// The indexes are not zero-based
				result[0] = low + 1;
				result[1] = high + 1;
				break;
			} else if (sum < target) {
				low++;
			} else {
				high--;
			}
		}
		return result;
	}
}
