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
		int[] nums = {4, 2, 3};

		Assert.assertTrue(solution.checkPossibility(nums));
	}

	@Test
	public void example2() {
		int[] nums = {4, 2, 1};

		Assert.assertFalse(solution.checkPossibility(nums));
	}
}
