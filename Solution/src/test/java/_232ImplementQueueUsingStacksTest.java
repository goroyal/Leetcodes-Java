import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class _232ImplementQueueUsingStacksTest {

  @Test
  public void test() {
    _232ImplementQueueUsingStacks.MyQueue queue = new _232ImplementQueueUsingStacks.MyQueue();
    queue.push(1);
    queue.push(2);
    Assertions.assertEquals(1, queue.pop());
    queue.push(3);
    queue.push(4);
    Assertions.assertEquals(2, queue.pop());
    Assertions.assertEquals(3, queue.peek());
  }
}
