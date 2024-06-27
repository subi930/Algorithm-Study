import java.util.Stack;

class Solution {
    boolean solution(String s) {
        // 스택 이용
        // 1. '(' 올 시, 스택에 저장
        // 2. ')' 올 시, pop 수행, 스택이 비워있으면 return false
        // 3. 문자열 검사가 다 끝나고 스택이 비워있으면 return true
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(') stack.add(s.charAt(i));
            else {
                if(stack.empty()) return false;
                stack.pop();
            }
        }
        if(stack.empty()) return true;
        else return false;
    }
}