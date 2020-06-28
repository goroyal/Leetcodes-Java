import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;

public class _973KClosestPointsToOriginTest {
  private _973KClosestPointsToOrigin solution;

  @Before
  public void setUp() {
    solution = new _973KClosestPointsToOrigin();
  }

  @Test
  public void twoPointsFindOne() {
    int[][] points = {
        {1, 3}, {-2, 2}
    };

    int[][] result = solution.kClosest(points, 1);
    int[] expected = {-2, 2};

    Assert.assertEquals(1, result.length);
    Assert.assertArrayEquals(expected, result[0]);
  }

  @Test
  public void threePointsFindTwo() {
    int[] point1 = new int[]{3, 3};
    int[] point2 = new int[]{5, -1};
    int[] point3 = new int[]{-2, 4};

    int[][] points = {
        point1, point2, point3
    };

    int[][] result = solution.kClosest(points, 2);
    HashSet<int[]> expected = new HashSet<>();
    expected.add(point1);
    expected.add(point3);

    Assert.assertEquals(2, result.length);
    Assert.assertTrue(expected.contains(result[0]));
    Assert.assertTrue(expected.contains(result[1]));
    Assert.assertNotSame(result[0], result[1]);
  }
}
