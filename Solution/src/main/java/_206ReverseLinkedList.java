/**
 * Reverse a singly linked list.
 * A linked list can be reversed either iteratively or recursively. Could you implement both?
 */
public class _206ReverseLinkedList {
  public static void main(String[] args){
    ListNode node1 = new ListNode(1);
    ListNode node2 = new ListNode(2);
    ListNode node3 = new ListNode(3);
    ListNode node4 = new ListNode(4);
    ListNode node5 = new ListNode(5);
    ListNode node6 = new ListNode(6);
    ListNode node7 = new ListNode(7);
    node1.next = node2;
    node2.next = node3;
    node3.next = node4;
    node4.next = node5;
    node5.next = node6;
    node6.next = node7;
    node7.next = null;
    ListNode node = new _206ReverseLinkedList().reverseList(node1);
    while (node != null){
      System.out.println(node.val);
      node = node.next;
    }
  }

  public ListNode reverseList(ListNode head){
    return reverseListRecursively(head);
  }

  private ListNode reverseListRecursively(ListNode current){
    if (current == null || current.next == null)
      return current;
    ListNode nextOne = current.next;
    current.next = null;
    ListNode reverseRest = reverseListRecursively(nextOne);
    nextOne.next = current;
    return reverseRest;
  }

  private ListNode reverseListIteratively(ListNode head){
    if (head == null || head.next == null){
      return head;
    }
    ListNode p = null;
    ListNode q = head;
    while (q.next != null){
      ListNode r = q.next;
      q.next = p;
      p = q;
      q = r;
    }
    q.next = p;
    return q;
  }
}
