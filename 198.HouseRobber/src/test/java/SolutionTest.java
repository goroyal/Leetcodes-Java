import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SolutionTest {
  private Solution solution;

  @Before
  public void setUp() {
    solution = new Solution();
  }

  @Test
  public void oneElement_JustReturnTheValue() {
    int[] nums = {2};

    int result = solution.rob(nums);

    Assert.assertEquals(2, result);
  }

  @Test
  public void twoElements_ReturnMaxOne() {
    int[] nums = {2, 4};

    int result = solution.rob(nums);

    Assert.assertEquals(4, result);
  }

  @Test
  public void threeElementsMiddleBiggerThanOthersSum_ReturnMiddleOne() {
    int[] nums = {2, 7, 4};

    int result = solution.rob(nums);

    Assert.assertEquals(7, result);
  }

  @Test
  public void threeElementsMiddleSmallerThanOthersSum_ReturnTheSum() {
    int[] nums = {2, 5, 4};

    int result = solution.rob(nums);

    Assert.assertEquals(6, result);
  }
}
