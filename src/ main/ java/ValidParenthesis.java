
public class ValidParenthesis {
	public boolean checkValidString(String s) {
		int low=0,height=0;//最小和最大左括号数说
		for(char c : s.toCharArray()){
			if(c=='('){
				low +=1;
			}else{
				low += (-1);
			}
			if(c != ')'){
				height +=1;
			}else{
				height += (-1);
			}
			if (height <0){
				break;
			}
			
			low = Math.max(low, 0);
		}
		
		return low==0;
        
    }
}
