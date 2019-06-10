package ValidParentheses.mly;


import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> paramMap = new HashMap<Character, Character>();
        paramMap.put('(',')');
        paramMap.put('[',']');
        paramMap.put('{','}');
        Stack<Character> stack = new Stack<Character>();

        for(char c:s.toCharArray()) {
            if (paramMap.containsKey(c)){
                stack.push(c);
            } else if(stack.isEmpty() || paramMap.get(stack.pop())!=c){
                return false;
            }
        }
        if (stack.isEmpty()) {
            return  true;
        } else {
            return false;
        }

    }
}
