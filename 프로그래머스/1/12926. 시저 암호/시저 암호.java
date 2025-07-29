class Solution {
    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            if (Character.isUpperCase(ch)) {
                char shift = (char) (ch + n);
                if (shift > 'Z') {
                    shift = (char) (shift - 26);
                }
                answer.append(shift);
            } else if (Character.isLowerCase(ch)) {
                char shift = (char) (ch + n);
                if (shift > 'z') {
                    shift = (char) (shift - 26);
                }
                answer.append(shift);
            } else {
                answer.append(ch);
            }
            
        }
         
        return answer.toString();
    }
}