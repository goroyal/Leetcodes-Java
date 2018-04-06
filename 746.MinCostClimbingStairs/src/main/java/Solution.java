class Solution {
	public int minCostClimbingStairs(int[] cost) {
		int ma = cost[0], mb = cost[1];
		int result = Math.min(ma, mb);
		for (int i = 2; i <= cost.length; i++) {
			int currentCost = i == cost.length ? 0 : cost[i];
			result = Math.min(ma, mb) + currentCost;
			ma = mb;
			mb = result;
		}
		return result;
	}
}