import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] arr) {
        if(arr.length == 1) {
            int [] answer = {-1};
            return answer;
        }
        
        int min = arr[0];
        
        for (int i = 0; i<arr.length; i++ ) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        
        List<Integer> a = new ArrayList<Integer>();
        
        for (int i = 0; i<arr.length; i++) {
            if (arr[i] != min) {
                a.add(arr[i]);
            }
        }
        
        int [] answer = new int[a.size()];
        for (int i = 0; i<a.size(); i++) {
            answer[i] = a.get(i);
        }
        
        
        return answer;
    }
}