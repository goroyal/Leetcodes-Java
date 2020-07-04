import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class _221MaximalSquareTest {
  private _221MaximalSquare solution;

  @Before
  public void setUp() {
    solution = new _221MaximalSquare();
  }

  @Test
  public void example1() {
    char[][] matrix = {
        {'1', '0', '1', '0', '0'},
        {'1', '0', '1', '1', '1'},
        {'1', '1', '1', '1', '1'},
        {'1', '0', '0', '1', '0'}
    };
    int result = solution.maximalSquareLessSpace(matrix);
    Assert.assertEquals(4, result);
  }

  @Test
  public void example2() {
    char[][] matrix = {
        {'1', '0', '1', '1', '1'},
        {'0', '1', '0', '1', '0'},
        {'1', '1', '0', '1', '1'},
        {'1', '1', '0', '1', '1'},
        {'0', '1', '1', '1', '1'}
    };
    int result = solution.maximalSquareLessSpace(matrix);
    Assert.assertEquals(4, result);
  }
}
