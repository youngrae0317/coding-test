class Solution {
    public int solution(String s) {
        int answer = 0;
        char firstChar = ' ';
        int same = 0;
        int different = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (same == 0) {
                firstChar = s.charAt(i);
            }
            
            if (s.charAt(i) == firstChar) {
                same++;
            } else {
                different++;
            }
            
            if (same == different) {
                answer++;
                same = 0;
                different = 0;
            }
        }
        
        if (same != 0) {
            answer++;
        }
        
        return answer;
    }
}