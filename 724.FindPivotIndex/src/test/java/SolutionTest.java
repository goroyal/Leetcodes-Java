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
		int[] nums = {1, 7, 3, 6, 5, 6};

		int result = solution.pivotIndex(nums);

		Assert.assertEquals(3, result);
	}

	@Test
	public void example2() {
		int[] nums = {1, 2, 3};

		int result = solution.pivotIndex(nums);

		Assert.assertEquals(-1, result);
	}
}
