import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _234PalindromeLinkedListTest {
  private _234PalindromeLinkedList solution;

  @BeforeEach
  public void beforeEach() {
    solution = new _234PalindromeLinkedList();
  }

  @Test
  public void test() {
    ListNode head = new ListNode(1);
    ListNode node1 = new ListNode(0);
    ListNode node2 = new ListNode(0);
    head.next = node1;
    node1.next = node2;

    Assertions.assertFalse(solution.isPalindrome(head));
  }
}
