import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SolutionTest {
	private Solution solution;

	@Before
	public void setUp() {
		solution = new Solution();
	}

	@Test
	public void oneStair() {
		Assert.assertEquals(1, solution.climbStairs(1));
	}

	@Test
	public void twoStairs() {
		Assert.assertEquals(2, solution.climbStairs(2));
	}

	@Test
	public void threeStairs() {
		Assert.assertEquals(3, solution.climbStairs(3));
	}

	@Test
	public void FourStairs() {
		Assert.assertEquals(5, solution.climbStairs(4));
	}
}
