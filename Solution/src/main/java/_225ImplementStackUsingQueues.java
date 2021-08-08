import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
public class _225ImplementStackUsingQueues {

  class MyStack {
    private final Queue<Integer> queue1;
    private final Queue<Integer> queue2;
    private int size;
    private int top;

    /** Initialize your data structure here. */
    public MyStack() {
      queue1 = new LinkedList<>();
      queue2 = new LinkedList<>();
      size = 0;
      top = -1;
    }

    /** Push element x onto stack. */
    public void push(int x) {
      queue1.offer(x);
      size++;
      top = x;
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
      if (size == 0) {
        throw new NoSuchElementException();
      }
      while (queue1.size() > 1) {
        queue2.offer(queue1.poll());
      }
      int result = queue1.poll();
      while (!queue2.isEmpty()) {
        top = queue2.peek();
        queue1.offer(queue2.poll());
      }
      size--;
      return result;
    }

    /** Get the top element. */
    public int top() {
      if (size == 0) {
        throw new NoSuchElementException();
      }
      return top;
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
      return size == 0;
    }
  }
}
