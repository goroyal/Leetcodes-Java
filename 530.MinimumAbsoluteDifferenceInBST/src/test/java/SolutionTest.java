import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SolutionTest {
  private Solution solution;

  @Before
  public void Setup() {
    solution = new Solution();
  }

  @Test
  public void test1() {
    TreeNode root = new TreeNode(1);
    TreeNode right = new TreeNode(3);
    TreeNode rightLeft = new TreeNode(2);

    root.right = right;
    right.left = rightLeft;

    int result = solution.getMinimumDifference(root);
    Assert.assertEquals(1, result);
  }
}
