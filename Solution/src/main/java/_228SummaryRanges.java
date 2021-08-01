import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 给定一个无重复元素的有序整数数组 nums 。
 *
 * 返回一个最小有序区间范围列表，恰好覆盖数组中所有数字。
 * 也就是说，nums的每个元素都恰好被某个区间范围所覆盖，并且不存在一个数字x属于某个区间范围但不属于nums。
 *
 */
public class _228SummaryRanges {
  public List<String> summaryRanges(int[] nums) {
    List<String> result = new ArrayList<>();
    if (nums == null) {
      return result;
    }
    int i = 0;
    while (i < nums.length) {
      StringBuilder builder = new StringBuilder();
      if (builder.length() == 0) {
        builder.append(nums[i]);
      }
      while (i + 1 < nums.length && nums[i+1] == nums[i] + 1) {
        i++;
      }
      if (i > 0 && nums[i-1] + 1 == nums[i]) {
        builder.append("->");
        builder.append(nums[i]);
      }
      result.add(builder.toString());
      i++;
    }
    return result;
  }
}
