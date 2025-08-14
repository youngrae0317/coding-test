class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        for (String word : babbling) {
            if (word.contains("ayaaya") || word.contains("yeye") || word.contains("woowoo") || word.contains("mama")) {
                continue;
            }
            
            String temp = word.replace("aya", " ");
            temp = temp.replace("ye", " ");
            temp = temp.replace("woo", " ");
            temp = temp.replace("ma", " ");
            
            temp = temp.replace(" ", "");
            
            if (temp.isEmpty()) {
                answer++;
            }
            
            
        }
        
        return answer;
    }
}