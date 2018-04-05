import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by dgq on 2017/7/23.
 */
public class SolutionTest {
	private Solution solution;

	@Before
	public void setUp() {
		solution = new Solution();
	}

	@Test
	public void simplePlusNoTenCarry() {
		int[] digits = {1, 3};
		int[] result = solution.plusOne(digits);
		Assert.assertNotNull(result);
		Assert.assertEquals(digits.length, result.length);
		Assert.assertEquals(1, result[0]);
		Assert.assertEquals(4, result[1]);
	}

	@Test
	public void plusTenCarryWithNoLengthChange() {
		int[] digits = {1, 9};
		int[] result = solution.plusOne(digits);
		Assert.assertNotNull(result);
		Assert.assertEquals(digits.length, result.length);
		Assert.assertEquals(2, result[0]);
		Assert.assertEquals(0, result[1]);
	}

	@Test
	public void plusTenCarryWithLengthIncrease() {
		int[] digits = {9, 9};
		int[] result = solution.plusOne(digits);
		Assert.assertNotNull(result);
		Assert.assertEquals(digits.length + 1, result.length);
		Assert.assertEquals(1, result[0]);
		Assert.assertEquals(0, result[1]);
		Assert.assertEquals(0, result[2]);
	}
}
