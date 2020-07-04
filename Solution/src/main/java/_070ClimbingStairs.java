class _070ClimbingStairs {
	public int climbStairs(int n) {
		int a = 1, b = 1 + 1;
		if (n == 1) {
			return a;
		}
		if (n == 2) {
			return b;
		}
		int result = 0;
		for (int i = 2; i < n; i++) {
			result = a + b;
			a = b;
			b = result;
		}
		return result;
	}
}