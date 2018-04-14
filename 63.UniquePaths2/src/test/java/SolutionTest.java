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
		int[][] obstacleGrid = {
				{0, 0, 0},
				{0, 1, 0},
				{0, 0, 0}
		};

		int result = solution.uniquePathsWithObstacles2(obstacleGrid);

		Assert.assertEquals(2, result);
	}
}
