import java.util.Arrays;

/**
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
 * You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2.
 * The number of elements initialized in nums1 and nums2 are m and n respectively.
 */
public class MergeSortedArray {
  public static void main(String[] args){
    int[] nums1 = new int[10];
    int[] nums2 = {2,4,5,8};
    nums1[0] = 1;
    nums1[1] = 3;
    nums1[2] = 9;

    new MergeSortedArray().merge(nums1,3,nums2,4);
    for (int i=0; i<7; i++){
      System.out.println(nums1[i]);
    }

  }
  public void merge(int[] nums1, int m, int[] nums2, int n) {
    if (nums2.length==0 || n == 0){
      return;
    }
    if (m == 0){
      System.arraycopy(nums2, 0, nums1, 0, nums2.length);
    }
    int[] copy = new int[m];
    for (int i=0; i<m; i++){
      copy[i] = nums1[i];
    }
    int i = 0, j = 0, k = 0;
    while (i < m && j < n){
      if (copy[i] <= nums2[j]){
        nums1[k++] = copy[i++];
      }else {
        nums1[k++] = nums2[j++];
      }
    }
    if (i < m){
      System.arraycopy(copy, i, nums1, k, m-i);
    }
    if (j < n){
      System.arraycopy(nums2, j, nums1, k, n-j);
    }
  }
}
