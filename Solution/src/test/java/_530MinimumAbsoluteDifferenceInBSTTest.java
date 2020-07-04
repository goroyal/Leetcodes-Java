import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class _530MinimumAbsoluteDifferenceInBSTTest {
  private _530MinimumAbsoluteDifferenceInBST solution;

  @Before
  public void Setup() {
    solution = new _530MinimumAbsoluteDifferenceInBST();
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
