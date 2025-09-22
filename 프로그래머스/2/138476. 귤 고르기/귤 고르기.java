import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        Map<Integer, Integer> sizeCounts = new HashMap<>();

        for (int t : tangerine) {
            sizeCounts.put(t, sizeCounts.getOrDefault(t, 0) + 1);
        }

        List<Integer> counts = new ArrayList<>(sizeCounts.values());

        counts.sort(Collections.reverseOrder());

        int answer = 0;
        int remaining = k;

        for (int count : counts) {
            remaining -= count;
            answer++;

            if (remaining <= 0) {
                break;
            }
        }

        return answer;
    }
}