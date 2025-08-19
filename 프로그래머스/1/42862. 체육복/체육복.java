import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int[] status = new int[n + 2];
        Arrays.fill(status, 1); 

        for (int r : reserve) { 
            status[r]++;
        }


        for (int l : lost) {
            status[l]--; 
        }

        for (int i = 1; i <= n; i++) {
            if (status[i] == 0) {
                if (status[i - 1] == 2) {
                    status[i - 1]--; // 빌려줌
                    status[i]++;     // 받음
                }

                else if (status[i + 1] == 2) {
                    status[i + 1]--; // 빌려줌
                    status[i]++;     // 받음
                }
            }
        }

        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if (status[i] >= 1) {
                answer++;
            }
        }

        return answer;
    }
}