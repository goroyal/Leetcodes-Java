public class _074Search2DMatrix {
  public boolean searchMatrix(int[][] matrix, int target) {
    if (matrix == null) {
      return false;
    }
    int rows = matrix.length;
    int columns = matrix[0].length - 1;
    int targetRow = 0;
    for (int i = 0; i < rows; i++) {
      if (matrix[i][0] == target) {
        return true;
      } else if (matrix[i][0] > target) {
        targetRow = i-1;
        break;
      } else {
        if (matrix[i][columns-1] == target) {
          return true;
        } else if (matrix[i][columns-1] > target) {
          targetRow = i;
          break;
        }
      }
    }
    if (targetRow < 0) {
      return false;
    }
    for (int j = 0; j < columns; j++) {
      if (matrix[targetRow][j] == target) {
        return true;
      }
    }
    return false;
  }

}
