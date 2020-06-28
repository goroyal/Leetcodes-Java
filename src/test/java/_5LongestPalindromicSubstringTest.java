public class _5LongestPalindromicSubstringTest {
  private _5LongestPalindromicSubstring solution;

  @Before
  public void setUp() {
    solution = new _5LongestPalindromicSubstring();
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
