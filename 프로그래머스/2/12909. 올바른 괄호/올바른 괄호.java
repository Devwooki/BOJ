import java.util.*;
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Stack<Character> stack = new Stack<>();
        for(int i = 0 ; i < s.length(); ++i){
            if(s.charAt(i) =='(') stack.add(s.charAt(i));
            else if(s.charAt(i) ==')') {
                if(stack.isEmpty()) return false;
                   
                if(stack.peek() == '(') stack.pop();
            }
        }
        
        return stack.isEmpty() ? true : false;
    }
}