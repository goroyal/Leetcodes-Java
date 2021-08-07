import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;

public class _973KClosestPointsToOriginTest {
  private _973KClosestPointsToOrigin solution;

  @BeforeEach
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

    Assertions.assertEquals(1, result.length);
    Assertions.assertArrayEquals(expected, result[0]);
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

    Assertions.assertEquals(2, result.length);
    Assertions.assertTrue(expected.contains(result[0]));
    Assertions.assertTrue(expected.contains(result[1]));
    Assertions.assertNotSame(result[0], result[1]);
  }
}
