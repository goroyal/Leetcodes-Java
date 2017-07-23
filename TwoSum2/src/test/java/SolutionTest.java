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
	public void arraySizeSmallerThanTwo_ReturnArrayValuesAreZero() {
		int[] numbers = {1};
		int target = 1;
		int[] result = solution.twoSum(numbers, target);
		Assert.assertNotNull(result);
		Assert.assertEquals(2, result.length);
		Assert.assertEquals(0, result[0]);
		Assert.assertEquals(0, result[1]);
	}

	@Test
	public void arraySizeEqualsTwoButCannotSumToTarget_ReturnArrayValuesAreZero() {
		int[] numbers = {1, 2};
		int target = 4;
		int[] result = solution.twoSum(numbers, target);
		Assert.assertNotNull(result);
		Assert.assertEquals(2, result.length);
		Assert.assertEquals(0, result[0]);
		Assert.assertEquals(0, result[1]);
	}

	@Test
	public void arraySizeEqualsTwoCanSumToTarget_ReturnArrayWithIndexes() {
		int[] numbers = {1, 2};
		int target = 3;
		int[] result = solution.twoSum(numbers, target);
		Assert.assertNotNull(result);
		Assert.assertEquals(2, result.length);
		Assert.assertEquals(1, result[0]);
		Assert.assertEquals(2, result[1]);
	}

	@Test
	public void arraySizeBigThanTwoCanSumToTarget_ReturnArrayWithIndexes() {
		int[] numbers = {1, 3, 4, 6, 9};
		int target = 9;
		int[] result = solution.twoSum(numbers, target);
		Assert.assertNotNull(result);
		Assert.assertEquals(2, result.length);
		Assert.assertEquals(2, result[0]);
		Assert.assertEquals(4, result[1]);
	}

}