import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _532KdiffPairsInArrayTest {
  private _532KdiffPairsInArray solution;

  @BeforeEach
  public void setUp() {
    solution = new _532KdiffPairsInArray();
  }

  @Test
  public void example1() {
    int[] nums = {3, 1, 4, 1, 5};
    int k = 2;

    int result = solution.findPairs(nums, k);

    Assertions.assertEquals(2, result);
  }

  @Test
  public void example2() {
    int[] nums = {1, 2, 3, 4, 5};
    int k = 1;

    int result = solution.findPairs(nums, k);

    Assertions.assertEquals(4, result);
  }

  @Test
  public void example3() {
    int[] nums = {1, 3, 1, 5, 4};
    int k = 0;

    int result = solution.findPairs(nums, k);

    Assertions.assertEquals(1, result);
  }

  @Test
  public void example4() {
    int[] nums = {1, 1, 1, 2, 1};
    int k = 1;

    int result = solution.findPairs(nums, k);

    Assertions.assertEquals(1, result);
  }
}
