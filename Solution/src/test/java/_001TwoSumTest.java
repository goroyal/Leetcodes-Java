import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _001TwoSumTest {
  private _001TwoSum solution;

  @BeforeEach
  public void setUp() {
    solution = new _001TwoSum();
  }

  @Test
  public void testAscOrderArray_firstSolution() {
    int[] nums = {2, 7, 11, 15};
    int target = 13;
    int[] result = solution.twoSum(nums, target);
    Assertions.assertEquals(result.length, 2);
    Assertions.assertEquals(result[0], 0);
    Assertions.assertEquals(result[1], 2);
  }

  @Test
  public void testAscOrderArray_secondSolution() {
    int[] nums = {2, 7, 11, 15};
    int target = 13;
    int[] result = solution.twoSum2(nums, target);
    Assertions.assertEquals(result.length, 2);
    Assertions.assertEquals(result[0], 0);
    Assertions.assertEquals(result[1], 2);
  }

  @Test
  public void testDescOrderArray_firstSolution() {
    int[] nums = {15, 11, 7, 2};
    int target = 13;
    int[] result = solution.twoSum(nums, target);
    Assertions.assertEquals(result.length, 2);
    Assertions.assertEquals(result[0], 1);
    Assertions.assertEquals(result[1], 3);
  }

  @Test
  public void testDescOrderArray_secondSolution() {
    int[] nums = {15, 11, 7, 2};
    int target = 13;
    int[] result = solution.twoSum2(nums, target);
    Assertions.assertEquals(result.length, 2);
    Assertions.assertEquals(result[0], 1);
    Assertions.assertEquals(result[1], 3);
  }
}
