import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _198HouseRobberTest {
  private _198HouseRobber solution;

  @BeforeEach
  public void setUp() {
    solution = new _198HouseRobber();
  }

  @Test
  public void oneElement_JustReturnTheValue() {
    int[] nums = {2};

    int result = solution.rob(nums);

    Assertions.assertEquals(2, result);
  }

  @Test
  public void twoElements_ReturnMaxOne() {
    int[] nums = {2, 4};

    int result = solution.rob(nums);

    Assertions.assertEquals(4, result);
  }

  @Test
  public void threeElementsMiddleBiggerThanOthersSum_ReturnMiddleOne() {
    int[] nums = {2, 7, 4};

    int result = solution.rob(nums);

    Assertions.assertEquals(7, result);
  }

  @Test
  public void threeElementsMiddleSmallerThanOthersSum_ReturnTheSum() {
    int[] nums = {2, 5, 4};

    int result = solution.rob(nums);

    Assertions.assertEquals(6, result);
  }
}
