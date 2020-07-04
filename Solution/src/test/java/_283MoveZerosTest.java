import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class _283MoveZerosTest {
  private _283MoveZeros solution;

  @Before
  public void setUp() {
    solution = new _283MoveZeros();
  }

  @Test
  public void test() {
    int[] nums = new int[]{0,1,0,3,12};

    solution.moveZeroes(nums);

    int[] expected = {1, 3, 12, 0, 0};
    Assert.assertArrayEquals(expected, nums);
  }
}
