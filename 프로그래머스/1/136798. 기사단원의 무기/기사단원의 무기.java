class Solution {
    public int solution(int number, int limit, int power) {
        int [] knights = new int [number+1];
        
        for (int i = 1; i <= number; i++) {
            for (int j = i; j <= number; j += i) {
                knights[j]++;
            } 
        }
        
        int answer = 0;
        
        for (int i = 1; i <= number; i++) {
            int attack = knights[i];
            
            if (attack > limit) {
                answer += power;
            } else {
                answer += attack;
            }
            
        }
        
        return answer;
    }
}