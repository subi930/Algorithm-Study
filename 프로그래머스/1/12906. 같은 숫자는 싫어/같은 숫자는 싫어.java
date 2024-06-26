import java.util.*;

public class Solution {
    public Stack solution(int []arr) {
       
        Stack<Integer> stack = new Stack<>();
        for(int a : arr){
            if(stack.isEmpty() || stack.peek()!=a){
                stack.push(a);
            }
        }

        return stack;
    }
}