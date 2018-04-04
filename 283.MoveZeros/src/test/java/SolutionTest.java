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
  public void test() {
    int[] nums = new int[]{0,1,0,3,12};

    solution.moveZeroes(nums);

    int[] expected = {1, 3, 12, 0, 0};
    Assert.assertArrayEquals(expected, nums);
  }
}
