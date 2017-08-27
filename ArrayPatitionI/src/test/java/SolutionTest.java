import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * https://leetcode.com/problems/array-partition-i/discuss/
 * Created by dgq on 2017/7/23.
 */
public class SolutionTest {
	private Solution solution;

	@Before
	public void setUp() {
		solution = new Solution();
	}

	@Test
	public void onlyOnePair_ReturnTheMinOneOfThePair() {
		int[] nums = {1, 2};
		int result = solution.arrayPairSum(nums);
		Assert.assertEquals(1, result);
	}

	@Test
	public void twoPairs() {
		int[] nums = {1, 6, 5, 2};
		int result = solution.arrayPairSum(nums);
		Assert.assertEquals(6, result);
	}
}
