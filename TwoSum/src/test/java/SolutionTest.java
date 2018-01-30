import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by dgq on 2017/7/23.
 */
public class SolutionTest {
  private Solution solution;

  @Before
  public void setUp() {
    solution = new Solution();
  }

  @Test
  public void testAscOrderArray_firstSolution() {
    int[] nums = {2, 7, 11, 15};
    int target = 13;
    int[] result = solution.twoSum(nums, target);
    Assert.assertEquals(result.length, 2);
    Assert.assertEquals(result[0], 0);
    Assert.assertEquals(result[1], 2);
  }

  @Test
  public void testAscOrderArray_secondSolution() {
    int[] nums = {2, 7, 11, 15};
    int target = 13;
    int[] result = solution.twoSum2(nums, target);
    Assert.assertEquals(result.length, 2);
    Assert.assertEquals(result[0], 0);
    Assert.assertEquals(result[1], 2);
  }

  @Test
  public void testDescOrderArray_firstSolution() {
    int[] nums = {15, 11, 7, 2};
    int target = 13;
    int[] result = solution.twoSum(nums, target);
    Assert.assertEquals(result.length, 2);
    Assert.assertEquals(result[0], 1);
    Assert.assertEquals(result[1], 3);
  }

  @Test
  public void testDescOrderArray_secondSolution() {
    int[] nums = {15, 11, 7, 2};
    int target = 13;
    int[] result = solution.twoSum2(nums, target);
    Assert.assertEquals(result.length, 2);
    Assert.assertEquals(result[0], 1);
    Assert.assertEquals(result[1], 3);
  }
}
