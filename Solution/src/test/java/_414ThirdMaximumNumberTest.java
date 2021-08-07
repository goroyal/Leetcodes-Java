import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _414ThirdMaximumNumberTest {
  private _414ThirdMaximumNumber solution;

  @BeforeEach
  public void setUp() {
    solution = new _414ThirdMaximumNumber();
  }

  @Test
  public void normalDesc() {
    int[] nums = {3, 2, 1};

    int result = solution.thirdMax(nums);

    Assertions.assertEquals(1, result);
  }

  @Test
  public void normalAsc() {
    int[] nums = {1, 2, 3};

    int result = solution.thirdMax(nums);

    Assertions.assertEquals(1, result);
  }

  @Test
  public void thirdOneNotExist() {
    int[] nums = {1, 2};

    int result = solution.thirdMax(nums);

    Assertions.assertEquals(2, result);
  }

  @Test
  public void BiggerValuesContainDuplicated() {
    int[] nums = {1, 2, 2, 3};

    int result = solution.thirdMax(nums);

    Assertions.assertEquals(1, result);
  }
}
