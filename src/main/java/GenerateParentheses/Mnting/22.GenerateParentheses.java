/*
 * @lc app=leetcode.cn id=22 lang=java
 * backtracking
 * 递归函数的开头写好跳出条件，满足条件才将当前结果加入总结果中
 * 已经拿过的数不再拿 if(s.contains(num)){continue;}
 * 遍历过当前节点后，为了回溯到上一步，要去掉已经加入到结果list中 * 的当前节点
 * [22] 括号生成
 */
import java.util.*;
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<String>();
        backtracking(list, 0, 0, "",n);
        return list;
    }
    public void backtracking(List<String> list,int open,int close,String str,int n){
        if(str.length()==2*n){
            list.add(str);
            return;
        }
        if(open<n){
            backtracking(list, open+1, close, str+"(", n);
        }
        if(close<open){
            backtracking(list, open, close+1, str+")", n);
        }
    }
}

