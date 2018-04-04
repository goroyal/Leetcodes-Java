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
  public void caseInExample() {
    int[][] matrix = new int[][]{{1,2,3,4},{5,1,2,3},{9,5,1,2}};
    boolean result = solution.isToeplitzMatrix(matrix);
    Assert.assertTrue(result);
  }

  @Test
  public void complex() {
    int[][] matrix = new int[][]{{53,64,90,98,34},{91,53,64,90,98},{17,91,53,64,90}};
    boolean result = solution.isToeplitzMatrix(matrix);
    Assert.assertTrue(result);
  }

  @Test
  public void simple() {
    int[][] matrix = new int[][]{{1,2},{2,2}};
    boolean result = solution.isToeplitzMatrix(matrix);
    Assert.assertFalse(result);
  }

  @Test
  public void resultFalse() {
    int[][] matrix = new int[][]{{11,74,0,93},{40,11,74,7}};
    boolean result = solution.isToeplitzMatrix(matrix);
    Assert.assertFalse(result);
  }

}
