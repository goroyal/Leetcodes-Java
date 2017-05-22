/**
 * Remove all elements from a linked list of integers that have value val.
 * Example:
 * Given: 1 --> 2 --> 6 --> 3 --> 4 --> 5 --> 6, val = 6
 * Return: 1 --> 2 --> 3 --> 4 --> 5
 */
public class RemoveLinkedListElements {
  public static void main(String[] args){
    ListNode node1 = new ListNode(1);
//        ListNode node2 = new ListNode(2);
//        ListNode node3 = new ListNode(6);
//        ListNode node4 = new ListNode(3);
//        ListNode node5 = new ListNode(4);
//        ListNode node6 = new ListNode(5);
//        ListNode node7 = new ListNode(6);
//        node1.next = node2;
//        node2.next = node3;
//        node3.next = node4;
//        node4.next = node5;
//        node5.next = node6;
//        node6.next = node7;
//        node7.next = null;
    node1.next = null;

    ListNode node = new RemoveLinkedListElements().removeElements(node1, 1);
    while (node != null){
      System.out.println(node.val);
      node = node.next;
    }
  }
  public ListNode removeElements(ListNode head, int val) {
    while (head != null && head.val == val){
      head = head.next;
    }
    if (head == null){
      return null;
    }
    ListNode p = head;
    ListNode q = p.next;
    while (q != null){
      if (q.val == val){
        p.next = q.next;
        q = q.next;
      }else {
        p = p.next;
        q = q.next;
      }
    }
    return head;
  }
}
