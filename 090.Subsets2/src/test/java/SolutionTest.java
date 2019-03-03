import org.junit.Before;
import org.junit.Test;

public class SolutionTest {
  private Solution solution;

  @Before
  public void setUp() {
    solution = new Solution();
  }

  @Test
  public void test() {
    int[] nums = new int[]{1, 2, 2};

    solution.subsetsWithDup(nums);
  }
}
