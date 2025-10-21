import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        
        int answer = 0;
        
        Map<String, Integer> wantList = new HashMap<>();
        for (int i = 0; i < want.length; i++) {
            wantList.put(want[i], number[i]);
        }
        
        for (int i = 0; i <= discount.length - 10; i++) {
            
            Map<String, Integer> discountList = new HashMap<>();
            
            for (int j = 0; j < 10; j++) {
                String item = discount[i+j];
                discountList.put(item, discountList.getOrDefault(item, 0) + 1);
            }
            
            if (wantList.equals(discountList)) {
                answer++;
            }
        }
        
        return answer;
    }
}