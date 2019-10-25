
public class RemoveOuterParentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(removeOuterParentheses("(()())(())(()(()))"));

	}
	
	public static String removeOuterParentheses(String S) {
        
		StringBuffer sb = new StringBuffer();
		int open=0, close=0, start=0;
		for(int i=0;i<S.length();i++) {
			if(S.charAt(i) == '(')
				open++;
			else if(S.charAt(i) == ')')
				close++;
			if(open == close) {
				sb.append(S.substring(start+1, i));
				start = i+1;		
			}
		}
		
		return sb.toString();
    }

}
