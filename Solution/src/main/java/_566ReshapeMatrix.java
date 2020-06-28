public class _566ReshapeMatrix {
  public int[][] matrixReshape(int[][] nums, int r, int c) {
    int originalRows = nums.length;
    int originalColumns = nums[0].length;

    if (r*c != originalRows*originalColumns || originalRows == r && originalColumns == c) {
      return nums;
    }

    int[][] result = new int[r][c];
    // all starts from 0
    for (int i = 0; i < originalRows; i++) {
      for (int j = 0; j < originalColumns; j++) {
        int sequence = i * originalColumns + j;
        int newRowNumber = sequence/c;
        int newColumnNumber = sequence - newRowNumber*c;
        result[newRowNumber][newColumnNumber] = nums[i][j];
      }
    }
    return result;
  }
}
