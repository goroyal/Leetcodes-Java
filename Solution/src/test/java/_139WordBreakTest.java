import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class _139WordBreakTest {
	private _139WordBreak solution;

	@Before
	public void setUp() {
		solution = new _139WordBreak();
	}

	@Test
	public void singleCharString() {
		String s = "a";
		List<String> dict = new ArrayList<>(1);
		dict.add("a");
		Assert.assertTrue(solution.wordBreak(s, dict));
	}

	@Test
	public void canBeSplit() {
		String s = "Leetcode";
		List<String> dict = new ArrayList<>(2);
		dict.add("Leet");
		dict.add("code");
		Assert.assertTrue(solution.wordBreak(s, dict));
	}

	@Test
	public void canNotBeSplit() {
		String s = "Leetcoda";
		List<String> dict = new ArrayList<>(2);
		dict.add("Leet");
		dict.add("code");
		Assert.assertFalse(solution.wordBreak(s, dict));
	}

	@Test
	public void canBeSplitWordsLessThanDict() {
		String s = "Leetcode";
		List<String> dict = new ArrayList<>(3);
		dict.add("Leet");
		dict.add("code");
		dict.add("good");
		Assert.assertTrue(solution.wordBreak(s, dict));
	}

	@Test
	public void allCharsAreSame() {
		String s = "aaaaaaa";
		List<String> dict = new ArrayList<>(2);
		dict.add("aaa");
		dict.add("aaaa");
		Assert.assertTrue(solution.wordBreak(s, dict));
	}

}
