import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class _228SummaryRangesTest {
  @Test
  public void test1() {
    int[] nums = new int[]{0, 1, 2, 4, 5, 7};
    List<String> result = new _228SummaryRanges().summaryRanges(nums);

    Assert.assertEquals(3, result.size());
    Assert.assertEquals("0->2", result.get(0));
    Assert.assertEquals("4->5", result.get(1));
    Assert.assertEquals("7", result.get(2));
  }

  @Test
  public void test2() {
    int[] nums = new int[]{0,2,3,4,6,8,9};
    List<String> result = new _228SummaryRanges().summaryRanges(nums);

    Assert.assertEquals(4, result.size());
    Assert.assertEquals("0", result.get(0));
    Assert.assertEquals("2->4", result.get(1));
    Assert.assertEquals("6", result.get(2));
    Assert.assertEquals("8->9", result.get(3));
  }
}
