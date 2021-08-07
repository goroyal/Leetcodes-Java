import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _561ArrayPatitionITest {
  private _561ArrayPatitionI solution;

  @BeforeEach
  public void setUp() {
    solution = new _561ArrayPatitionI();
  }

  @Test
  public void onlyOnePair_ReturnTheMinOneOfThePair() {
    int[] nums = {1, 2};
    int result = solution.arrayPairSum(nums);
    Assertions.assertEquals(1, result);
  }

  @Test
  public void twoPairs() {
    int[] nums = {1, 6, 5, 2};
    int result = solution.arrayPairSum(nums);
    Assertions.assertEquals(6, result);
  }
}
