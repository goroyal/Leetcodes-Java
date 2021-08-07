import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class _139WordBreakTest {
	private _139WordBreak solution;

	@BeforeEach
	public void setUp() {
		solution = new _139WordBreak();
	}

	@Test
	public void singleCharString() {
		String s = "a";
		List<String> dict = new ArrayList<>(1);
		dict.add("a");
		Assertions.assertTrue(solution.wordBreak(s, dict));
	}

	@Test
	public void canBeSplit() {
		String s = "Leetcode";
		List<String> dict = new ArrayList<>(2);
		dict.add("Leet");
		dict.add("code");
		Assertions.assertTrue(solution.wordBreak(s, dict));
	}

	@Test
	public void canNotBeSplit() {
		String s = "Leetcoda";
		List<String> dict = new ArrayList<>(2);
		dict.add("Leet");
		dict.add("code");
		Assertions.assertFalse(solution.wordBreak(s, dict));
	}

	@Test
	public void canBeSplitWordsLessThanDict() {
		String s = "Leetcode";
		List<String> dict = new ArrayList<>(3);
		dict.add("Leet");
		dict.add("code");
		dict.add("good");
		Assertions.assertTrue(solution.wordBreak(s, dict));
	}

	@Test
	public void allCharsAreSame() {
		String s = "aaaaaaa";
		List<String> dict = new ArrayList<>(2);
		dict.add("aaa");
		dict.add("aaaa");
		Assertions.assertTrue(solution.wordBreak(s, dict));
	}

}
