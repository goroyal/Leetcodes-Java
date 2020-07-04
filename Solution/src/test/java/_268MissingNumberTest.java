import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class _268MissingNumberTest {
  private _268MissingNumber solution;

  @Before
  public void setUp() {
    solution = new _268MissingNumber();
  }

  @Test
  public void givenExampleArray_ReturnSameResult() {
    int[] input = new int[]{0, 1, 3};
    int result = solution.missingNumber(input);
    Assert.assertEquals(2, result);
  }

  @Test
  public void givenArrayWithoutHead_ReturnZero() {
    int[] input = new int[]{1, 2, 3};
    int result = solution.missingNumber(input);
    Assert.assertEquals(0, result);
  }

  @Test
  public void giveArrayWithoutTail_ReturnNumSize() {
    int[] input = new int[]{0, 1, 2};
    int result = solution.missingNumber(input);
    Assert.assertEquals(3, result);
  }

  @Test
  public void givenArrayOutOfOrder_ReturnTheMissingNumber() {
    int[] input = new int[]{2, 1, 4, 0};
    int result = solution.missingNumber(input);
    Assert.assertEquals(3, result);
  }
}
