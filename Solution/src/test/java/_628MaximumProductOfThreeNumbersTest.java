import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _628MaximumProductOfThreeNumbersTest {
  private _628MaximumProductOfThreeNumbers solution;

  @BeforeEach
  public void setUp() {
    solution = new _628MaximumProductOfThreeNumbers();
  }

  @Test
  public void threePositive() {
    int[] nums = {1, 2, 3};

    int result = solution.maximumProduct(nums);

    Assertions.assertEquals(6, result);
  }

  @Test
  public void fourPositive() {
    int[] nums = {1, 2, 3, 4};

    int result = solution.maximumProduct(nums);

    Assertions.assertEquals(24, result);
  }

  @Test
  public void threeNegative() {
    int[] nums = {-1, -2, -3};

    int result = solution.maximumProduct(nums);

    Assertions.assertEquals(-6, result);
  }

  @Test
  public void twoNegativeTwoPositive() {
    int[] nums = {8, -2, -3, 3};

    int result = solution.maximumProduct(nums);

    Assertions.assertEquals(48, result);
  }
}
