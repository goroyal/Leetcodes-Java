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

	public int[] twoSumWithBinarySearch(int[] numbers, int target) {
		for (int i = 0; i < numbers.length; i++) {
			int position = binarySearch(numbers, target - numbers[i], i+1);
			if (position != -1) {
				return new int[]{i+1, position+1};
			}
		}
		return new int[]{0, 0};
	}

	/**
	 *
	 * @param numbers array
	 * @param searchValue
	 * @param start
	 * @return the index of the searchValue
	 */
	int binarySearch(int[] numbers, int searchValue, int start) {
		int left = start;
		int right = numbers.length - 1;
		while (left <= right) {
			int middle = (left + right)/2;
			if (numbers[middle] == searchValue) {
				return middle;
			} else if (numbers[middle] > searchValue) {
				right = middle - 1;
			} else if (numbers[middle] < searchValue) {
				left = middle + 1;
			}
		}
		return -1;
	}
}
