import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseParentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "(u(love)i)";
		System.out.print(reverseParentheses(s));
	}
	public static String reverseParentheses(String s) {
	Stack<Character> st = new Stack<>();
    for(char c: s.toCharArray()){
        if( c == ')'){
            Queue<Character> p = new LinkedList<>();
            while(!st.isEmpty() && st.peek() != '(') p.add(st.pop());
            if(!st.isEmpty()) st.pop();
            while(!p.isEmpty()) st.push(p.remove());
        } else {
            st.push(c);
        }
    }
    StringBuilder sb = new StringBuilder();
    while(!st.isEmpty()) sb.append(st.pop());
    
    return sb.reverse().toString();
    
	}
	
	public static String reverseParentheses2(String s) {
		
		 if(s.length() == 0) return "";
	        
	        int begin = 0, end = 0;
	        for(int i = 0; i < s.length(); i++){
	            if(s.charAt(i) == '(')    begin = i;
	            if(s.charAt(i) == ')') {  end = i;
	                StringBuilder sb = new StringBuilder(s.substring(begin+1, end));
	                return reverseParentheses(s.substring(0, begin) + sb.reverse().toString() + s.substring(end+1));
	            }
	        }
	        return s;
		
	}
	
	
	public static String reverseParentheses1(String s) {
        
		char[] ch = s.toCharArray();
		Stack<Character> stack = new Stack<Character>();
		Stack<Character> pq = new Stack<Character>();
		
		for(int i=ch.length-1;i>=0;i--) {
			stack.add(ch[i]);
		}
		String str="";
		
		while(( stack.contains('(') || stack.contains(')') ) ) {

			char c = stack.pop();
			if ( c==')') {
				while(pq.peek() != '(') {
					str = str + pq.pop();
				}
				pq.pop();
				str = getReversed(str);
				char[] temp = str.toCharArray();
				for(int i=0;i<temp.length;i++)
					stack.add(temp[i]);
				str="";
				while(!pq.isEmpty()) {
					stack.push(pq.pop());
				}
				
			} else {
				pq.push(c);
			}
		}
		while(!stack.isEmpty())
			str = str + stack.pop();
		return str;
    } 
	
	public static String getReversed(String s) {
		
		 char[] temp = s.toCharArray();
	        StringBuilder r = new StringBuilder();
	        for (int i = temp.length-1; i>=0; i--)
	            r.append(temp[i]);

	        return r.toString();
	}
	
	
}
