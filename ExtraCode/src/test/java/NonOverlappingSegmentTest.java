import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class NonOverlappingSegmentTest {
  private NonOverlappingSegment solution;

  @Before
  public void setUp() {
    solution = new NonOverlappingSegment();
  }

  @Test
  public void test1() {
    Segment segment1 = new Segment(1, 5);
    Segment segment2 = new Segment(2, 3);
    Segment segment3 = new Segment(3, 6);
    List<Segment> segments = new ArrayList<>(3);
    segments.add(segment1);
    segments.add(segment2);
    segments.add(segment3);

    int result = solution.chooseNonOverlappingUsingSort(segments);

    Assert.assertEquals(2, result);
  }
}
