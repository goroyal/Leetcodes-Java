class Solution {
	public int findKthLargest(int[] nums, int k) {
		return quickSortApproach(nums, k);
	}

	private int quickSortApproach(int[] nums, int k) {
		quickSort(nums, 0, nums.length - 1, k);
		return nums[k - 1];
	}

	private void quickSort(int[] nums, int left, int right, int k) {
		if (left >= right) {
			return;
		}
		int pivot = nums[right];
		int partitionIndex = left;
		for (int i = left; i < right; i++) {
			if (nums[i] > pivot) {
				swap(nums, partitionIndex, i);
				partitionIndex++;
			}
		}
		swap(nums, partitionIndex, right);
		if (partitionIndex < k - 1) {
			quickSort(nums, partitionIndex + 1, right, k);
		} else if (partitionIndex > k - 1) {
			quickSort(nums, left, partitionIndex - 1, k);
		}
	}

	private int selectionSortApproach(int[] nums, int k) {
		for (int i = 0; i < k; i++) {
			int maxPos = i;
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[j] > nums[maxPos]) {
					maxPos = j;
				}
			}
			swap(nums, i, maxPos);
		}
		return nums[k - 1];
	}

	private void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
}