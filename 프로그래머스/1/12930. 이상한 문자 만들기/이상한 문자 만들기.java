class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        int count = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            
            if (currentChar == ' ') {
                answer.append(currentChar);
                count = 0;
            } else {
                if (count % 2 == 0) {
                    answer.append(Character.toUpperCase(currentChar));
                } else {
                    answer.append(Character.toLowerCase(currentChar));
                    }
                     count++;
                }
            }
                return answer.toString();
        }
    }