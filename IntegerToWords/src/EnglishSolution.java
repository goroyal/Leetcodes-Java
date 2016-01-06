/**
 * 123 -> "One Hundred Twenty Three"
 * 12345 -> "Twelve Thousand Three Hundred Forty Five"
 * 1234567 -> "One Million Two Hundred Thirty Four Thousand Five Hundred Sixty Seven"
 * Hint:
 * 1. Did you see a pattern in dividing the number into chunk of words? For example, 123 and 123000.
 * 2. Group the number by thousands (3 digits). You can write a helper function that takes a number less than 1000 and convert just that chunk to words.
 * 3. There are many edge cases. What are some good test cases? Does your code work with input such as 0? Or 1000010? (middle chunk is zero and should not be printed out)
 */
public class EnglishSolution {
    private String[] digits = new String[]{"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
    private String[] shiji = new String[]{"Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
    private String[] jishi = new String[]{"","","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};

    public String numberToWords(int num) {
        StringBuilder sb = new StringBuilder();
        if(num/1000000000!=0){
            sb.append(hundredSolution(num/1000000000)).append(" Billion");
            num %= 1000000000;
        }
        if(num/1000000!=0){
            if(sb.length()>0){
                sb.append(" ");
            }
            sb.append(hundredSolution(num/1000000)).append(" Million");
            num %= 1000000;
        }
        if(num/1000!=0){
            if(sb.length()>0){
                sb.append(" ");
            }
            sb.append(hundredSolution(num/1000)).append(" Thousand");
            num %= 1000;
        }
        if(num>0){
            if(sb.length()>0){
                sb.append(" ");
            }
            return sb.append(hundredSolution(num)).toString();
        }
        if(num==0){
            if(sb.length()==0){
                sb.append("Zero");
            }
        }
        return sb.toString();
    }

    private String hundredSolution(int num){
        StringBuilder sb = new StringBuilder();
        if (num/100!=0){
            sb.append(digits[num/100]).append(" Hundred");
            num = num%100;
        }
        if(num/10!=0){
            if(sb.length() > 1){
                sb.append(" ");
            }
            if(num/10==1){
                sb.append(shiji[num%10]);
                return sb.toString();
            }else {
                sb.append(jishi[num/10]);
                num = num%10;
            }
        }
        if(num > 0){
            if(sb.length()>0){
                sb.append(" ");
            }
            sb.append(digits[num]);
        }
        if(num == 0){
            if(sb.length()>0){
                return sb.toString();
            }else {
                return "Zero";
            }
        }
        return sb.toString();
    }

}
