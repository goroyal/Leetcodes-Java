import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
  @Test
  public void test() {
    Solution.TreeNode root= new Solution.TreeNode(1);
    Solution.TreeNode child = new Solution.TreeNode(2);
    root.left = child;

    Assert.assertFalse(new Solution().hasPathSum(root, 1));
  }
}
