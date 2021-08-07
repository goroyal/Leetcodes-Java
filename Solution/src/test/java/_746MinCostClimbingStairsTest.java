import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _746MinCostClimbingStairsTest {
  private _746MinCostClimbingStairs solution;

  @BeforeEach
  public void setUp() {
    solution = new _746MinCostClimbingStairs();
  }

  @Test
  public void example1() {
    int[] nums = {10, 15, 20};

    int result = solution.minCostClimbingStairs(nums);

    Assertions.assertEquals(15, result);
  }

  @Test
  public void example2() {
    int[] nums = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};

    int result = solution.minCostClimbingStairs(nums);

    Assertions.assertEquals(6, result);
  }
}
