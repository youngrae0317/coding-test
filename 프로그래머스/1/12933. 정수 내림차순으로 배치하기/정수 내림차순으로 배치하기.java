import java.util.Arrays;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        String[] strArray = String.valueOf(n).split("");
        
        Arrays.sort(strArray, Collections.reverseOrder());
        
        String sortedStr = String.join("", strArray);
        
        return Long.parseLong(sortedStr);
    }
}