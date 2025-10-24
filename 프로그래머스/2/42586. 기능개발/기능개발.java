import java.util.Queue;
import java.util.LinkedList;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> days = new LinkedList<>();
        
        for (int i = 0; i < progresses.length; i++) {
            int remain = 100 - progresses[i];
            int speed = speeds[i];
            
            int daysNeeded = (remain + speed - 1) / speed;
            
            days.add(daysNeeded);
        }
        
        ArrayList<Integer> answerList = new ArrayList<>();
        
        while (!days.isEmpty()) {
            int deployDay = days.poll();
            int count = 1;
            
            while (!days.isEmpty() && days.peek() <= deployDay) {
                days.poll();
                count++; // 배포 묶음 카운트 증가
            }
            
            // 이번 배포 묶음의 총 기능 수를 정답 리스트에 추가
            answerList.add(count);
        }
        
        int[] answer = new int[answerList.size()];
        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }
        
        return answer;
    }
}