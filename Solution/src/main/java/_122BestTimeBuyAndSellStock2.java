class _122BestTimeBuyAndSellStock2 {
	public int maxProfit(int[] prices) {
		int profit = 0;
		int i = 0, length = prices.length;
		while (i < length) {
			// get the min
			while (i < length - 1 && prices[i + 1] <= prices[i]) {
				i++;
			}
			int min = prices[i++]; // i++是为了让指针接着往后走
			while (i < length - 1 && prices[i + 1] >= prices[i]) {
				i++;
			}
			profit += i < length ? prices[i] - min : 0;
		}
		return profit;
	}
}