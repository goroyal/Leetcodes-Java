import java.util.NoSuchElementException;
import java.util.Stack;

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
public class _232ImplementQueueUsingStacks {
  static class MyQueue {
    private final Stack<Integer> stack;
    private final Stack<Integer> temp;
    private int size = 0;
    private int top = -1;

    /** Initialize your data structure here. */
    public MyQueue() {
      stack = new Stack<>();
      temp = new Stack<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
      if (size == 0) {
        top = x;
      }
      stack.push(x);
      size++;
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
      if (size == 0) {
        throw new NoSuchElementException();
      }
      while (stack.size() > 1) {
        temp.push(stack.pop());
      }
      int result = stack.pop();
      while (!temp.empty()) {
        int value = temp.pop();
        if (stack.empty()) {
          top = value;
        }
        stack.push(value);
      }
      size--;
      return result;
    }

    /** Get the front element. */
    public int peek() {
      if (size == 0) {
        throw new NoSuchElementException();
      }
      return top;
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
      return size == 0;
    }
  }
}
