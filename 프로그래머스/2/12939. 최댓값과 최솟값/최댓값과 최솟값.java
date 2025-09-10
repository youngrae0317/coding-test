import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String[] number = s.split(" ");
        
        int[] intArr = new int[number.length];
        for (int i = 0; i < number.length; i++) {
            intArr[i] = Integer.parseInt(number[i]);
        }
        
        Arrays.sort(intArr);
        
        return intArr[0] + " " + intArr[intArr.length - 1];
    }
}