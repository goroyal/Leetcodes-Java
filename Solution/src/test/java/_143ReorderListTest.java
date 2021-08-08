import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _143ReorderListTest {
  private _143ReorderList solution;

  @BeforeEach
  public void beforeEach() {
    solution = new _143ReorderList();
  }

  @Test
  public void test() {
    ListNode head = new ListNode(1);
    ListNode node1 = new ListNode(2);
    ListNode node2 = new ListNode(3);
    ListNode node3 = new ListNode(4);
    head.next = node1;
    node1.next = node2;
    node2.next = node3;

    solution.reorderList(head);
  }
}
