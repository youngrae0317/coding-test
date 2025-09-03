import java.util.HashMap;
import java.util.Map;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        
        Map<String, Integer> ranks = new HashMap<>();
        
        for (int i = 0; i < players.length; i++) {
            ranks.put(players[i], i);
        }
        
        for (String calling : callings) {
            int currentRank = ranks.get(calling);
            
            String frontPlayer = players[currentRank-1];
            
            players[currentRank-1] = calling;
            players[currentRank] = frontPlayer;
            
            ranks.put(calling, currentRank - 1);
            ranks.put(frontPlayer, currentRank);
        }
        
        return players;
        
    }
}