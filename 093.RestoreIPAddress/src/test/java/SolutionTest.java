import java.util.List;

import org.junit.Assert;
import org.junit.Before;

public class SolutionTest {
  private _169MajorityElement solution;

  @Before
  public void setUp() {
    solution = new _169MajorityElement();
  }

//  @Test
  public void fourZero() {
    String input = "0000";
    List<String> output = solution.restoreIpAddresses(input);
    Assert.assertEquals(output.size(), 1);
    Assert.assertEquals(output.get(0), "0.0.0.0");
  }
}
