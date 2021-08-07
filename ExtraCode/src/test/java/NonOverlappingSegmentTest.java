import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class NonOverlappingSegmentTest {
  private NonOverlappingSegment solution;

  @BeforeEach
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

    Assertions.assertEquals(2, result);
  }
}
