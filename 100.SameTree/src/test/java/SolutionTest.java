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
		Solution.TreeNode root1 = new Solution.TreeNode(1);
		Solution.TreeNode left1 = new Solution.TreeNode(2);
		Solution.TreeNode right1 = new Solution.TreeNode(3);
		root1.left = left1;
		root1.right = right1;

		Solution.TreeNode root2 = new Solution.TreeNode(1);
		Solution.TreeNode left2 = new Solution.TreeNode(2);
		Solution.TreeNode right2 = new Solution.TreeNode(3);
		root2.left = left2;
		root2.right = right2;

		Assert.assertTrue(solution.isSameTree(root1, root2));
	}

	@Test
	public void example2() {
		Solution.TreeNode root1 = new Solution.TreeNode(1);
		Solution.TreeNode left1 = new Solution.TreeNode(2);
		root1.left = left1;

		Solution.TreeNode root2 = new Solution.TreeNode(1);
		Solution.TreeNode right2 = new Solution.TreeNode(2);
		root2.right = right2;

		Assert.assertFalse(solution.isSameTree(root1, root2));
	}

	@Test
	public void example3() {
		Solution.TreeNode root1 = new Solution.TreeNode(1);
		Solution.TreeNode left1 = new Solution.TreeNode(2);
		Solution.TreeNode right1 = new Solution.TreeNode(1);
		root1.left = left1;
		root1.right = right1;

		Solution.TreeNode root2 = new Solution.TreeNode(1);
		Solution.TreeNode left2 = new Solution.TreeNode(1);
		Solution.TreeNode right2 = new Solution.TreeNode(2);
		root2.left = left2;
		root2.right = right2;

		Assert.assertFalse(solution.isSameTree(root1, root2));
	}
}
