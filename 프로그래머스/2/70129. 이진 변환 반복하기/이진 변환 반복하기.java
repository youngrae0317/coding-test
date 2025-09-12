class Solution {
    public int[] solution(String s) {
        int[] answer = new int [2];
        
        int transCount = 0;
        int removedCount = 0;
        
        while (!s.equals("1")) {
            transCount++;
            
            int originLength = s.length();
            
            s = s.replace("0", "");
            
            int AfterLength = s.length();
            
            removedCount += (originLength - AfterLength);
            
            s = Integer.toBinaryString(AfterLength);
        }
        answer[0] = transCount;
        answer[1] = removedCount;
        
        return answer;
        
    }
}