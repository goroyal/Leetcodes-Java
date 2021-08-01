public class _004MedianOfTwoSortedArrays {
  public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    int length1 = nums1.length;
    int length2 = nums2.length;
    int[] nums3 = new int[length1 + length2];
    int i = 0, j = 0, k = 0;
    while (i < length1 && j < length2) {
      if (nums1[i] < nums2[j]) {
        nums3[k++] = nums1[i++];
      } else {
        nums3[k++] = nums2[j++];
      }
    }
    if (i < length1) {
      while (i < length1) {
        nums3[k++] = nums1[i++];
      }
    }
    if (j < length2) {
      while (j < length2) {
        nums3[k++] = nums2[j++];
      }
    }
    return nums3.length % 2 == 0
        ? (nums3[nums3.length/2 - 1] + nums3[nums3.length/2]) / 2.0
        : nums3[nums3.length/2];
  }
}
