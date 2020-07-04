public class _221MaximalSquare {
  public int maximalSquare(char[][] matrix) {
    if (matrix.length == 0 || matrix[0].length == 0) {
      return 0;
    }
    int rows = matrix.length;
    int columns = matrix[0].length;
    int[][] dp = new int[rows + 1][columns + 1];
    int max = 0;

    for (int i = 1; i <= rows; i++) {
      for (int j = 1; j <= columns; j++) {
        if (matrix[i - 1][j - 1] == '1') {
          dp[i][j] = Math.min(Math.min(dp[i - 1][j - 1], dp[i - 1][j]), dp[i][j - 1]) + 1;
          max = Math.max(max, dp[i][j]);
        }
      }
    }
    return max * max;
  }

  public int maximalSquareLessSpace(char[][] matrix) {
    if (matrix.length == 0 || matrix[0].length == 0) {
      return 0;
    }
    int rows = matrix.length;
    int columns = matrix[0].length;
    int[] dp = new int[columns + 1];
    int max = 0, prev = 0;

    for (int i = 1; i <= rows; i++) {
      for (int j = 1; j <= columns; j++) {
        int temp = dp[j]; // 这个dp[j]还是上一轮算下来的值，当前保存下来会在j+1的时候用到，表示自己左上角那个位置的值
        if (matrix[i - 1][j - 1] == '1') {
          dp[j] = Math.min(Math.min(prev, dp[j - 1]), dp[j]) + 1;
          max = Math.max(max, dp[j]);
        } else {
          dp[j] = 0; // 及时清除累计，为后面的做准备
        }
        prev = temp;
      }
    }
    return max * max;
  }
}
