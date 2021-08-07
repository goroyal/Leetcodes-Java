import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class _118PascalTriangleTest {
  private _118PascalTriangle solution;

  @BeforeEach
  public void setUp(){
    solution = new _118PascalTriangle();
  }

  @Test
  public void numRowsIsZero_ReturnEmptyList(){
    int numRows = 0;
    List<List<Integer>> result = solution.generate(numRows);
    Assertions.assertTrue(result.isEmpty());
  }

  @Test
  public void numRowsIsOne_ReturnOneLine(){
    int numRows = 1;
    List<List<Integer>> result = solution.generate(numRows);
    Assertions.assertEquals(1, result.size());
    Assertions.assertEquals(1, result.get(0).size());
    Assertions.assertTrue(1 == result.get(0).get(0));
  }

  @Test
  public void numRowsIsTwo_FirstLineOnlyOne_SecondLineOneAndOne(){
    int numRows = 2;
    List<List<Integer>> result = solution.generate(numRows);
    Assertions.assertEquals(2, result.size());
    Assertions.assertEquals(1, result.get(0).size());
    Assertions.assertTrue(1 == result.get(0).get(0));

    Assertions.assertEquals(2, result.get(1).size());
    Assertions.assertTrue(1 == result.get(1).get(0));
    Assertions.assertTrue(1 == result.get(1).get(1));
  }

  @Test
  public void numRowsIsThree_FirstLineOnlyOne_SecondLineOneAndOne_ThirdLineOneAndTwoAndOne(){
    int numRows = 3;
    List<List<Integer>> result = solution.generate(numRows);
    Assertions.assertEquals(3, result.size());
    Assertions.assertEquals(1, result.get(0).size());
    Assertions.assertTrue(1 == result.get(0).get(0));

    Assertions.assertEquals(2, result.get(1).size());
    Assertions.assertTrue(1 == result.get(1).get(0));
    Assertions.assertTrue(1 == result.get(1).get(1));

    Assertions.assertEquals(3, result.get(2).size());
    Assertions.assertTrue(1 == result.get(2).get(0));
    Assertions.assertTrue(2 == result.get(2).get(1));
    Assertions.assertTrue(1 == result.get(2).get(2));
  }
}
