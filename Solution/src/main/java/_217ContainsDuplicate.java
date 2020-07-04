import java.util.HashSet;
import java.util.Set;

/**
 * Given an array of integers, find if the array contains any duplicates.
 * Your function should return true if any value appears at least twice in the array,
 * and it should return false if every element is distinct.
 * https://leetcode.com/problems/contains-duplicate/
 */
public class _217ContainsDuplicate {
  public boolean containsDuplicate(int[] nums) {
    Set<Integer> set = new HashSet<>(nums.length);
    for (int item : nums){
      if (set.contains(item)){
        return true;
      }else {
        set.add(item);
      }
    }
    return false;
  }
}
