/**
 * 123 -> 一百二十三
 * 1234 -> 一千二百三十四
 * 12345 -> 一万二千三百四十五
 * Created by dgq on 15/9/7.
 */
public class ChineseSolution {
	private String[] disits = new String[]{"〇","一","二","三","四","五","六","七","八","九"};

	public static void main(String[] args){
		ChineseSolution solution = new ChineseSolution();
		System.out.println(solution.numberToChineseCharacters(0));
	}
	public String numberToChineseCharacters(int num) {
		StringBuilder sb = new StringBuilder();
		if(num>10000){
			sb.append(thousandSolution(num/10000)).append("万");
			num%=10000;
		}
		if(num<10000 & num>0){
			sb.append(thousandSolution(num));
		}
		if (num == 0){
			if(sb.length()==0) {
				sb.append(disits[num]);
			}
		}
		return sb.toString();
	}

	private String thousandSolution(int num){
		if (num == 0){
			return disits[num];
		}
		StringBuilder sb = new StringBuilder();
		if(num/10000!=0){
			sb.append(disits[num/10000]).append("万");
			num %= 10000;
		}
		if(num/1000!=0){
			sb.append(disits[num/1000]).append("千");
			num %= 1000;
		}
		if(num/100!=0){
			sb.append(disits[num/100]).append("百");
			num %= 100;
		}
		if(num/10!=0){
			sb.append(disits[num/10]).append("十");
			num %= 10;
		}
		if(num > 0){
			sb.append(disits[num]);
		}
		return sb.toString();
	}
}
