import java.util.*;

/**
 * Given two integer arrays nums1 and nums2, return an array of their intersection. <br/>
 * Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.<br/>
 * <br/>
 * Follow up:<br/>
 * - What if the given array is already sorted? How would you optimize your algorithm?<br/>
 * - What if nums1's size is small compared to nums2's size? Which algorithm is better?<br/>
 * - What if elements of nums2 are stored on disk, and the memory is limited such that you cannot load all elements into the memory at once?<br/>
 */
public class _350IntersectionOfTwoArraysII {
  public int[] intersect2(int[] nums1, int[] nums2) {
    return null;
  }

  public int[] intersect1(int[] nums1, int[] nums2) {
    Map<Integer, Integer> map1 = new HashMap<>();
    for (int num : nums1) {
      if (map1.containsKey(num)) {
        map1.put(num, map1.get(num) + 1);
      } else {
        map1.put(num, 1);
      }
    }

    List<Integer> intersection = new ArrayList<>();
    Map<Integer, Integer> map2 = new HashMap<>();
    for (int num : nums2) {
      if (map2.containsKey(num)) {
        map2.put(num, map2.get(num) + 1);
      } else {
        map2.put(num, 1);
      }
    }
    for (Map.Entry<Integer, Integer> entry : map1.entrySet()) {
      if (map2.containsKey(entry.getKey())) {
        int count = Math.min(entry.getValue(), map2.get(entry.getKey()));
        for (int i = 0; i < count; i++) {
          intersection.add(entry.getKey());
        }
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
