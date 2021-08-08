import java.util.List;
import java.util.NoSuchElementException;

public class _155MinStack {
  /**
   * Your MinStack object will be instantiated and called as such:
   * MinStack obj = new MinStack();
   * obj.push(val);
   * obj.pop();
   * int param_3 = obj.top();
   * int param_4 = obj.getMin();
   */
  public class MinStack {
    private class ListNode {
      private int val;
      private ListNode next;

      private ListNode(int val) {
        this.val = val;
      }
    }

    private ListNode beginMarker;
    private ListNode endMarker;
    private int min;

    /** initialize your data structure here. */
    public MinStack() {
      beginMarker = new ListNode(Integer.MIN_VALUE);
      endMarker = new ListNode(Integer.MAX_VALUE);
      beginMarker.next = endMarker;
      min = Integer.MAX_VALUE;
    }

    public void push(int val) {
      ListNode node = new ListNode(val);
      node.next = beginMarker.next;
      beginMarker.next = node;
      min = Math.min(min, val);
    }

    public void pop() {
      if (beginMarker.next == endMarker) {
        throw new NoSuchElementException();
      }
      ListNode node = beginMarker.next;
      int value = node.val;
      beginMarker.next = node.next;
      if (value == min) {
        min = Integer.MAX_VALUE;
        ListNode current = beginMarker.next;
        while (current != endMarker) {
          min = Math.min(min, current.val);
          current = current.next;
        }
      }
    }

    public int top() {
      if (beginMarker.next == endMarker) {
        throw new NoSuchElementException();
      }
      return beginMarker.next.val;
    }

    public int getMin() {
      if (beginMarker.next == endMarker) {
        throw new NoSuchElementException();
      }
      return min;
    }
  }
}
