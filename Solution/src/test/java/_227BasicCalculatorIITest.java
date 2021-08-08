import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _227BasicCalculatorIITest {
  private _227BasicCalculatorII solution;

  @BeforeEach
  public void beforeEach() {
    solution = new _227BasicCalculatorII();
  }

  @Test
  public void test() {
    int result = solution.calculate("3+2*2");
    Assertions.assertEquals(7, result);
  }
}
