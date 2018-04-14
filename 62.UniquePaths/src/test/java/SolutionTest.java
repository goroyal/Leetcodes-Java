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
	public void example1() {
		int result = solution.uniquePaths(3, 7);

		Assert.assertEquals(28, result);
	}
}
