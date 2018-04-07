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
	public void example1() {
		Solution.TreeNode root = new Solution.TreeNode(3);
		Solution.TreeNode left = new Solution.TreeNode(9);
		Solution.TreeNode right = new Solution.TreeNode(20);
		root.left = left;
		root.right = right;

		right.left = new Solution.TreeNode(15);
		right.right = new Solution.TreeNode(7);

		Assert.assertEquals(3, solution.maxDepth(root));
	}
}
