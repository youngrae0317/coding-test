import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int n, long left, long right) {
        int size = (int) (right - left + 1);
        int[] answer = new int[size];

        for (int i = 0; i < size; i++) {
            long currentIndex = left + i;
            
            long row = currentIndex / n;
            long col = currentIndex % n;
            
            answer[i] = (int) Math.max(row, col) + 1;
        }

        return answer;
    }
}