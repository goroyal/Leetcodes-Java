import java.util.Stack;

/**
 * Given a string s which represents an expression, evaluate this expression and return its value. <br/>
 * <br/>
 * The integer division should truncate toward zero. <br/>
 * <br/>
 * Note: You are not allowed to use any built-in function which evaluates strings as mathematical expressions, such as eval(). <br/>
 */
public class _227BasicCalculatorII {
  public int calculate(String s) {
    if (s == null || s.length() == 0) {
      return 0;
    }
    Stack<Integer> numbers = new Stack<>();
    int currentNumber = 0;
    char operation = '+';
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if (Character.isDigit(c)) {
        currentNumber = currentNumber * 10 + c - '0';
      }
      if (!Character.isDigit(c) && !Character.isWhitespace(c) ||
          i == s.length() - 1) {
        if (operation == '+') {
          numbers.push(currentNumber);
        }
        if (operation == '-') {
          numbers.push(-currentNumber);
        }
        if (operation == '*') {
          numbers.push(numbers.pop() * currentNumber);
        }
        if (operation == '/') {
          numbers.push(numbers.pop() / currentNumber);
        }
        operation = c;
        currentNumber = 0;
      }
    }
    int result = 0;
    while (!numbers.empty()) {
      result += numbers.pop();
    }
    return result;
  }
}
