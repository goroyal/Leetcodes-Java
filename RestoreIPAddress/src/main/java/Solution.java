import java.util.ArrayList;
import java.util.List;

/**
 * Given a string containing only digits, restore it by returning all possible valid IP address combinations.
 * For example:
 * Given "25525511135",
 * return ["255.255.11.135", "255.255.111.35"]. (Order does not matter)
 * Created by dgq on 9/28/2015.
 */
public class Solution {

    public List<String> restoreIpAddresses(String s) {
        List<String> list = new ArrayList<>();
        if(s==null || s.length()<4 || s.length()>12){
            return list;
        }
        StringBuilder builder = new StringBuilder();
        function(list,s,builder,0,0);
        return list;
    }

    private static void function(List<String> list, String s, StringBuilder builder, int start, int count){
        if (start == s.length() && count == 3){
            list.add(builder.toString());
            return;
        }
        for (int i = start+1; i <= s.length(); i++){

        }
    }
}
