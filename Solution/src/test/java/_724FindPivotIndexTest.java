import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class _724FindPivotIndexTest {
  private _724FindPivotIndex solution;

  @Before
  public void setUp() {
    solution = new _724FindPivotIndex();
  }

  @Test
  public void example1() {
    int[] nums = {1, 7, 3, 6, 5, 6};

    int result = solution.pivotIndex(nums);

    Assert.assertEquals(3, result);
  }

  @Test
  public void example2() {
    int[] nums = {1, 2, 3};

    int result = solution.pivotIndex(nums);

    Assert.assertEquals(-1, result);
  }
}
