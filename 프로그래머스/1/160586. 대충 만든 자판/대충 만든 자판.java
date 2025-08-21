import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        Map<Character, Integer> minPressMap = new HashMap<>();

        for (String key : keymap) {
            for (int i = 0; i < key.length(); i++) {
                char ch = key.charAt(i);
                int presses = i + 1;

                if (!minPressMap.containsKey(ch) || presses < minPressMap.get(ch)) {
                    minPressMap.put(ch, presses);
                }
            }
        }

        int[] answer = new int[targets.length];
        for (int i = 0; i < targets.length; i++) {
            String target = targets[i];
            int totalCount = 0;
            boolean isPossible = true;

            for (int j = 0; j < target.length(); j++) {
                char ch = target.charAt(j);

                if (!minPressMap.containsKey(ch)) {
                    isPossible = false;
                    break;
                }
                
                totalCount += minPressMap.get(ch);
            }

            if (isPossible) {
                answer[i] = totalCount;
            } else {
                answer[i] = -1;
            }
        }

        return answer;
    }
}