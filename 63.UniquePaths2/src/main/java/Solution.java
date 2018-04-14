class Solution {
	/**
	 * 有障碍，矩阵中的1表示障碍，0表示可以通过
	 *
	 * @param obstacleGrid
	 * @return
	 */
	public int uniquePathsWithObstacles(int[][] obstacleGrid) {
		int rows = obstacleGrid.length;
		int columns = obstacleGrid[0].length;
		int[][] pathMatrix = new int[rows][columns];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				if (obstacleGrid[i][j] == 1) {
					pathMatrix[i][j] = 0;
				} else {
					if (i == 0 && j == 0) {
						pathMatrix[i][j] = 1;
					} else if (i == 0 && j > 0) {
						pathMatrix[i][j] = pathMatrix[i][j - 1];
					} else if (i > 0 && j == 0) {
						pathMatrix[i][j] = pathMatrix[i - 1][j];
					} else {
						pathMatrix[i][j] = pathMatrix[i][j - 1] + pathMatrix[i - 1][j];
					}
				}
			}
		}
		return pathMatrix[rows - 1][columns - 1];
	}

	/**
	 * 用的辅助空间更少
	 *
	 * @param obstacleGrid
	 * @return
	 */
	public int uniquePathsWithObstacles2(int[][] obstacleGrid) {
		int columns = obstacleGrid[0].length;
		int[] paths = new int[columns];
		paths[0] = 1;

		for (int[] row : obstacleGrid) {
			for (int j = 0; j < columns; j++) {
				if (row[j] == 1) {
					paths[j] = 0;
				} else if (j > 0) {
					paths[j] += paths[j - 1];
				}
			}
		}
		return paths[columns - 1];
	}
}