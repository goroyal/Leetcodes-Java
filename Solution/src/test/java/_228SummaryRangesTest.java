import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class _228SummaryRangesTest {
  @Test
  public void test1() {
    int[] nums = new int[]{0, 1, 2, 4, 5, 7};
    List<String> result = new _228SummaryRanges().summaryRanges(nums);

    Assertions.assertEquals(3, result.size());
    Assertions.assertEquals("0->2", result.get(0));
    Assertions.assertEquals("4->5", result.get(1));
    Assertions.assertEquals("7", result.get(2));
  }

  @Test
  public void test2() {
    int[] nums = new int[]{0,2,3,4,6,8,9};
    List<String> result = new _228SummaryRanges().summaryRanges(nums);

    Assertions.assertEquals(4, result.size());
    Assertions.assertEquals("0", result.get(0));
    Assertions.assertEquals("2->4", result.get(1));
    Assertions.assertEquals("6", result.get(2));
    Assertions.assertEquals("8->9", result.get(3));
  }
}
