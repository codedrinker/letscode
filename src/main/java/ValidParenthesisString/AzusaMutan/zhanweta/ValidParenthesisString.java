package ValidParenthesisString.AzusaMutan.zhanweta;

import java.util.ArrayList;
import java.util.List;

public class ValidParenthesisString {
    public static void main(String [] args){
        String s =
                "((*)))";    // ((*))*)
        System.out.println(checkValidString(s));
    }
    public static boolean checkValidString(String s) {
        List<Character> chars = new ArrayList<Character>();   //栈_(
        int len = s.length();    //s长度
        //""->true
        if(s.equals(""))
            return true;
        else{
            //将s的前半部分去重部分放入一个栈中
            for(int i = 0 ; i < len ; i ++ ){
                //chars长度不为0且与栈顶数据不等，入栈
                    switch (s.charAt(i)){
                        case ')':{
                            if(chars.size() == 0 )
                                return false;
                            else if(chars.get(chars.size() - 1) == '*'){
                                int lenC = chars.size();
                                for(int j = lenC-2 ; j >= 0; j--){
                                    if(chars.get(j) == '(' ){
                                        chars.remove(j);
                                        break;
                                    }
                                }
                                if(lenC == chars.size()) {
                                    chars.remove(chars.size() - 1);
                                }
                            }else {
                                chars.remove(chars.size() - 1);

                            }
                            break;
                        }
                        case '*':{
                            chars.add('*');

                            break;
                        }
                        default:
                            chars.add('(');

                            break;
                    }
                }

            }

            //二次处理
        int lenS = chars.size();
        int pos = 0;
        for(int j = 0 ; j < lenS ; j ++){
            if(chars.get(j) == '(')
                pos++;
            else if(pos > 0 && chars.get(j) == '*'){
                pos --;
            }
        }

            return pos == 0;
        }

}
