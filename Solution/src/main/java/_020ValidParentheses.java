import java.util.Stack;

public class _020ValidParentheses {
  public boolean isValid(String s) {
    Stack<Character> stackA = new Stack<>();
    Stack<Character> stackB = new Stack<>();
    for (int i = 0; i < s.length(); i++) {
      stackA.push(s.charAt(i));
    }
    while (!stackA.empty()) {
      char c = stackA.pop();
      if (c == ')' || c == ']' || c == '}') {
        stackB.push(c);
      }
      if (c == '(' || c == '[' || c == '{') {
        if (stackB.empty()) {
          return false;
        }
        char another = stackB.pop();
        if (c == '(' && another != ')' ||
          c == '[' && another != ']' ||
          c == '{' && another != '}') {
          return false;
        }
      }
    }
    return stackB.empty();
  }
}
