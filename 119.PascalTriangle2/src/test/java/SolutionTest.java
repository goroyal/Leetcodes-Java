import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class SolutionTest {
  private Solution solution;

  @Before
  public void setUp(){
    solution = new Solution();
  }

  @Test
  public void numRowsIsZero_IsOne(){
    int numRows = 0;
    List<Integer> result = solution.getRow(numRows);
    Assert.assertEquals(1, result.size());
    Assert.assertTrue(1 == result.get(0));
  }

  @Test
  public void numRowsIsOne_ResultIsOneAndOne(){
    int numRows = 1;
    List<Integer> result = solution.getRow(numRows);
    Assert.assertEquals(2, result.size());
    Assert.assertTrue(1 == result.get(0));
    Assert.assertTrue(1 == result.get(1));
  }

  @Test
  public void numRowsIsTwo_ResultIsOneAndTwoAndOne(){
    int numRows = 2;
    List<Integer> result = solution.getRow(numRows);
    Assert.assertEquals(3, result.size());
    Assert.assertTrue(1 == result.get(0));
    Assert.assertTrue(2 == result.get(1));
    Assert.assertTrue(1 == result.get(2));
  }

  @Test
  public void numRowsIsThree_ResultIsOneAndThreeAndThreeAndOne(){
    int numRows = 3;
    List<Integer> result = solution.getRow(numRows);
    Assert.assertEquals(4, result.size());
    Assert.assertTrue(1 == result.get(0));
    Assert.assertTrue(3 == result.get(1));
    Assert.assertTrue(3 == result.get(2));
    Assert.assertTrue(1 == result.get(3));
  }

  @Test
  public void numRowsIsFour_ResultIsOneAndFourAndSixAndFourAndOne(){
    int numRows = 4;
    List<Integer> result = solution.getRow(numRows);
    Assert.assertEquals(5, result.size());
    Assert.assertTrue(1 == result.get(0));
    Assert.assertTrue(4 == result.get(1));
    Assert.assertTrue(6 == result.get(2));
    Assert.assertTrue(4 == result.get(3));
    Assert.assertTrue(1 == result.get(4));
  }

}
