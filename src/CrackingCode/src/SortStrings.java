
public class SortStrings {
	
	static {
	 System.out.println("staticc");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	System.out.println(isPermutation("leslie","leslie"));
		
	}
	
	public static boolean isPermutation(String s, String t) {
		
		if(t.length() != s.length())
			return false;
		
		int[] letters = new int[128];
		char[] schar = s.toCharArray();
		for(int i=0;i<schar.length;i++) {
			int p = schar[i];
			letters[p]++;
		}
		
		for(int i=0;i<t.length();i++) {
			int c = t.charAt(i);
			if(--letters[c] < 0)
				return false;
		}
		
		return true;
	}

}
