import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAnagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> t = new ArrayList<Integer>();
		t = findAnagrams("abab","ab");
		for( int num : t)
			System.out.println(num);
	}
	
	public static List<Integer> findAnagrams(String s, String p) {
		
		List<Integer> list = new ArrayList<Integer>();
		if(s.length()==0 || p.length()==0)
			return list;
		if(s.equalsIgnoreCase(p)) {
			list.add(0);
			return list;
		}
		
		char[] pars = p.toCharArray();
		Arrays.parallelSort(pars);
		int len = p.length()-1;
		for(int i=0;i+len<s.length();i++) {
			String substring = s.substring(i,i+len+1);
			char[] temp = substring.toCharArray();
			Arrays.sort(temp);
			if(Arrays.equals(temp, pars)) {
				list.add(i);
			}
		}
		return list;
    }

}
