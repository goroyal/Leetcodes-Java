public class _005LongestPalindromicSubstring {
  private int start = 0;
  private int maxLength = 0;

  /**
   * 最长回文序列
   *
   * @param s
   * @return
   */
  public String longestPalindrome(String s) {
    if (s == null || s.length() < 2) {
      return s;
    }
    for (int i = 0; i < s.length(); i++) {
      extendPalindrome(s, i, i);
      extendPalindrome(s, i, i + 1);
    }
    return s.substring(start, start + maxLength);
  }

  /**
   * @param s     string
   * @param left  left index, inclusive
   * @param right right index, inclusive
   */
  private void extendPalindrome(String s, int left, int right) {
    while (left >= 0 && right <= s.length() - 1 && s.charAt(left) == s.charAt(right)) {
      left--;
      right++;
    }
    if (maxLength < right - left - 1) {
      maxLength = right - left - 1;
      start = left + 1;
    }
  }
}
