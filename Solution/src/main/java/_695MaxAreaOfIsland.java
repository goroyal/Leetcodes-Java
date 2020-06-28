public class _695MaxAreaOfIsland {
  public int maxAreaOfIsland(int[][] grid) {
    int rows = grid.length;
    int columns = grid[0].length;

    boolean[][] seen = new boolean[rows][columns];

    int max = 0;
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        int value = area(grid, seen, i, j);
        if (value > max) {
          max = value;
        }
      }
    }

    return max;
  }

  private int area(int[][] grid, boolean[][] seen, int row, int column) {
    if (row < 0 || column < 0 || row >= grid.length || column >= grid[0].length ||
        seen[row][column] || grid[row][column] == 0) {
      return 0;
    }
    seen[row][column] = true;
    return 1 + area(grid, seen, row-1, column) + area(grid, seen, row, column-1) +
        area(grid, seen, row+1, column) + area(grid, seen, row, column+1);
  }
}
