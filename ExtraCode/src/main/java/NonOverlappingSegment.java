import java.util.List;

/**
 * 不重叠线段问题，在一个数轴上，有很多线段，
 * 要取任意两点线段都不重叠（端点可以重叠），求最多可以取出互不重叠的线段。
 */
public class NonOverlappingSegment {

  /**
   * 这个是贪心思想，先对各个线段从小到大排序；
   * 排序的规则是先比较end，如果end一样则比较start。
   * 排序后，设置一个当前末尾点，从第一个线段开始，如果后续的线段有start不在末尾点之前的，
   * 就表示这个线段跟之前的线段不重叠，计数器加1，同时设置这个线段的end为新的末尾点。
   * 注意：计数器初始值为1，因为取出一个线段它没有重叠的。
   * @param segments
   * @return
   */
  public int chooseNonOverlappingUsingSort(List<Segment> segments) {
    if (segments == null || segments.isEmpty()) {
      return 0;
    }

    int num = 1;
    sort(segments);

    int selectedEnd = segments.get(0).getEnd();
    for (Segment segment : segments) {
      if (segment.getStart() >= selectedEnd) {
        num++;
        selectedEnd = segment.getEnd();
      }
    }
    return num;
  }

  private void sort(List<Segment> segments) {
    segments.sort((segment1, segment2) -> {
      int endCompare = segment1.getEnd() - segment2.getEnd();
      return endCompare != 0 ? endCompare : segment1.getStart() - segment2.getStart();
    });
  }

}
class Segment{
  private int start;
  private int end;

  Segment(int start, int end) {
    this.start = start;
    this.end = end;
  }

  public int getStart() {
    return start;
  }

  public int getEnd() {
    return end;
  }
}
