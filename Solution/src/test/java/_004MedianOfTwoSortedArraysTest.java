import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class _004MedianOfTwoSortedArraysTest {

  @Test
  public void test() {
    int[] nums1 = new int[]{1, 3};
    int[] nums2 = new int[]{2};
    double result = new _004MedianOfTwoSortedArrays().findMedianSortedArrays(nums1, nums2);

    Assertions.assertEquals(2.0d, result);
  }
}