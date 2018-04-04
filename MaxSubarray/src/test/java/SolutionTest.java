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
		int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

		int result = solution.maxSubArray(nums);

		Assert.assertEquals(6, result);
	}
}
