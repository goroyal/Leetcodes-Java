import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _581ShortestUnsortedContinuousSubarrayTest {
  private _581ShortestUnsortedContinuousSubarray solution;

  @BeforeEach
  public void setUp() {
    solution = new _581ShortestUnsortedContinuousSubarray();
  }

  @Test
  public void example() {
    int[] nums = {2, 6, 4, 8, 10, 9, 15};

    int result = solution.findUnsortedSubarray(nums);

    Assertions.assertEquals(5, result);
  }

  @Test
  public void ascArray() {
    int[] nums = {1, 2, 3, 4, 5, 6};

    int result = solution.findUnsortedSubarray(nums);

    Assertions.assertEquals(0, result);
  }

  @Test
  public void twoAscSubarrays() {
    int[] nums = {4, 6, 9, 1, 2, 3};

    int result = solution.findUnsortedSubarray(nums);

    Assertions.assertEquals(6, result);
  }

  //	@Test
  public void twoAscSubarrays2() {
    int[] nums = {4, 6, 8, 5, 7, 9};

    int result = solution.findUnsortedSubarray(nums);

    Assertions.assertEquals(4, result);
  }
}
