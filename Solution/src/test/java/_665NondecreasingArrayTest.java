import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _665NondecreasingArrayTest {
  private _665NondecreasingArray solution;

  @BeforeEach
  public void setUp() {
    solution = new _665NondecreasingArray();
  }

  @Test
  public void example1() {
    int[] nums = {4, 2, 3};

    Assertions.assertTrue(solution.checkPossibility(nums));
  }

  @Test
  public void example2() {
    int[] nums = {4, 2, 1};

    Assertions.assertFalse(solution.checkPossibility(nums));
  }
}
