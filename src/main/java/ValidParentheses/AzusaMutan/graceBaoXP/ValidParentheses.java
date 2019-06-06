package ValidParentheses.AzusaMutan.graceBaoXP;

import java.util.HashMap;
import java.util.Map;

public class ValidParentheses {

    public boolean checkValidString(String s) {
        Map<Character,Character> map=new HashMap<>();
        map.put('}','{');
        map.put(']','[');
        map.put(')','(');
        char[] chars=new char[s.length()];
        int p=-1;
        for(int i=0;i<s.length();i++){
            if (map.containsValue(s.charAt(i))){
                p++;
                chars[p]=s.charAt(i);
            }
            if (map.containsKey(s.charAt(i))){
                if (p==-1||chars[p--]!=map.get(s.charAt(i))){
                    return false;
                }
            }
        }
        return p==-1;
    }
}
