package ValidParenthesisString.ZHANGJIKAI5;

/**
 * author：ZHANGJIKAI5
 * 题目：678. Valid Parenthesis String
 * 解题思路：
 */
public class ValidParenthesisString {

    public boolean checkValidString(String s) {
        char[] chars = s.toCharArray();





        return false;
    }

    public static void main(String[] args) {
        ValidParenthesisString validParenthesisString = new ValidParenthesisString();
        String s1 = "(*))";
        String s2 = "(*)";
        System.out.println("s1:" + validParenthesisString.checkValidString(s1));
        System.out.println("s2:" + validParenthesisString.checkValidString(s2));

    }

}
