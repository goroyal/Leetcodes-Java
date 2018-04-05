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
	public void oneElement() {
		int[] nums = {1};

		int profit = solution.maxProfit(nums);

		Assert.assertEquals(0, profit);
	}
}
