import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class _643MaximumAverageSubArrayITest {
  private _643MaximumAverageSubArrayI solution;

  @Before
  public void setUp() {
    solution = new _643MaximumAverageSubArrayI();
  }

  @Test
  public void positiveAndNegative() {
    int[] nums = new int[]{1, 12, -5, -6, 50, 3};
    double result = solution.findMaxAverage(nums, 4);
    Assert.assertEquals(12.75, result, 0);
  }

  @Test
  public void allPositive() {
    int[] nums = new int[]{1, 12, 5, 6, 50, 3};
    double result = solution.findMaxAverage(nums, 4);
    Assert.assertEquals(18.25, result, 0);
  }

  @Test
  public void allNegative() {
    int[] nums = new int[]{-1, -12, -5, -6, -50, -3};
    double result = solution.findMaxAverage(nums, 4);
    Assert.assertEquals(-6, result, 0);
  }

  @Test
  public void kEqualsNumsLength() {
    int[] nums = new int[]{1, 12, -5, -6, 50, 3};
    double result = solution.findMaxAverage(nums, 6);
    Assert.assertEquals(9.17, result, 2);
  }

  @Test
  public void containsDuplicateElement() {
    int[] nums = new int[]{7, 4, 5, 8, 8, 3, 9, 8, 7, 6};
    double result = solution.findMaxAverage(nums, 7);
    Assert.assertEquals(7.0, result, 0);
  }

  @Test
  public void kIsSmallAndMaxIsInLast() {
    int[] nums = new int[]{6, 8, 6, 8, 0, 4, 1, 2, 9, 9};
    double result = solution.findMaxAverage(nums, 2);
    Assert.assertEquals(9, result, 0);
  }
}
