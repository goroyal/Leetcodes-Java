import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class _215KthLargestElementInArrayTest {
	private _215KthLargestElementInArray solution;

	@Before
	public void setUp() {
		solution = new _215KthLargestElementInArray();
	}

	@Test
	public void example() {
		int[] nums = {3, 2, 1, 5, 6, 4};
		int k = 2;

		int result = solution.findKthLargest(nums, k);

		Assert.assertEquals(5, result);
	}
}
