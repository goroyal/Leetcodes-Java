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
		String s = "babad";

		String result = solution.longestPalindrome(s);

		Assert.assertEquals("bab", result);
	}

	@Test
	public void example2() {
		String s = "cbbd";

		String result = solution.longestPalindrome(s);

		Assert.assertEquals("bb", result);
	}
}
