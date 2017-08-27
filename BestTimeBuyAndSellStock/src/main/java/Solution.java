/**
 * Created by dgq on 2017/8/27.
 */
public class Solution {
	public int maxProfit(int[] prices) {
		if (prices.length == 0) {
			return 0;
		}
		int low = prices[0];
		int result = 0;
		for (int i = 0; i < prices.length; i++) {
			if (low > prices[i]) {
				low = prices[i];
			} else {
				if (prices[i] - low > result) {
					result = prices[i] - low;
				}
			}
		}
		return result;
	}
}
