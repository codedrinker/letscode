import java.util.HashMap;
import java.util.Stack;

import com.ibm.db2.jcc.a.c;


public class ValidParentheses {

    public boolean isValid(String s) {
    	HashMap<Character, Character> cmHashMap = new HashMap<Character, Character>();
    	cmHashMap.put(')', '(');
    	cmHashMap.put(']', '[');
    	cmHashMap.put('}', '{');
    	Stack<Character> cStack = new Stack<Character>();
    	for(char c : s.toCharArray()){
    		if(cStack.isEmpty() && (c==')' || c==']' || c=='}')){
    			return false;
    		}else if((!cStack.isEmpty()) && (c==')' || c==']' || c=='}')){
    			if(cStack.pop() != cmHashMap.get(c)){
    				return false;
    			}
    		}else{
    			cStack.push(c);
    		}
    	}
    	
		return cStack.isEmpty();
        
    }

}
