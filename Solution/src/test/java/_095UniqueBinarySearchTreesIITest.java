
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class _095UniqueBinarySearchTreesIITest {
  private _095UniqueBinarySearchTreesII solution;

  @BeforeEach
  public void beforeMethod() {
    solution = new _095UniqueBinarySearchTreesII();
  }

  @Test
  public void number0() {
    List<TreeNode> result = solution.generateTrees(0);
    Assertions.assertEquals(0, result.size());
  }

  @Test
  public void number1() {
    List<TreeNode> result = solution.generateTrees(1);
    Assertions.assertEquals(1, result.size());
    Assertions.assertEquals(1, result.get(0).val);
  }

  @Test
  public void number2() {
    List<TreeNode> result = solution.generateTrees(2);
    Assertions.assertEquals(2, result.size());
  }

  @Test
  public void number3() {
    List<TreeNode> result = solution.generateTrees(3);
    Assertions.assertEquals(5, result.size());
  }

}
