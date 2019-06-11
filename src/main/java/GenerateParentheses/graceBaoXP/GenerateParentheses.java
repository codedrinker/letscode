package GenerateParentheses.graceBaoXP;

import java.util.ArrayList;
import java.util.List;

/**
 * 全排列的题目，大部分用递归解决
 * 左右括号必须相等,先确定前缀，再递归
 */
public class GenerateParentheses {

    public List<String> generateParenthesis(int n) {
        List<String> list=new ArrayList<>();
        String s="";
        parenthesis((ArrayList<String>) list,s,n,n);
        return list;
    }

    public static void parenthesis(ArrayList<String> list,String s,Integer left,Integer right){
        if(left==0&&right==0){
            list.add(s);
        }
        if (left>0){
            parenthesis(list,s+'(',left-1,right);
        }
        if (right>0&&left<right){
            parenthesis(list,s+')',left,right-1);
        }
    }
}
