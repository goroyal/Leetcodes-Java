import java.util.List;

class _120Triangle {
	public int minimumTotal(List<List<Integer>> triangle) {
		int[] totalMins = new int[triangle.size() + 1];

		// 自底向上
		for (int level = triangle.size() - 1; level >= 0; level--) {
			for (int i = 0; i < triangle.get(level).size(); i++) {
				totalMins[i] = Math.min(totalMins[i], totalMins[i + 1]) + triangle.get(level).get(i);
			}
		}

		return totalMins[0];
	}
}