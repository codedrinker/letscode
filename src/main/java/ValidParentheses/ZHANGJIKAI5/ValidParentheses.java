package ValidParentheses.ZHANGJIKAI5;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * author：ZHANGJIKAI5
 * 题目：20. Valid Parentheses
 * 解题思路：
 */
public class ValidParentheses {

    /**
     * 第一次执行：
     * 执行用时 : 6 ms, 在Valid Parentheses的Java提交中击败了76.53% 的用户
     * 内存消耗 : 33.7 MB, 在Valid Parentheses的Java提交中击败了93.11% 的用户
     * 第二次执行：
     * 执行用时 : 5 ms, 在Valid Parentheses的Java提交中击败了84.74% 的用户
     * 内存消耗 : 33.7 MB, 在Valid Parentheses的Java提交中击败了92.63% 的用户
     * 第三次执行：
     * 执行用时 : 4 ms, 在Valid Parentheses的Java提交中击败了92.03% 的用户
     * 内存消耗 : 34.1 MB, 在Valid Parentheses的Java提交中击败了87.89% 的用户
     * 第四次执行：
     * 执行用时 : 4 ms, 在Valid Parentheses的Java提交中击败了92.03% 的用户
     * 内存消耗 : 33.6 MB, 在Valid Parentheses的Java提交中击败了93.88% 的用户
     *
     * 执行用时 : 3 ms, 在Valid Parentheses的Java提交中击败了96.83% 的用户
     * 内存消耗 : 33.4 MB, 在Valid Parentheses的Java提交中击败了97.20% 的用户
     * @param s
     * @return
     */
    public boolean isValid(String s) {
        char[] chars = s.toCharArray();
        LinkedList<Character> list = new LinkedList<Character>();
        if (chars.length > 0) {
            Map<Character, Character> all = new HashMap(chars.length);
            all.put(')', '(');
            all.put('}', '{');
            all.put(']', '[');
            for (char c : chars) {
                if ('(' == c || '{' == c || '[' == c) {
                    list.add(c);
                } else {
                    if (list.size() <= 0) {
                        return false;
                    }
                    // 第三四次执行
                    if (list.getLast() != all.get(c)) {
                        return false;
                    } else {
                        list.removeLast();
                    }
                    // 第一二次执行
                    /*if (')' == c) {
                        if ('(' != list.getLast()) {
                            return false;
                        } else {
                            list.removeLast();
                        }
                    } else if ('}' == c) {
                        if ('{' != list.getLast()) {
                            return false;
                        } else {
                            list.removeLast();
                        }
                    } else if (']' == c) {
                        if ('[' != list.getLast()) {
                            return false;
                        } else {
                            list.removeLast();
                        }
                    }*/
                }
            }
        }
        if (list.size() == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        ValidParentheses validParentheses = new ValidParentheses();
        String s1 = "([)]";
        String s2 = "()[]{}";
        String s3 = "]";
        String s4 = "[";
        System.out.println("s1:" + validParentheses.isValid(s1));
        System.out.println("s2:" + validParentheses.isValid(s2));
        System.out.println("s3:" + validParentheses.isValid(s3));
        System.out.println("s4:" + validParentheses.isValid(s4));


    }

}
