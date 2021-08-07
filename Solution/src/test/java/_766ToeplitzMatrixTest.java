import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _766ToeplitzMatrixTest {
  private _766ToeplitzMatrix solution;

  @BeforeEach
  public void setUp() {
    solution = new _766ToeplitzMatrix();
  }

  @Test
  public void caseInExample() {
    int[][] matrix = new int[][]{{1,2,3,4},{5,1,2,3},{9,5,1,2}};
    boolean result = solution.isToeplitzMatrix(matrix);
    Assertions.assertTrue(result);
  }

  @Test
  public void complex() {
    int[][] matrix = new int[][]{{53,64,90,98,34},{91,53,64,90,98},{17,91,53,64,90}};
    boolean result = solution.isToeplitzMatrix(matrix);
    Assertions.assertTrue(result);
  }

  @Test
  public void simple() {
    int[][] matrix = new int[][]{{1,2},{2,2}};
    boolean result = solution.isToeplitzMatrix(matrix);
    Assertions.assertFalse(result);
  }

  @Test
  public void resultFalse() {
    int[][] matrix = new int[][]{{11,74,0,93},{40,11,74,7}};
    boolean result = solution.isToeplitzMatrix(matrix);
    Assertions.assertFalse(result);
  }
}
