class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {

        int index1 = 0, index2 = 0;
        String answer = "Yes";
        
        for (int i = 0; i < goal.length; i++) {
            String currentGoal = goal[i];
            
            if (index1 < cards1.length && currentGoal.equals(cards1[index1])) {
                index1++;
            
            } else if (index2 < cards2.length && currentGoal.equals(cards2[index2])) {
                index2++;
                
            } else {
                answer = "No";
                return answer;
            }
        }
        
        return answer;
    }
}