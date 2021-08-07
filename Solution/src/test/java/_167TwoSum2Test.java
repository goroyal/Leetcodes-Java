import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _167TwoSum2Test {
	private _167TwoSum2 solution;

	@BeforeEach
	public void setUp() {
		solution = new _167TwoSum2();
	}

	@Test
	public void arraySizeSmallerThanTwo_ReturnArrayValuesAreZero() {
		int[] numbers = {1};
		int target = 1;
		int[] result = solution.twoSum(numbers, target);
		Assertions.assertNotNull(result);
		Assertions.assertEquals(2, result.length);
		Assertions.assertEquals(0, result[0]);
		Assertions.assertEquals(0, result[1]);
	}

	@Test
	public void arraySizeEqualsTwoButCannotSumToTarget_ReturnArrayValuesAreZero() {
		int[] numbers = {1, 2};
		int target = 4;
		int[] result = solution.twoSum(numbers, target);
		Assertions.assertNotNull(result);
		Assertions.assertEquals(2, result.length);
		Assertions.assertEquals(0, result[0]);
		Assertions.assertEquals(0, result[1]);
	}

	@Test
	public void arraySizeEqualsTwoCanSumToTarget_ReturnArrayWithIndexes() {
		int[] numbers = {1, 2};
		int target = 3;
		int[] result = solution.twoSum(numbers, target);
		Assertions.assertNotNull(result);
		Assertions.assertEquals(2, result.length);
		Assertions.assertEquals(1, result[0]);
		Assertions.assertEquals(2, result[1]);
	}

	@Test
	public void arraySizeBigThanTwoCanSumToTarget_ReturnArrayWithIndexes() {
		int[] numbers = {1, 3, 4, 6, 9};
		int target = 9;
		int[] result = solution.twoSum(numbers, target);
		Assertions.assertNotNull(result);
		Assertions.assertEquals(2, result.length);
		Assertions.assertEquals(2, result[0]);
		Assertions.assertEquals(4, result[1]);
	}

	@Test
	public void testBinarySearch() {
		int[] numbers = {1, 3, 4, 6, 9};
		int searchValue = 6;
		int result = solution.binarySearch(numbers, searchValue, 0);
		Assertions.assertEquals(result, 3);
	}

	@Test
	public void testBinarySearch_left() {
		int[] numbers = {1, 3, 4, 6, 9};
		int searchValue = 1;
		int result = solution.binarySearch(numbers, searchValue, 0);
		Assertions.assertEquals(result, 0);
	}

	@Test
	public void testBinarySearch_right() {
		int[] numbers = {1, 3, 4, 6, 9};
		int searchValue = 9;
		int result = solution.binarySearch(numbers, searchValue, 0);
		Assertions.assertEquals(result, 4);
	}

	@Test
	public void testBinarySearch_CannotSearch() {
		int[] numbers = {1, 3, 4, 6, 9};
		int searchValue = 0;
		int result = solution.binarySearch(numbers, searchValue, 0);
		Assertions.assertEquals(result, -1);
	}

	@Test
	public void arraySizeSmallerThanTwoInBinarySearchMethod_ReturnArrayValuesAreZero() {
		int[] numbers = {1};
		int target = 1;
		int[] result = solution.twoSumWithBinarySearch(numbers, target);
		Assertions.assertNotNull(result);
		Assertions.assertEquals(2, result.length);
		Assertions.assertEquals(0, result[0]);
		Assertions.assertEquals(0, result[1]);
	}

	@Test
	public void arraySizeEqualsTwoButCannotSumToTargetInBinarySearchMethod_ReturnArrayValuesAreZero() {
		int[] numbers = {1, 2};
		int target = 4;
		int[] result = solution.twoSumWithBinarySearch(numbers, target);
		Assertions.assertNotNull(result);
		Assertions.assertEquals(2, result.length);
		Assertions.assertEquals(0, result[0]);
		Assertions.assertEquals(0, result[1]);
	}

	@Test
	public void arraySizeEqualsTwoCanSumToTargetInBinarySearchMethod_ReturnArrayWithIndexes() {
		int[] numbers = {1, 2};
		int target = 3;
		int[] result = solution.twoSumWithBinarySearch(numbers, target);
		Assertions.assertNotNull(result);
		Assertions.assertEquals(2, result.length);
		Assertions.assertEquals(1, result[0]);
		Assertions.assertEquals(2, result[1]);
	}

	@Test
	public void arraySizeBigThanTwoCanSumToTargetInBinarySearchMethod_ReturnArrayWithIndexes() {
		int[] numbers = {1, 3, 4, 6, 9};
		int target = 9;
		int[] result = solution.twoSumWithBinarySearch(numbers, target);
		Assertions.assertNotNull(result);
		Assertions.assertEquals(2, result.length);
		Assertions.assertEquals(2, result[0]);
		Assertions.assertEquals(4, result[1]);
	}

	@Test
	public void binarySearchMethod_ReturnArrayWithIndexes() {
		int[] numbers = {2, 3, 4};
		int target = 6;
		int[] result = solution.twoSumWithBinarySearch(numbers, target);
		Assertions.assertNotNull(result);
		Assertions.assertEquals(2, result.length);
		Assertions.assertEquals(1, result[0]);
		Assertions.assertEquals(3, result[1]);
	}
}