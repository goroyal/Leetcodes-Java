import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers and an integer k,
 * find out whether there are two distinct indices i and j in the array such that nums[i] = nums[j] and the difference between i and j is at most k.
 * Created by I320015 on 10/26/2015.
 */
public class Solution2 {
    public static void main(String[] args){
        int[] nums = new int[]{1,0,1,1};
        System.out.println(new Solution2().containsNearbyDuplicate(nums, 1));
    }
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>(nums.length);
        for (int i=0; i<nums.length; i++){
            if (map.containsKey(nums[i]) && i-map.get(nums[i])<=k){
                    return true;
            }else {
                map.put(nums[i], i);
            }
        }
        return false;
    }
}
