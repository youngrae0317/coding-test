class Solution {
    public String solution(String s, String skip, int index) {

        StringBuilder sb = new StringBuilder();
        StringBuilder answer = new StringBuilder();
        
        for (char c = 'a'; c <= 'z'; c++) {
            if (skip.indexOf(c) == -1) {
                sb.append(c);
            }
        }
        
        String alphabet = sb.toString();
        
        for (char c : s.toCharArray()) {
            int original = alphabet.indexOf(c);
            int newAlphabet = (original + index) % alphabet.length();
            
            answer.append(alphabet.charAt(newAlphabet));
            
        }
        
        return answer.toString();
    }
}