import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by goroyal on 2017/8/27.
 */
public class SolutionTest {
  private Solution solution;

  @Before
  public void setUp(){
    solution = new Solution();
  }

  @Test
  public void arrayIsEmpty_InsertAtZero(){
    int[] nums = {};
    int result = solution.searchInsert(nums, 4);

    Assert.assertEquals(0, result);
  }

  @Test
  public void arrayContainsOneElementSmallerThanTarget_InsertAtLast(){
    int[] nums = {1};
    int result = solution.searchInsert(nums, 4);

    Assert.assertEquals(1,result);
  }

  @Test
  public void arrayContainsOneElementGreaterThanTarget_InsertAtZero(){
    int[] nums = {2};
    int result = solution.searchInsert(nums, 1);

    Assert.assertEquals(0, result);
  }

  @Test
  public void arrayContainsTwoElementsTargetInTheFirst_InsertAtZero(){
    int[] nums = {2, 5};
    int result = solution.searchInsert(nums, 1);

    Assert.assertEquals(0, result);
  }

  @Test
  public void arrayContainsTwoElementsTargetInTheMiddle_InsertAtZero(){
    int[] nums = {2, 5};
    int result = solution.searchInsert(nums, 4);

    Assert.assertEquals(1, result);
  }

  @Test
  public void arrayContainsTwoElementsTargetSameWithLast_InsertAtZero(){
    int[] nums = {2, 5};
    int result = solution.searchInsert(nums, 5);

    Assert.assertEquals(1, result);
  }
}
