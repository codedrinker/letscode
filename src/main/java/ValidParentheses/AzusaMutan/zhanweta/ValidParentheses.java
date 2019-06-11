package ValidParentheses.AzusaMutan.zhanweta;

//  '(', ')', '{', '}', '[' and ']'

import java.util.ArrayList;
import java.util.List;

public class ValidParentheses {
    public static void main(String [] args){
        String s =
                "{[]}";
        System.out.println(isValid(s));
    }
    public static boolean isValid(String s){
        
        List<Character> chars = new ArrayList<Character>();    //栈
        int len = s.length();    //s长度
//        chars.add(s.charAt(0));
        
         //将s的前半部分去重部分放入一个栈中
        for(int i = 0 ; i < len ; i ++ ){
            //chars长度为0，则直接添加
            if(chars.size() == 0)
                chars.add(s.charAt(i));
            
            //chars长度不为0且与栈顶数据不等，入栈
            else {
                switch (s.charAt(i)){
                    case ')':{
                        if(chars.get(chars.size()-1) == '(')
                            chars.remove(chars.size() - 1);
                        else
                            chars.add(s.charAt(i));
                        break;
                    }
                    case '}':{
                        if(chars.get(chars.size()-1) == '{')
                            chars.remove(chars.size() - 1);
                        else
                            chars.add(s.charAt(i));
                        break;

                    }
                    case ']':{
                        if(chars.get(chars.size()-1) == '[')
                            chars.remove(chars.size() - 1);
                        else
                            chars.add(s.charAt(i));
                        break;
                    }
                    default:
                        chars.add(s.charAt(i));
                        break;
                }
            }

        }

        return chars.size() == 0;
        
    }
}
