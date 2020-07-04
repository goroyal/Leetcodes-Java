/**
 * Created by goroyal on 2017/7/23.
 */
public class _066PlusOne {
	/**
	 * plus 1 for the integer that digits array represent
	 *
	 * @param digits each element of this array is from 0 to 9
	 * @return new digits after plus one
	 */
	public int[] plusOne(int[] digits) {
		for (int i = digits.length - 1; i >= 0; i--) {
			if (digits[i] < 9) {
				digits[i]++;
				return digits;
			}
			digits[i] = 0;
		}
		int[] result = new int[digits.length + 1];
		result[0] = 1;
		return result;
	}
}
