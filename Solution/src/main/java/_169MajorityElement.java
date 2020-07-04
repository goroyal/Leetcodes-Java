import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of size n, find the majority element.
 * The majority element is the element that appears more than ⌊ n/2 ⌋ times.
 * You may assume that the array is non-empty and the majority element
 * always exist in the array.
 * https://leetcode.com/problems/majority-element/
 * Created by goroyal on 16/7/19.
 */
public class _169MajorityElement {
	public int majorityElement(int[] nums) {
		return sortWay(nums);
	}

	/**
	 * 先将数组排序,既然题目说了肯定有这么个majority number,
	 * 那么在数组中间的必定是这个数
	 * 时间复杂度:O(nlogn)
	 * @param nums
	 * @return
	 */
	private int sortWay(int[] nums){
		Arrays.sort(nums);
		return nums[nums.length/2];
	}
	/**
	 * 用HashMap,比较简单
	 * 时间复杂度:O(n)
	 * @param nums
	 * @return
	 */
	private int hashMapWay(int[] nums){
		Map<Integer, Integer> map = new HashMap<>();
		for (int num : nums){
			if (map.containsKey(num)){
				int value = map.get(num);
				map.put(num, value+1);
			}else {
				map.put(num, 1);
			}
		}
		int time = 0;
		int result = 0;
		for (Map.Entry<Integer, Integer> entry : map.entrySet()){
			if (entry.getValue() >= nums.length/2 && entry.getValue() > time){
				time = entry.getValue();
				result = entry.getKey();
			}
		}
		return result;
	}

	public static void main(String[] args){
		int[] nums = {3,2,3,1};
		int result = new _169MajorityElement().majorityElement(nums);
		System.out.println(result);
	}
}
