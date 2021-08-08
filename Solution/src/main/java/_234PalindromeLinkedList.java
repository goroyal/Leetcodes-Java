import java.util.Stack;

/**
 * 回文链表
 */
public class _234PalindromeLinkedList {
  public boolean isPalindrome(ListNode head) {
    if (head == null) {
      return false;
    }
    if (head.next == null) {
      return true;
    }
    ListNode quick = head, slow = head;
    while (quick != null && quick.next != null) {
      quick = quick.next.next;
      slow = slow.next;
    }
    Stack<ListNode> stack = new Stack<>();
    ListNode current = head;
    while (current != slow) {
      stack.push(current);
      current = current.next;
    }
    if (quick != null) {
      slow = slow.next;
    }
    while (slow != null) {
      if (slow.val != stack.peek().val) {
        return false;
      }
      slow = slow.next;
      stack.pop();
    }
    return true;
  }
}
