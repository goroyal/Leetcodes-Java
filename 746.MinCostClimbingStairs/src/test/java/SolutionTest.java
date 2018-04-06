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
		int[] nums = {10, 15, 20};

		int result = solution.minCostClimbingStairs(nums);

		Assert.assertEquals(15, result);
	}

	@Test
	public void example2() {
		int[] nums = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};

		int result = solution.minCostClimbingStairs(nums);

		Assert.assertEquals(6, result);
	}
}
