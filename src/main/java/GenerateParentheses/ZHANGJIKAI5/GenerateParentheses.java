package GenerateParentheses.ZHANGJIKAI5;

import java.util.ArrayList;
import java.util.List;

/**
 * author：ZHANGJIKAI5
 * 题目：22. Generate Parentheses
 * 解题思路：
 */
public class GenerateParentheses {

    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<String>();
        List<Character> left = new ArrayList<Character>(n);
        List<Character> right = new ArrayList<Character>(n);
        for (int i=0; i<n; i++) {

            for (int j=0; j<n; j++) {

            }

        }




        return list;
    }

    public static void main(String[] args) {
        int n = 3;
        GenerateParentheses generateParentheses = new GenerateParentheses();
        List<String> list = generateParentheses.generateParenthesis(n);
        for (String s: list
             ) {
            System.out.println(s);
        }
    }

}
