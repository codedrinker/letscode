package ValidParentheses.beau0303;

import java.util.Stack;

/**
 * Created by IntelliJ IDEA.
 * Author:MeiFan
 * Date: 2019/6/6 8:00
 * e-mail:codemeifan@gmail.com.
 */
public class Solution {
    public static boolean isValid(String s) {
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '(' || chars[i] == '[' || chars[i] == '{')
                stack.push(chars[i]);
            else if(stack.isEmpty())
                return false;
            else if(isMatch(stack.peek(),chars[i]))
                stack.pop();
            else return false;

        }
        return stack.isEmpty();
    }

    public static boolean isMatch(char c1, char c2) {
        if (c1 == '(' && c2 == ')')
            return true;
        else if (c1 == '[' && c2 == ']')
            return true;
        else if (c1 == '{' && c2 == '}')
            return true;
        else return false;
    }

    public static void main(String[] args) {


        boolean valid = isValid("()()()()");
        System.out.println(valid);
    }
}
