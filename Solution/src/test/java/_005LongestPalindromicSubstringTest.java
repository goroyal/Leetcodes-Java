import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class _005LongestPalindromicSubstringTest {
  private _005LongestPalindromicSubstring solution;

  @Before
  public void setUp() {
    solution = new _005LongestPalindromicSubstring();
  }

  @Test
  public void example1() {
    String s = "babad";

    String result = solution.longestPalindrome(s);

    Assert.assertEquals("bab", result);
  }

  @Test
  public void example2() {
    String s = "cbbd";

    String result = solution.longestPalindrome(s);

    Assert.assertEquals("bb", result);
  }
}
