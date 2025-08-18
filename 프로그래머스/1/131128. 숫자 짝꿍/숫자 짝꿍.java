import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        int [] xCount = new int [10];
        int [] yCount = new int [10];
        
        for (int i = 0; i < X.length(); i++) {
            xCount[X.charAt(i)-'0']++;
        }
        
         for (int i = 0; i < Y.length(); i++) {
            yCount[Y.charAt(i)-'0']++;
        }
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 9; i >= 0; i--) {
            int commonCount = Math.min(xCount[i], yCount[i]);
            for (int j = 0; j < commonCount; j++) {
                sb.append(i);
            }
        }
        
        String answer = sb.toString();
        
        if (answer.isEmpty()) {
            return "-1";
        }
        
        if (answer.charAt(0) == '0') {
            return "0";
        }
        
        return answer;
    }
}