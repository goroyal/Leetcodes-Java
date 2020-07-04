import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class _448FindDisappearedNumbersTest {
  private _448FindDisappearedNumbers solution;

  @Before
  public void setUp() {
    solution = new _448FindDisappearedNumbers();
  }

  @Test
  public void test() {
    int[] nums = new int[]{4,3,2,7,8,2,3,1};

    List<Integer> result = solution.findDisappearedNumbers(nums);

    Assert.assertEquals(2, result.size());
    Assert.assertTrue(result.contains(5));
    Assert.assertTrue(result.contains(6));
  }
}
