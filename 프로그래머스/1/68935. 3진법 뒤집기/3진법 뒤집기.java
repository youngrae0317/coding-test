import java.util.List;
import java.util.ArrayList;

class Solution {
    public int solution(int n) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        
        while (n != 0) {
            list.add(n % 3);
            n /= 3;
        }
        
        int power = 1; 
        for (int i = list.size()-1; i >= 0; i--) {
            answer += list.get(i) * power;
            
            power *= 3;
        }
        
        
        return answer;
    }
}