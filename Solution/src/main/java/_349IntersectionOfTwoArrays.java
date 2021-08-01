import java.util.HashSet;
import java.util.Set;

public class _349IntersectionOfTwoArrays {
  public int[] intersection(int[] nums1, int[] nums2) {
    if (nums1 == null || nums1.length == 0 || nums2 == null || nums2.length == 0) {
      return null;
    }
    Set<Integer> set = new HashSet<>();
    for (int num : nums1) {
      set.add(num);
    }
    Set<Integer> intersection= new HashSet<>();
    for (int num : nums2) {
      if (set.contains(num)) {
        intersection.add(num);
      }
    }
    int[] result = new int[intersection.size()];
    int i = 0;
    for (int num : intersection) {
      result[i++] = num;
    }
    return result;
  }
}
