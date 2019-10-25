import java.util.Stack;

public class DecodeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(decodeString("3[a2[c]]"));
	}
	
	public static String decodeString(String s) {
		
		if(s.length() == 0 || s==null)
			return s;
		Stack<String> stack = new Stack<String>();
		String substring="";
		double count=0,j=0;
		for(int i= s.length()-1; i>=0; i--) {
			if(s.charAt(i) == '[') {
				while(!stack.isEmpty()) {
					String temp = stack.pop();
					if(temp.equals("]"))
						break;
					else
						substring = substring + temp;
				}
			}
			else if(Character.getNumericValue(s.charAt(i)) >=0 && Character.getNumericValue(s.charAt(i)) <= 9) {
				while( i>=0 && Character.isDigit(s.charAt(i)) ) {
					int temp = Character.getNumericValue(s.charAt(i));
					count = (temp * Math.pow(10, j++)) + count;
					i--;
				}
				while(count>0) {
					stack.push(substring);
					count--;
				}
				substring="";
				j=0;
				i++;
			}else {
				stack.push(Character.toString(s.charAt(i)));
			}	
		}
		String result="";
		while(!stack.isEmpty()) {
			result = result + stack.pop();
		}
		return result;
	}
}
