import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SolutionTest {
  private Solution solution;

  @Before
  public void setUp() {
    solution = new Solution();
  }

  @Test
  public void example1Return6() {
    int[][] grid = new int[][]{
        {0,0,1,0,0,0,0,1,0,0,0,0,0},
        {0,0,0,0,0,0,0,1,1,1,0,0,0},
        {0,1,1,0,1,0,0,0,0,0,0,0,0},
        {0,1,0,0,1,1,0,0,1,0,1,0,0},
        {0,1,0,0,1,1,0,0,1,1,1,0,0},
        {0,0,0,0,0,0,0,0,0,0,1,0,0},
        {0,0,0,0,0,0,0,1,1,1,0,0,0},
        {0,0,0,0,0,0,0,1,1,0,0,0,0}};

    int result = solution.maxAreaOfIsland(grid);

    Assert.assertEquals(6, result);
  }

  @Test
  public void example2Return0() {
    int[][] grid = new int[][]{{0, 0, 0, 0, 0, 0, 0, 0}};

    int result = solution.maxAreaOfIsland(grid);

    Assert.assertEquals(0, result);
  }

  @Test
  public void example3Return4() {
    int[][] grid = new int[][]{
        {1,1,0,0,0},
        {1,1,0,0,0},
        {0,0,0,1,1},
        {0,0,0,1,1}
    };

    int result = solution.maxAreaOfIsland(grid);

    Assert.assertEquals(4, result);
  }



}
