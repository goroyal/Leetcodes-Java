import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SolutionTest {

  private Solution solution;

  @Before
  public void setUp() {
    solution = new Solution();
  }

  @Test
  public void simpleCase() {
    int[] nums = new int[]{1,1,0,1,1,1};

    int result = solution.findMaxConsecutiveOnes(nums);

    Assert.assertEquals(3, result);
  }

}
