import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String[] survey, int[] choices) {

        Map<Character, Integer> score = new HashMap<>();
        char [] types = {'R', 'T', 'C', 'F', 'J', 'M', 'A', 'N'};
        
        for (char type : types) {
            score.put(type, 0);
        }
        
        for (int i = 0 ; i < survey.length; i++) {
            int choice = choices[i];
            
            if (choice == 4) {
                continue;
            }
            
            char disagree = survey[i].charAt(0);
            char agree = survey[i].charAt(1);
            
            int choiceScore = Math.abs(choice - 4);
            
            if (choice < 4) {
                score.put(disagree, score.get(disagree) + choiceScore);
            } else {
                score.put(agree, score.get(agree) + choiceScore);
            }
        }
        
        StringBuilder answer = new StringBuilder();
        
        answer.append(score.get('R') >= score.get('T') ? 'R' : 'T');
        answer.append(score.get('C') >= score.get('F') ? 'C' : 'F');
        answer.append(score.get('J') >= score.get('M') ? 'J' : 'M');
        answer.append(score.get('A') >= score.get('N') ? 'A' : 'N');
        
        return answer.toString();
        
        
        
    }
}