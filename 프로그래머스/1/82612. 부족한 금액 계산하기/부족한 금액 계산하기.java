class Solution {
    public long solution(int price, int money, int count) {
        long sum = 0;
        
        for (int i = 1; i <= count; i++) {
            sum += (long)price * i;
        }
        
        if (sum > money) {
            return sum - money;
        } else {
            return 0;
        }

    }
}