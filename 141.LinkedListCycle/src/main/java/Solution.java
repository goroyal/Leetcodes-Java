import java.util.List;

public class Solution {
  public boolean hasCycle(ListNode head) {
    if (head == null || head.next == null) {
      return false;
    }
    ListNode fast = head.next;
    ListNode slow = head;

    // 快慢2个指针，快的每次走2步，慢的每次走1步，只要快的赶上慢的了，说明是有个循环在的
    while (slow != fast) {
      if (fast == null || fast.next == null) {
        return false;
      }
      fast = fast.next.next;
      slow = slow.next;
    }
    return true;
  }
  public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
      val = x;
      next = null;
    }
  }
}

