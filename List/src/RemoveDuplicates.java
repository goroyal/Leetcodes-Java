/**
 * Created by I320015 on 1/6/2016.
 */
public class RemoveDuplicates {
  public static void main(String[] args){
    ListNode node1 = new ListNode(1);
    ListNode node2 = new ListNode(1);
    ListNode node3 = new ListNode(2);
    ListNode node4 = new ListNode(3);
    ListNode node5 = new ListNode(3);
    node1.next = node2;
    node2.next = node3;
    node3.next = node4;
    node4.next = node5;
    node5.next = null;

    ListNode node = new RemoveDuplicates().deleteDuplicates(node1);
    while (node != null){
      System.out.println(node.val);
      node = node.next;
    }
  }

  public ListNode deleteDuplicates(ListNode head) {
    if (head == null){
      return null;
    }
    ListNode p = head;
    ListNode q = head.next;
    while (q != null){
      if (p.val == q.val){
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
