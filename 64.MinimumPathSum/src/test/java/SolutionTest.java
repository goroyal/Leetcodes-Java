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
	public void example() {
		int[][] grid = {
				{1, 3, 1},
				{1, 5, 1},
				{4, 2, 1}};

		int result = solution.minPathSum(grid);

		Assert.assertEquals(7, result);
	}
}
