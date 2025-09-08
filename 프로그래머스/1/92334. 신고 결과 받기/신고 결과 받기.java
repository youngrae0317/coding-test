import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int [] answer = new int [id_list.length];
        
        Map<String, Set<String>> history = new HashMap<>();
        
        Map<String, Integer> mailCount = new HashMap<>();
        
        for (String id : id_list) {
            
            history.put(id, new HashSet<>());
            mailCount.put(id, 0);
        }
        
        for (String reportString : report) {
            
            String [] parts = reportString.split(" ");
            String reporter = parts[0];
            String reported = parts[1];
        
            history.get(reported).add(reporter);
        }
        
        for (String reportedUser : id_list) {
            
            Set<String> reporters = history.get(reportedUser);
            
            if (reporters.size() >= k) {
                
                for (String reporter : reporters) {
                    int currentCount = mailCount.get(reporter);
                    mailCount.put(reporter, currentCount+1);
                }
            }
        }
        
        for (int i = 0; i < id_list.length; i++) {
            
            String id = id_list[i];
            
            answer[i] = mailCount.get(id);
        }
        
        return answer;
    }
}