import java.util.ArrayList;
import java.util.List;

class Solution {
    public String solution(int n) {
        String answer = "";
        List<String> list = new ArrayList<>();
        
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                list.add("박");
            } else {
                list.add("수");
            }
        }
        
        answer = String.join("", list);
        
        return answer;
    }
}