import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Created by goroyal on 2017/8/27.
 */
public class _121BestTimeBuyAndSellStockTest {
	private _121BestTimeBuyAndSellStock solution;

	@BeforeEach
	public void setUp() {
		solution = new _121BestTimeBuyAndSellStock();
	}

	@Test
	public void NoNum() {
		int[] prices = {};
		int result = solution.maxProfit(prices);
		Assertions.assertEquals(result, 0);
	}

	@Test
	public void onlyOneNum() {
		int[] prices = {3};
		int result = solution.maxProfit(prices);
		Assertions.assertEquals(result, 0);
	}

	@Test
	public void descArray_CannotSell() {
		int[] prices = {6, 3, 2};
		int result = solution.maxProfit(prices);
		Assertions.assertEquals(result, 0);
	}

	@Test
	public void onlyOneHighAfterLow() {
		int[] prices = {6, 3, 2, 4};
		int result = solution.maxProfit(prices);
		Assertions.assertEquals(result, 2);
	}

	@Test
	public void twoHighAfterLow() {
		int[] prices = {6, 3, 2, 4, 5};
		int result = solution.maxProfit(prices);
		Assertions.assertEquals(result, 3);
	}

	@Test
	public void complex() {
		int[] prices = {7, 1, 5, 3, 6, 4};
		int result = solution.maxProfit(prices);
		Assertions.assertEquals(result, 5);
	}
}
