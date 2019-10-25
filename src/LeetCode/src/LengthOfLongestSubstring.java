import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

public class LengthOfLongestSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(lengthOfLongestSubstringsss("abcabcbb"));
	}
	public static int lengthOfLongestSubstrings(String s) {
		
		if(s.length()<=0)
			return 0;
		String temp = "";
		char[] chars = s.toCharArray();
		TreeSet<String> hmap  = new TreeSet<String>();
		int i, j=0,count=0;
		for( i=0;i< chars.length;i++){
			j=i;
			temp="";
			for(j=i;j<chars.length;j++){
				temp = temp + chars[j];
				if(!containsRepeatedCharacters(temp))
					hmap.add(temp);
				
			}
		}
		for( i=chars.length-1;i>=0;i--){
			j=i;
			temp="";
			for(j=i;j>=0;j--){
				temp = chars[j]+temp;
				if(!containsRepeatedCharacters(temp))
					hmap.add(temp);
				
			}
		}
		int prev = hmap.first().length();
		for(String val : hmap) {
			//System.out.println(val);
			if(val.length()>prev) {
				prev = val.length();
			}
		
		}
		return prev;
    }
	
	public static boolean containsRepeatedCharacters(String s) {
		
		HashSet<Character> set = new HashSet<Character>();
		for(int i=0;i<s.length();i++) {
			set.add(s.charAt(i));
		}
		if (s.length()==set.size())
			return false;
		
		return true;		
	}
	
	public static int lengthOfLongestSubstringss(String s) {
        if (s.length()==0) return 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int max=0;
        for (int i=0, j=0; i<s.length(); ++i){
            if (map.containsKey(s.charAt(i))){
                j = Math.max(j,map.get(s.charAt(i))+1);
            }
            map.put(s.charAt(i),i);
            max = Math.max(max,i-j+1);
        }
        return max;
    }
	
	public static int lengthOfLongestSubstringsss(String s) {
		if(s == null || s.length()<0)
			return 0;
		int i=0, j=0, ans=0;
		HashSet<Character> set = new HashSet<Character>();
		while(i< s.length() && j <s.length()) {
			if(!set.contains(s.charAt(j))){
				set.add(s.charAt(j++));
				ans = Math.max(ans, j-i);
						
			}else {
				set.remove(s.charAt(i++));
			}
		}
		return ans;
	}
	
}
