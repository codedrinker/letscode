package GenerateParentheses.mly;

import java.util.ArrayList;
import java.util.List;

class Solution {

    public List<String> generateParenthesis(int n) {
        if (n == 0 ){
            return null;
        }
        List<String> list =new ArrayList<String>();
        back(list,"",n,0);
        return list;

    }
    public void back(List<String> list,String s,int l,int r){
        if(l==0&&r==0){
            list.add(s);
            return;
        }
        if(l>0){
            back(list,s+"(",l-1,r+1);
        }
        if(r>0){
            back(list,s+")",l,r-1);
        }
    }


}