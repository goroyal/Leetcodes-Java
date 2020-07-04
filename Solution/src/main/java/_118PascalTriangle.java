import java.util.ArrayList;
import java.util.List;

public class _118PascalTriangle {
  public List<List<Integer>> generate(int numRows) {
    List<List<Integer>> result = new ArrayList<>();
    if (numRows == 0){
      return result;
    }
    List<Integer> firstRow = new ArrayList<>(1);
    firstRow.add(1);
    result.add(firstRow);

    // i represents row number
    for (int i = 2; i <= numRows; i++){
      List<Integer> row = new ArrayList<>(i);
      row.add(1);
      for (int j = 1; j < i; j++){
        if (j + 1 < i){
          List<Integer> before = result.get(i-1-1);
          row.add(before.get(j-1) + before.get(j));
        } else {
          // the last element in each row
          row.add(1);
        }
      }
      result.add(row);
    }
    return result;
  }
}
