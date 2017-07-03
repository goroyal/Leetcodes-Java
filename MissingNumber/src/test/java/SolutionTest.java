import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by dgq on 2017/7/4.
 */
public class SolutionTest {
	private Solution solution;

	@Before
	public void setUp() {
		solution = new Solution();
	}

	@Test
	public void givenExampleArray_ReturnSameResult() {
		int[] input = new int[]{0, 1, 3};
		int output = solution.missingNumber(input);
		Assert.assertEquals(2, output);
	}
}
