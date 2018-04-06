class Solution {
	public boolean canPlaceFlowers(int[] flowerbed, int n) {
		if (flowerbed.length == 0) {
			return false;
		}
		if (flowerbed.length == 1) {
			return flowerbed[0] == 0 && n <= 1 || n == 0;
		}
		int placedCount = 0;

		for (int i = 0; i < flowerbed.length; i++) {
			if (flowerbed[i] == 0 &&
					(isBorderNeighborAvailable(flowerbed, i) || isLeftAndRightNeighborAvailable(flowerbed, i))) {
				placedCount++;
				flowerbed[i] = 1; // 种上花
			}
			if (placedCount >= n) {
				return true;
			}
		}
		return false;
	}

	private boolean isBorderNeighborAvailable(int[] flowerbed, int i) {
		return i == 0 && flowerbed[i + 1] == 0 || i == flowerbed.length - 1 && flowerbed[i - 1] == 0;
	}

	private boolean isLeftAndRightNeighborAvailable(int[] flowerbed, int i) {
		return i > 0 && i < flowerbed.length - 1 && flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0;
	}
}