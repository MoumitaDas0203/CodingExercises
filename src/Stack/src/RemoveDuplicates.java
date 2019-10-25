import java.util.HashSet;
import java.util.Stack;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(removeDuplicates("abbaca"));
	}
	 public static String removeDuplicates(String S) {
		 Stack<Character> s = new Stack<>();
	        StringBuilder sb = new StringBuilder();
	        for(int i=0;i<S.length();i++){
	            if(s.isEmpty()){
	                s.push(S.charAt(i));
	            }else{
	                if(s.peek() == S.charAt(i)){
	                    s.pop();
	                }else{
	                    s.push(S.charAt(i));
	                }
	            }
	        }
	        for(int i=0;i<s.size();i++){
	            sb.append(s.get(i));
	        }
	        return sb.toString();
	 }
	
	 
}
