import java.util.Arrays;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int matchCount = 0;
        int zeroCount = 0;
        int result [] = new int [2];
        
        for (int i = 0; i < lottos.length; i++) {
            if (lottos[i] == 0) {
                zeroCount++;
                continue; 
            }
            for (int j = 0; j < win_nums.length; j++) {
                if (lottos[i] == win_nums[j]) {
                    matchCount++;
                    break;
                }
            }
        }
        
        int max = matchCount + zeroCount;
        int min = matchCount;
        
        result[0] = getRank(max);
        result[1] = getRank(min);
        return result;
        
    }
    
    
    public int getRank(int count) {
        switch (count) {
            case 6:
                return 1;
            case 5:
                return 2;
            case 4:
                return 3;
            case 3:
                return 4;
            case 2:
                return 5;
            default:
                return 6;
            
        }
    }
}