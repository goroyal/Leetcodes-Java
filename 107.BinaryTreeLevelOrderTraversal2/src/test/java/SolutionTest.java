import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

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

		List<List<Integer>> result = solution.levelOrderBottom(root);

		Assert.assertEquals(3, result.size());
		Assert.assertEquals(2, result.get(0).size());
		Assert.assertEquals(15, result.get(0).get(0).intValue());
		Assert.assertEquals(7, result.get(0).get(1).intValue());

		Assert.assertEquals(2, result.get(1).size());
		Assert.assertEquals(9, result.get(1).get(0).intValue());
		Assert.assertEquals(20, result.get(1).get(1).intValue());

		Assert.assertEquals(1, result.get(2).size());
		Assert.assertEquals(3, result.get(2).get(0).intValue());
	}
}
