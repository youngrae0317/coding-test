import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        
        List<Integer> answer = new ArrayList<>();
        
        Map<String, Integer> termsMap = new HashMap<>();
        for (String term : terms) {
            String[] parts = term.split(" ");
            termsMap.put(parts[0], Integer.parseInt(parts[1]));
        }
        
        int todayInt = dateToDays(today);
        
        for (int i = 0; i < privacies.length; i++) {
            String[] privacyParts = privacies[i].split(" ");
            String date = privacyParts[0];
            String type = privacyParts[1];
            
            int dateDays = dateToDays(date);
            
            int validateMonth = termsMap.get(type);
            
            int expiration = dateDays + (validateMonth * 28);
            
            if (todayInt >= expiration) {
                answer.add(i+1);
            }
            
        }
        
        return answer.stream().
                mapToInt(Integer::intValue).toArray();
        
    }
    
        private int dateToDays(String date) {
        String[] parts = date.split("\\.");
        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);
        
        return (year * 12 * 28) + (month * 28) + day;
    }
}