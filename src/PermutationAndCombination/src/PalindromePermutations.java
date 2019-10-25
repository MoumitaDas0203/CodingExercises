import java.util.HashSet;

public class PalindromePermutations {

		public static HashSet<String> hset = new HashSet<String>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str ="aabcb";
		frequency(str);
		
		/*int n=str.length()-1;
		Permute(str,0,n);
		for(String temp :hset)
		System.out.println(temp+"");
		*/
	}
	
	public static void Permute(String s, int start, int end) {
		
		if(start==end) {
			if(isPalindrome(s)) 
				hset.add(s);
				//System.out.println(s);
			
		}
		else {
			for(int i=start;i<=end;i++) {
				s= swap(s, start,i);
				Permute(s, start+1, end);
				s=swap(s, start,i);
			}
		}
		
			
	}
	public static String swap(String s, int i, int j) {
		
		char[] chars = s.toCharArray();
		char temp = chars[i];
		chars[i] = chars[j];
		chars[j] = temp;
		
		return String.valueOf(chars);
	}
	
	public static boolean isPalindrome(String s) {
		
		for(int i=0,j=s.length()-1;i<s.length();i++,j--) {
			if(j>=0) {
			if(s.charAt(i) != s.charAt(j))
				return false;
			}
		}
		
		return true;
	}
	
public static int[] frequency(String s) {
	int[] count = new int[26];
	char[] chars = s.toCharArray();
	for(int i=0;i<s.length();i++) {
		count[chars[i] - 'a']++;
	}
	
	return count;
}

public static boolean isPalindrome(String s,int[] count) {
	int oddc=1 ;
	for(int t: count) {
		if(t%2!=0)
			oddc++;
	}
	if((s.length()%2==1 && oddc==1)|| (s.length()%2==0 && oddc==0))
		return true;
	
	return false;
}

}
