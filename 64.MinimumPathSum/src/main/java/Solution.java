class Solution {
	public int minPathSum(int[][] grid) {
		int columns = grid[0].length;
		int[] sum = new int[columns];

		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < columns; j++) {
				int currentValue = grid[i][j];
				if (i == 0 && j == 0) {
					sum[j] = currentValue;
				} else if (i == 0 && j != 0) {
					sum[j] = sum[j - 1] + currentValue;
				} else if (i != 0 && j == 0) {
					sum[j] += currentValue;
				} else {
					sum[j] = Math.min(sum[j - 1], sum[j]) + currentValue;
				}
			}
		}
		return sum[columns - 1];
	}

}