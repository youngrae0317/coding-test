import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(int[] elements) {
        Set<Integer> sum = new HashSet<>();
        int n = elements.length;
        
        for (int len = 1; len <= n; len++) {
            
            for (int start = 0; start < n; start++) {
                int currentSum = 0;
                
                for (int i = 0; i < len; i++) {
                    int index = (start + i) % n;
                    currentSum += elements[index];
                }
                
                sum.add(currentSum);
            }
        }
        
        return sum.size();

    }
}