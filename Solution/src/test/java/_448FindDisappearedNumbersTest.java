import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class _448FindDisappearedNumbersTest {
  private _448FindDisappearedNumbers solution;

  @BeforeEach
  public void setUp() {
    solution = new _448FindDisappearedNumbers();
  }

  @Test
  public void test() {
    int[] nums = new int[]{4,3,2,7,8,2,3,1};

    List<Integer> result = solution.findDisappearedNumbers(nums);

    Assertions.assertEquals(2, result.size());
    Assertions.assertTrue(result.contains(5));
    Assertions.assertTrue(result.contains(6));
  }
}
