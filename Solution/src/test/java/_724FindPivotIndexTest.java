import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _724FindPivotIndexTest {
  private _724FindPivotIndex solution;

  @BeforeEach
  public void setUp() {
    solution = new _724FindPivotIndex();
  }

  @Test
  public void example1() {
    int[] nums = {1, 7, 3, 6, 5, 6};

    int result = solution.pivotIndex(nums);

    Assertions.assertEquals(3, result);
  }

  @Test
  public void example2() {
    int[] nums = {1, 2, 3};

    int result = solution.pivotIndex(nums);

    Assertions.assertEquals(-1, result);
  }
}
