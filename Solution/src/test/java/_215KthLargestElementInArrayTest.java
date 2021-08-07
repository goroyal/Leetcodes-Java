import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _215KthLargestElementInArrayTest {
	private _215KthLargestElementInArray solution;

	@BeforeEach
	public void setUp() {
		solution = new _215KthLargestElementInArray();
	}

	@Test
	public void example() {
		int[] nums = {3, 2, 1, 5, 6, 4};
		int k = 2;

		int result = solution.findKthLargest(nums, k);

		Assertions.assertEquals(5, result);
	}
}
