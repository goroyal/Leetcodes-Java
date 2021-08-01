import org.junit.Assert;
import org.junit.Test;

public class _204CountPrimesTest {
  @Test
  public void test() {
    int count = new _204CountPrimes().countPrimes(10);
    Assert.assertEquals(4, count);
  }
}
