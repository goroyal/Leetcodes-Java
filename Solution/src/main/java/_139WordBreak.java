import java.util.List;

class _139WordBreak {
	public boolean wordBreak(String s, List<String> wordDict) {
		boolean[] flag = new boolean[s.length()];
		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j <= i; j++) {
				// 为了让每次分割完一个单词之后，从分割后的位置开始下一个
				if ((j == 0 || flag[j - 1]) && wordDict.contains(s.substring(j, i + 1))) {
					flag[i] = true;
					break;
				}
			}
		}
		return flag[s.length() - 1];
	}
}