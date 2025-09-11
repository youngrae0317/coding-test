class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] parts = s.split(" ", -1);
        
        for (int i = 0; i < parts.length; i++) {
            String part = parts[i];
            
            if (!part.isEmpty()) {
                String firstChar = part.substring(0, 1).toUpperCase();
                String rest = part.substring(1).toLowerCase();
                parts[i] = firstChar + rest;
            }
        }
        
        answer = String.join(" ", parts);
        
        return answer;
    }
}