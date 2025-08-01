class Solution {
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();
        
        for (int i = 1; i < food.length; i++) {
            int count = food[i] / 2;
            
            for (int j = 0; j < count; j++) {
                sb.append(i);
            }
        }
        
        String reverse = sb.reverse().toString();
        
        String original = sb.reverse().toString();
        
        return original + "0" + reverse;
    }
}