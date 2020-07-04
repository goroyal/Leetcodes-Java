import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class _442FindAllDuplicatesInAnArrayTest {
  private _442FindAllDuplicatesInAnArray solution = new _442FindAllDuplicatesInAnArray();

  @Test
  public void oneDuplicate() {
    int[] input = new int[] {4,3,7,6,2,3,1};

    List<Integer> result = solution.findDuplicates(input);

    Assert.assertEquals(1, result.size());
    Assert.assertEquals(3, result.get(0).intValue());
  }

  @Test
  public void twoDuplicate() {
    int[] input = new int[] {4,3,2,7,8,2,3,1};

    List<Integer> result = solution.findDuplicates(input);

    Assert.assertEquals(2, result.size());
    Assert.assertTrue(result.contains(2));
    Assert.assertTrue(result.contains(3));
  }
}
