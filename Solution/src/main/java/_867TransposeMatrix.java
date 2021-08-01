public class _867TransposeMatrix {
  public int[][] transpose(int[][] matrix) {
    if (matrix == null) {
      return null;
    }
    int originalRows = matrix.length;
    int originalColumns = matrix[0].length;
    int[][] result = new int[originalColumns][originalRows];

    for (int i = 0; i < originalRows; i++) {
      for (int j = 0; j < originalColumns; j++) {
        result[j][i] = matrix[i][j];
      }
    }
    return result;
  }
}
