class Solution {
    public int[] solution(int brown, int yellow) {
        
        int total = brown + yellow;
        
        for (int height = 3; height <= total; height++) {
            
            if (total % height == 0) {
                int width = total / height;
                
                if (width < height) {
                    continue;
                }
                
                int yellowArea = (width - 2) * (height - 2);
                
                if (yellowArea == yellow) {
                    int [] answer = {width, height};
                            return answer;
                }
            }
        }
        return null;
    }
}