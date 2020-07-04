public class _414ThirdMaximumNumber {
  public int thirdMax(int[] nums) {
    Integer max = null;
    Integer secondMax = null;
    Integer thirdMax = null;

    for (Integer num : nums) {
      if (num.equals(max) || num.equals(secondMax) || num.equals(thirdMax)) {
        // 跳过重复的
        continue;
      }
      if (max == null || num > max) {
        // 当已知最大值升级时，第二和第三大也要相应升级
        thirdMax = secondMax;
        secondMax = max;
        max = num;
      } else if (secondMax == null || num > secondMax) {
        thirdMax = secondMax;
        secondMax = num;
      } else if (thirdMax == null || num > thirdMax) {
        thirdMax = num;
      }
    }
    return thirdMax == null ? max : thirdMax;
  }
}
