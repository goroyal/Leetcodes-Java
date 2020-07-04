import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class _120TriangleTest {
	private _120Triangle solution;

	@Before
	public void setUp() {
		solution = new _120Triangle();
	}

	@Test
	public void example() {
		List<List<Integer>> list = new ArrayList<>(4);

		List<Integer> level1 = new ArrayList<>(1);
		level1.add(2);

		List<Integer> level2 = new ArrayList<>(2);
		level2.add(3);
		level2.add(4);

		List<Integer> level3 = new ArrayList<>(3);
		level3.add(6);
		level3.add(5);
		level3.add(7);

		List<Integer> level4 = new ArrayList<>(3);
		level4.add(4);
		level4.add(1);
		level4.add(8);
		level4.add(7);

		list.add(level1);
		list.add(level2);
		list.add(level3);
		list.add(level4);

		int result = solution.minimumTotal(list);

		Assert.assertEquals(11, result);
	}
}
