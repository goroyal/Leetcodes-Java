import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _122BestTimeBuyAndSellStock2Test {
	private _122BestTimeBuyAndSellStock2 solution;

	@BeforeEach
	public void setUp() {
		solution = new _122BestTimeBuyAndSellStock2();
	}

	@Test
	public void oneElement() {
		int[] nums = {1};

		int profit = solution.maxProfit(nums);

		Assertions.assertEquals(0, profit);
	}

	@Test
	public void example() {
		int[] nums = {4, 3, 6, 7, 8, 9, 10, 4, 6, 3, 9};

		int profit = solution.maxProfit(nums);

		Assertions.assertEquals(15, profit);
	}
}
