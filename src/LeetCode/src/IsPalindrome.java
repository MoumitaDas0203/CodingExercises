
public class IsPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "A man, a plan, a canal: Panama";
		System.out.println(isPalindromes(s));
	}
	
	public static boolean isPalindromes(String s) {
		
		if(s.isEmpty() || s== "" || s.length()==0)
			return true;
		String to="",fro="";
		int i=0,j=s.length() - 1;
		while(i<s.length() || j >=0) {
			int ascii = s.charAt(i);
			if( (ascii >=65 && ascii <=90) || ( ascii >=97 && ascii <=122) || (ascii >=48 && ascii <=57))
				to = to+ s.charAt(i);
			ascii = s.charAt(j);
			if( (ascii >=65 && ascii <=90) || ( ascii >=97 && ascii <=122) || (ascii >=48 && ascii <=57))
				fro = fro + s.charAt(j);
				i++;
				j--;
		}
		System.out.println(to);
		System.out.println(fro);
		return to.equalsIgnoreCase(fro);
    }
	
	public static boolean isPalindrome(String s) {
		
		if(s.isEmpty() || s== "" || s.length()==0)
			return true;
		String replacedstring = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
		/*String reversed ="";
		for(int i=replacedstring.length()-1;i>=0;i--) {
			reversed = reversed + replacedstring.charAt(i);	
		}*/
		String rev = new StringBuffer(replacedstring).reverse().toString();
		
		return replacedstring.equals(rev);
	}

}
