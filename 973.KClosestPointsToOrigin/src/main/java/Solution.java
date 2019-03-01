import java.util.Arrays;

class Solution {
  public int[][] kClosest(int[][] points, int K) {
    if (points == null || points.length == 0 || K == 0) {
      throw new RuntimeException("Input should not be empty");
    }
    quickSelect(points, K, 0, points.length - 1);
    return Arrays.copyOf(points, K);
  }

  private void quickSelect(int[][] points, int K, int low, int high) {
    int partition = partition(points, low, high);
    if (partition == K || partition == K - 1) {
      // If the location is K after partition, the points before it can be used;
      // If the location is K-1, the points before it plus itself can be used.
      return;
    } else if (partition < K - 1) {
      quickSelect(points, K,partition + 1, high);
    }
    else {
      quickSelect(points, K, low, partition - 1);
    }
  }

  /**
   * The low is smaller
   * @param points
   * @param low
   * @param high
   * @@return The index that points are closer before it, and points are further after it.
   */
  private int partition(int[][] points, int low, int high) {
    int[] pivotPoint = points[high];
    int partitionIndex = low;

    for (int i = low; i < high; i++) {
      if (compare(points[i], pivotPoint) <= 0) {
        swap(points, i, partitionIndex);
        partitionIndex++;
      }
    }
    swap(points, partitionIndex, high);
    return partitionIndex;
  }

  private int compare(int[] point1, int[] point2) {
    return point1[0] * point1[0] + point1[1] * point1[1] -
        point2[0] * point2[0] - point2[1] * point2[1];
  }

  private void swap(int[][] points, int location1, int location2) {
    int[] tempPoint = points[location1];
    points[location1] = points[location2];
    points[location2] = tempPoint;
  }
}