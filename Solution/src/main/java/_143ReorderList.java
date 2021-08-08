import java.util.ArrayDeque;
import java.util.Deque;

/**
 * You are given the head of a singly linked-list. The list can be represented as: <br/>
 * <br/>
 * L0 → L1 → … → Ln - 1 → Ln <br/>
 * Reorder the list to be on the following form: <br/>
 * <br/>
 * L0 → Ln → L1 → Ln - 1 → L2 → Ln - 2 → … <br/>
 * You may not modify the values in the list's nodes. Only nodes themselves may be changed. <br/>
 */
public class _143ReorderList {
  public void reorderList(ListNode head) {
    if (head == null || head.next == null) {
      return;
    }

    ListNode quick = head, slow = head;
    while (quick != null && quick.next != null) {
      quick = quick.next.next;
      slow = slow.next;
    }
    Deque<ListNode> stack = new ArrayDeque<>();
    ListNode current = slow;
    if (quick != null) {
      current = slow.next;
    }
    while (current != null) {
      stack.push(current);
      current = current.next;
    }

    ListNode pointer = head;
    while (pointer != slow) {
      ListNode last = stack.pop();
      ListNode next = pointer.next;
      pointer.next = last;
      last.next = next;
      pointer = next;
    }
    slow.next = null;
  }
}
