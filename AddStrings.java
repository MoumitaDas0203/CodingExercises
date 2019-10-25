
public class AddStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(addStrings("18","8"));
	}
	
	
	public static String addStrings(String num1, String num2) {
		
		int i= num1.length()-1;
		int j= num2.length()-1;
		int carry = 0, sum=0;
		char[] first = num1.toCharArray();
		char[] second = num2.toCharArray();
		String str = "";
		while(i>=0 && j>=0) {
		
			int a = first[i--] - '0';
			int b = second[j--] - '0';
			sum = a+b+carry;
			str =  sum%10 + str;
			carry = sum/10;
			
		}
		
		if(i>=0) {
			str = AdderHelper(i,first,carry,str);
		}else if(j>=0) {
			str = AdderHelper(j,second,carry,str);
		}
		else
			str = (carry>0)? carry+str : str;
		return new String(str);
	}
	public static String AdderHelper(int index, char[] ch, int carry, String str) {
		
		while(index>=0) {
			int num = ch[index--] - '0';
			int sum = num + carry;
			str = sum%10 + str;
			carry = sum/10;
		}
		str = (carry>0)? carry+str : str;
		carry=0;
		return str;
	}

}
