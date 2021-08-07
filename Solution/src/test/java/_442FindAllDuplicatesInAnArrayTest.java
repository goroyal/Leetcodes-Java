import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class _442FindAllDuplicatesInAnArrayTest {
  private _442FindAllDuplicatesInAnArray solution = new _442FindAllDuplicatesInAnArray();

  @Test
  public void oneDuplicate() {
    int[] input = new int[] {4,3,7,6,2,3,1};

    List<Integer> result = solution.findDuplicates(input);

    Assertions.assertEquals(1, result.size());
    Assertions.assertEquals(3, result.get(0).intValue());
  }

  @Test
  public void twoDuplicate() {
    int[] input = new int[] {4,3,2,7,8,2,3,1};

    List<Integer> result = solution.findDuplicates(input);

    Assertions.assertEquals(2, result.size());
    Assertions.assertTrue(result.contains(2));
    Assertions.assertTrue(result.contains(3));
  }
}
