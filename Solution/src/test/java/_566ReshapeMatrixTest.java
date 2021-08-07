import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _566ReshapeMatrixTest {
  private _566ReshapeMatrix solution;

  @BeforeEach
  public void setUp() {
    solution = new _566ReshapeMatrix();
  }

  @Test
  public void testMatrixExchangeRowColumn() {
    int[][] nums = {
        {1, 2}, {3, 4}, {5, 6}, {7, 8}
    };
    int row = 2;
    int column = 4;

    int[][] result = solution.matrixReshape(nums, row, column);

    int[][] expect = {
        {1, 2, 3, 4},
        {5, 6, 7, 8}
    };
    Assertions.assertEquals(2, result.length);
    Assertions.assertEquals(4, result[0].length);
    Assertions.assertArrayEquals(expect, result);
  }

  @Test
  public void testMatrixReshapeToOneRow() {
    int[][] nums = {
        {1, 2}, {3, 4}, {5, 6}, {7, 8}
    };
    int row = 1;
    int column = 8;

    int[][] result = solution.matrixReshape(nums, row, column);

    Assertions.assertEquals(1, result.length);
    Assertions.assertEquals(8, result[0].length);
    int[][] expect = {{1, 2, 3, 4, 5, 6, 7, 8}};
    Assertions.assertArrayEquals(expect, result);
  }

  @Test
  public void testMatrixReshapeToOneColumn() {
    int[][] nums = {
        {1, 2}, {3, 4}, {5, 6}, {7, 8}
    };
    int row = 8;
    int column = 1;

    int[][] result = solution.matrixReshape(nums, row, column);

    Assertions.assertEquals(8, result.length);
    Assertions.assertEquals(1, result[0].length);
    int[][] expect = {
        {1},
        {2},
        {3},
        {4},
        {5},
        {6},
        {7},
        {8}
    };
    Assertions.assertArrayEquals(expect, result);
  }

  @Test
  public void testReshapeFromOneRowMatrix() {
    int[][] nums = {{1, 2, 3, 4, 5, 6, 7, 8}};
    int row = 2;
    int column = 4;

    int[][] result = solution.matrixReshape(nums, row, column);

    Assertions.assertEquals(2, result.length);
    Assertions.assertEquals(4, result[0].length);
    int[][] expect = {
        {1, 2, 3, 4},
        {5, 6, 7, 8}
    };
    Assertions.assertArrayEquals(expect, result);
  }

  @Test
  public void testReshapeFromOneColumnMatrix() {
    int[][] nums = {
        {1},
        {2},
        {3},
        {4},
        {5},
        {6},
        {7},
        {8}
    };
    int row = 2;
    int column = 4;

    int[][] result = solution.matrixReshape(nums, row, column);

    Assertions.assertEquals(2, result.length);
    Assertions.assertEquals(4, result[0].length);
    int[][] expect = {
        {1, 2, 3, 4},
        {5, 6, 7, 8}
    };
    Assertions.assertArrayEquals(expect, result);
  }

  @Test
  public void testMatrixInValidReshape() {
    int[][] nums = {
        {1, 2}, {3, 4}, {5, 6}, {7, 8}
    };
    int row = 3;
    int column = 3;

    int[][] result = solution.matrixReshape(nums, row, column);

    Assertions.assertEquals(4, nums.length);
    Assertions.assertEquals(2, nums[0].length);
    int[][] expect = {
        {1, 2}, {3, 4}, {5, 6}, {7, 8}
    };
    Assertions.assertArrayEquals(expect, result);
  }
}
