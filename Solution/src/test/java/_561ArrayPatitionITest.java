import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class _561ArrayPatitionITest {
  private _561ArrayPatitionI solution;

  @Before
  public void setUp() {
    solution = new _561ArrayPatitionI();
  }

  @Test
  public void onlyOnePair_ReturnTheMinOneOfThePair() {
    int[] nums = {1, 2};
    int result = solution.arrayPairSum(nums);
    Assert.assertEquals(1, result);
  }

  @Test
  public void twoPairs() {
    int[] nums = {1, 6, 5, 2};
    int result = solution.arrayPairSum(nums);
    Assert.assertEquals(6, result);
  }
}
