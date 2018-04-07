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
		Solution.TreeNode root = new Solution.TreeNode(1);
		Solution.TreeNode left = new Solution.TreeNode(2);
		Solution.TreeNode right = new Solution.TreeNode(2);
		root.left = left;
		root.right = right;
		left.left = new Solution.TreeNode(3);
		left.right = new Solution.TreeNode(4);

		right.left = new Solution.TreeNode(4);
		right.right = new Solution.TreeNode(3);

		Assert.assertTrue(solution.isSymmetric(root));
	}

	@Test
	public void example2() {
		Solution.TreeNode root = new Solution.TreeNode(1);
		Solution.TreeNode left = new Solution.TreeNode(2);
		Solution.TreeNode right = new Solution.TreeNode(2);
		root.left = left;
		root.right = right;
		left.right = new Solution.TreeNode(3);
		right.right = new Solution.TreeNode(3);

		Assert.assertFalse(solution.isSymmetric(root));
	}
}
