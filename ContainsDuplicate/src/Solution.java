import java.util.HashSet;
import java.util.Set;

/**
 * Given an array of integers, find if the array contains any duplicates.
 * Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.
 * Created by I320015 on 10/26/2015.
 */
public class Solution {
    public static void main(String[] args){
        int[] nums = new int[]{1,2,5,3,7,4};
        System.out.println(new Solution().containsDuplicate(nums));
    }
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
