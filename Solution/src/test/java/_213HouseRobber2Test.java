import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _213HouseRobber2Test {
	private _213HouseRobber2 solution;

	@BeforeEach
	public void setUp() {
		solution = new _213HouseRobber2();
	}

	@Test
	public void oneElement_JustReturnTheValue() {
		int[] nums = {2};

		int result = solution.rob(nums);

		Assertions.assertEquals(2, result);
	}

	@Test
	public void twoElements_ReturnMaxOne() {
		int[] nums = {2, 4};

		int result = solution.rob(nums);

		Assertions.assertEquals(4, result);
	}

	@Test
	public void threeElementsMiddleBiggerThanOthersSum_ReturnMiddleOne() {
		int[] nums = {2, 7, 4};

		int result = solution.rob(nums);

		Assertions.assertEquals(7, result);
	}

	@Test
	public void threeElementsMiddleSmallerThanOthersSum_ReturnTheMiddleOne() {
		int[] nums = {2, 5, 4};

		int result = solution.rob(nums);

		Assertions.assertEquals(5, result);
	}
}
