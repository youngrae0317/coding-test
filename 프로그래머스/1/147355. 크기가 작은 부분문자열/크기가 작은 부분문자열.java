class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int plength = p.length();
        long pvalue = Long.parseLong(p);
        
        for (int i = 0;  i <= t.length() - plength; i++) {
            String sub = t.substring(i, i + plength);
            
            if (Long.parseLong(sub) <= pvalue) {
                answer++;
            }
        }
        return answer;
    }
}