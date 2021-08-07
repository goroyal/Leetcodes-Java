import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _605CanPlaceFlowersTest {
  private _605CanPlaceFlowers solution;

  @BeforeEach
  public void setUp() {
    solution = new _605CanPlaceFlowers();
  }

  @Test
  public void oneEmpty_CanPlaceOneFlower() {
    int[] nums = {0};

    Assertions.assertTrue(solution.canPlaceFlowers(nums, 1));
  }

  @Test
  public void twoEmpty_CannotPlaceTwoFlowers() {
    int[] nums = {0, 0};

    Assertions.assertFalse(solution.canPlaceFlowers(nums, 2));
  }

  @Test
  public void fourEmpty_CannotPlaceThreeFlowers() {
    int[] nums = {0, 0, 0, 0};

    Assertions.assertFalse(solution.canPlaceFlowers(nums, 3));
  }

  @Test
  public void oneEmptyBesideOneFlower_NoFlowerCanPlace() {
    int[] nums = {1, 0};

    Assertions.assertFalse(solution.canPlaceFlowers(nums, 1));
  }

  @Test
  public void emptyBesideEachFlower_NoFlowerCanPlace() {
    int[] nums = {1, 0, 1, 0, 1};

    Assertions.assertFalse(solution.canPlaceFlowers(nums, 1));
  }

  @Test
  public void twoEmptyAndOneEmpty_CanPlaceOneFlower() {
    int[] nums = {0, 0, 1, 0, 1};

    Assertions.assertTrue(solution.canPlaceFlowers(nums, 1));
  }

  @Test
  public void threeEmpty_CanPlaceOneFlower() {
    int[] nums = {1, 0, 0, 0, 1};

    Assertions.assertTrue(solution.canPlaceFlowers(nums, 1));
  }

  @Test
  public void threeEmpty_CannotPlaceTwoFlowers() {
    int[] nums = {1, 0, 0, 0, 1};

    Assertions.assertFalse(solution.canPlaceFlowers(nums, 2));
  }

  @Test
  public void threeEmptyAndTwoEmptyAtBorder_CanPlaceTwoFlowers() {
    int[] nums = {1, 0, 0, 0, 1, 0, 0};

    Assertions.assertTrue(solution.canPlaceFlowers(nums, 2));
  }

  @Test
  public void fourEmptyAtLeftBorderAndTwoEmptyAtRightBorder_CanPlaceThreeFlowers() {
    int[] nums = {0, 0, 0, 0, 1, 0, 0};

    Assertions.assertTrue(solution.canPlaceFlowers(nums, 3));
  }
}
