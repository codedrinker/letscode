package ValidParenthesisString.mly;

public class Solution {
    public boolean checkValidString(String s) {
        int len = s.length();
        int l =0;
        for (int i=0;i<len;i++){
            if(l==0){
                i = s.indexOf("(",i);
                if(i==-1){
                    break;
                }
            }
            char c = s.charAt(i);
            if(c == '(') {
                l++;
            } else {
                l--;
            }

        }
        int r=0;
        for(int i= len-1;i>=0;i--){
            if(r ==0 ){
                i = s.lastIndexOf(")",i);
                if(i== -1){
                    break;
                }
            }
            if(s.charAt(i)==')'){
                r++;
            }else{
                r--;
            }
        }

        if(l==0&&r==0){
            return true;
        }else {
            return  false;
        }
    }
}
