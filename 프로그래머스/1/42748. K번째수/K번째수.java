import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int [commands.length];
        
        // commands 배열 순회
        for (int i = 0; i < commands.length; i++) {
            int start = commands[i][0];
            int end = commands[i][1];
            int num = commands[i][2];
            
            int [] sortedSlice = Arrays.stream(array, start - 1, end)
                                        .sorted()
                                        .toArray();
            
            answer[i] = sortedSlice[num - 1];
        }
        return answer;
    }
}