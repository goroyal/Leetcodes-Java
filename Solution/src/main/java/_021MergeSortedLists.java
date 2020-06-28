/**
 * Created by dgq on 1/6/2016.
 */
public class _021MergeSortedLists {
  public static void main(String[] args){
    ListNode node1 = new ListNode(1);
    ListNode node2 = new ListNode(6);
    ListNode node3 = new ListNode(9);

    ListNode node4 = new ListNode(3);
    ListNode node5 = new ListNode(4);
    ListNode node6 = new ListNode(5);
    ListNode node7 = new ListNode(8);

    node1.next = node2;
    node2.next = node3;
    node3.next = null;

    node4.next = node5;
    node5.next = node6;
    node6.next = node7;
    node7.next = null;

    ListNode node = new _021MergeSortedLists().mergeTwoLists(node1, node4);
    while (node != null){
      System.out.println(node.val);
      node = node.next;
    }
  }

  public ListNode mergeTwoLists(ListNode l1, ListNode l2){
    if (l1 == null){
      return l2;
    }
    if (l2 == null){
      return l1;
    }
    ListNode list = null;
    if (l1.val <= l2.val){
      list = l1;
      l1 = l1.next;
    }else {
      list = l2;
      l2 = l2.next;
    }
    ListNode node = list;
    while (l1 != null && l2 != null){
      if (l1.val <= l2.val){
        node.next = l1;
        l1 = l1.next;
      }else {
        node.next = l2;
        l2 = l2.next;
      }
      node = node.next;
    }
    if (l1 == null){
      node.next = l2;
    }
    if (l2 == null){
      node.next = l1;
    }
    return list;
  }
}
