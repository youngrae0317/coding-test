import java.util.Stack;

class Solution {
    public int solution(String s) {
        int answer = 0;
        int len = s.length();
        
        for (int i = 0; i < len; i++) {
            String rotated = s.substring(i) + s.substring(0, i);
            
            if (isValid(rotated)) {
                answer++;
            }
        }
        
        return answer;
    }
    
    private boolean isValid(String str) {
        
        Stack<Character> stack = new Stack<>();
        
        for (char c : str.toCharArray()) {
            
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                
                char last = stack.pop();
                
                if (c == ')' && last != '(') return false;
                if (c == ']' && last != '[') return false;
                if (c == '}' && last != '{') return false;
            }
        }
        
        return stack.isEmpty();
    }
}