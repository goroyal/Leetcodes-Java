import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class _118PascalTriangleTest {
  private _118PascalTriangle solution;

  @Before
  public void setUp(){
    solution = new _118PascalTriangle();
  }

  @Test
  public void numRowsIsZero_ReturnEmptyList(){
    int numRows = 0;
    List<List<Integer>> result = solution.generate(numRows);
    Assert.assertTrue(result.isEmpty());
  }

  @Test
  public void numRowsIsOne_ReturnOneLine(){
    int numRows = 1;
    List<List<Integer>> result = solution.generate(numRows);
    Assert.assertEquals(1, result.size());
    Assert.assertEquals(1, result.get(0).size());
    Assert.assertTrue(1 == result.get(0).get(0));
  }

  @Test
  public void numRowsIsTwo_FirstLineOnlyOne_SecondLineOneAndOne(){
    int numRows = 2;
    List<List<Integer>> result = solution.generate(numRows);
    Assert.assertEquals(2, result.size());
    Assert.assertEquals(1, result.get(0).size());
    Assert.assertTrue(1 == result.get(0).get(0));

    Assert.assertEquals(2, result.get(1).size());
    Assert.assertTrue(1 == result.get(1).get(0));
    Assert.assertTrue(1 == result.get(1).get(1));
  }

  @Test
  public void numRowsIsThree_FirstLineOnlyOne_SecondLineOneAndOne_ThirdLineOneAndTwoAndOne(){
    int numRows = 3;
    List<List<Integer>> result = solution.generate(numRows);
    Assert.assertEquals(3, result.size());
    Assert.assertEquals(1, result.get(0).size());
    Assert.assertTrue(1 == result.get(0).get(0));

    Assert.assertEquals(2, result.get(1).size());
    Assert.assertTrue(1 == result.get(1).get(0));
    Assert.assertTrue(1 == result.get(1).get(1));

    Assert.assertEquals(3, result.get(2).size());
    Assert.assertTrue(1 == result.get(2).get(0));
    Assert.assertTrue(2 == result.get(2).get(1));
    Assert.assertTrue(1 == result.get(2).get(2));
  }
}
