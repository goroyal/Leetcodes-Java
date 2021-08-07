import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _005LongestPalindromicSubstringTest {
  private _005LongestPalindromicSubstring solution;

  @BeforeEach
  public void setUp() {
    solution = new _005LongestPalindromicSubstring();
  }

  @Test
  public void example1() {
    String s = "babad";

    String result = solution.longestPalindrome(s);

    Assertions.assertEquals("bab", result);
  }

  @Test
  public void example2() {
    String s = "cbbd";

    String result = solution.longestPalindrome(s);

    Assertions.assertEquals("bb", result);
  }
}
