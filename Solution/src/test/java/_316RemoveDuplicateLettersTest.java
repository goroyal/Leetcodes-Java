import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _316RemoveDuplicateLettersTest {
  private _316RemoveDuplicateLetters solution;

  @BeforeEach
  public void beforeEach() {
    solution = new _316RemoveDuplicateLetters();
  }

  @Test
  public void test1() {
    String result = solution.removeDuplicateLetters("bcabc");
    Assertions.assertEquals("abc", result);
  }

  @Test
  public void test2() {
    String result = solution.removeDuplicateLetters("cbacdcbc");
    Assertions.assertEquals("acdb", result);
  }
}
