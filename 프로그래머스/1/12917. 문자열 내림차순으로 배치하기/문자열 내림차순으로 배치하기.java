import java.util.Arrays;

class Solution {
    public String solution(String s) {
        char [] charArray = s.toCharArray();
        
        Arrays.sort(charArray);
        
        String sort = new String(charArray);
        
        String answer = new StringBuilder(sort).reverse().toString();
        
        return answer;
    }
}