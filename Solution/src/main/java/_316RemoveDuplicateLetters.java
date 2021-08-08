import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Given a string s, remove duplicate letters so that every letter appears once and only once.
 * You must make sure your result is the smallest in lexicographical order among all possible results.
 */
public class _316RemoveDuplicateLetters {
  public String removeDuplicateLetters(String s) {
    if (s == null) {
      return null;
    }
    Deque<Character> stack = new ArrayDeque<>();
    boolean[] visited = new boolean[26];
    int[] count = new int[26];
    for (int i = 0; i < s.length(); i++) {
      int letterIndex = s.charAt(i) - 'a';
      count[letterIndex]++;
    }
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      int letterIndex = c - 'a';
      count[letterIndex]--;
      if (visited[letterIndex]) {
        continue;
      }
      while (!stack.isEmpty()
          && c < stack.peek()
          && count[stack.peek() - 'a'] > 0) {
        visited[stack.pop() - 'a'] = false;
      }
      stack.push(c);
      visited[letterIndex] = true;
    }
    StringBuilder builder = new StringBuilder();
    while (!stack.isEmpty()) {
      builder.append(stack.removeLast());
    }
    return builder.toString();
  }
}
