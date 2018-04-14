class Solution {
	public int uniquePaths(int m, int n) {
		int[][] pathMatrix = new int[m][n];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 0 || j == 0) {
					pathMatrix[i][j] = 1;
				} else {
					pathMatrix[i][j] = pathMatrix[i - 1][j] + pathMatrix[i][j - 1];
				}
			}
		}

		return pathMatrix[m - 1][n - 1];
	}

	/**
	 * Recursive approach, will exceed time limit
	 *
	 * @param m
	 * @param n
	 * @return
	 */
	public int uniquePathsRecursiveApproach(int m, int n) {
		if (m == 1 || n == 1) {
			return 1;
		} else {
			return uniquePaths(m - 1, n) + uniquePaths(m, n - 1);
		}
	}
}