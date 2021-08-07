import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _695MaxAreaOfIslandTest {
  private _695MaxAreaOfIsland solution;

  @BeforeEach
  public void setUp() {
    solution = new _695MaxAreaOfIsland();
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

    Assertions.assertEquals(6, result);
  }

  @Test
  public void example2Return0() {
    int[][] grid = new int[][]{{0, 0, 0, 0, 0, 0, 0, 0}};

    int result = solution.maxAreaOfIsland(grid);

    Assertions.assertEquals(0, result);
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

    Assertions.assertEquals(4, result);
  }

}
