import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class _204CountPrimesTest {
  @Test
  public void test() {
    int count = new _204CountPrimes().countPrimes(10);
    Assertions.assertEquals(4, count);
  }
}
