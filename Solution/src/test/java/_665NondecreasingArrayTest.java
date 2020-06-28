import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class _665NondecreasingArrayTest {
  private _665NondecreasingArray solution;

  @Before
  public void setUp() {
    solution = new _665NondecreasingArray();
  }

  @Test
  public void example1() {
    int[] nums = {4, 2, 3};

    Assert.assertTrue(solution.checkPossibility(nums));
  }

  @Test
  public void example2() {
    int[] nums = {4, 2, 1};

    Assert.assertFalse(solution.checkPossibility(nums));
  }
}
