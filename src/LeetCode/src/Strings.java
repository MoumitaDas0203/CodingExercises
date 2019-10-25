import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.TreeMap;
import java.util.TreeSet;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String keyboard = "pqrstuvwxyzabcdefghijklmno";
		//String word = "leetcode";
		//System.out.print(calculateTime(keyboard, word));
		
		/*String[] queries = {"cbd"};
		String[] words = {"zaaaz"};
		int[] arr = numSmallerByFrequency(queries, words);
		for(int num : arr)
			System.out.print(num+" ");
			*/
		/*String t="abcde";
		String s ="ace";
		System.out.print(isSubsequence(s,t));
		*/
		
		//String[] words = {"w","wo","wor","worl","world"};
		String[] words = {"a","banana","app","appl","ap","apply","apple"};
		longestWord(words);
	}
	public static void longestWord(String[] words) {
	    
		TreeMap<Integer, ArrayList<String>> map = new TreeMap<Integer, ArrayList<String>>(Collections.reverseOrder());
		HashSet<String> set = new HashSet<String>();
		for(String w: words)
			set.add(w);
		
		int res=0;
		for(String word : words) {
			int index = word.length()-1;
			while(index<word.length() && index>=0) {
				String newword = word.substring(0,index--);
				if(set.contains(newword)) {
					res++;
				}				
			}
			if(res == word.length()-1) {
				if(!map.containsKey(word.length())) {
					ArrayList<String> list = new ArrayList<String>();
					list.add(word);
					map.put(word.length(),list);
				}else {
					ArrayList<String> temp = map.get(word.length());
					temp.add(word);
					map.put(word.length(),temp);
				}
			}
			res=0;
		}
		
		int key = map.firstKey();
		ArrayList<String> temp = map.get(key);
		String[] arr = new String[temp.size()];
		for(int i=0;i<temp.size();i++)
			arr[i] = temp.get(i);
		Arrays.sort(arr);
		System.out.println(arr[0]);
		
	}	

	 
	public static boolean isSubsequence(String s, String t) {
	if(s.length()==0 || t.length()==0) return false;      
	int ans = 0;
	int j=0;
		for(int i=0;i<t.length();i++) {
			char ch = t.charAt(i);
			if(ch == s.charAt(j)) {
				ans++;
				if(j == s.length()-1) {
					break;
				}
				j++;
			}
		}
	return ans==s.length() ? true : false;
 }
	public static String removeVowels(String S) {
	   
		String newstring="";
		HashSet<Character> set = new HashSet<Character>();
		set.add('a');set.add('e');set.add('i');set.add('o');set.add('u');
	
		for(int i=0;i<S.length();i++) {
			if( !set.contains(S.charAt(i))) {
				newstring = newstring+ S.charAt(i);
			}
		}
		return new String(newstring);
	}
	
	public static int calculateTime(String keyboard, String word) {
        
		if(word.length() == 1) return 0;
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i=0;i<keyboard.length();i++) {
			char temp = keyboard.charAt(i);
			map.put(temp, i);
		}
		int dist=0;
		for(int j=1;j<word.length();j++) {
			dist = dist + Math.abs(map.get(word.charAt(j-1)) - map.get(word.charAt(j)));			
		}
		return dist+ map.get(word.charAt(0));
    }
	
	public static int[] numSmallerByFrequency(String[] queries, String[] words) {
        ArrayList<Integer> res = new ArrayList<Integer>();
		HashMap<String, Integer> querymap = mapfunction(queries);
		HashMap<String, Integer> wordmap = mapfunction(words);
		int count=0;
		for(int i=0;i<queries.length;i++) {
			for(int j=0;j<words.length;j++) {
				int qlen = querymap.get(queries[i]);
				int wlen = wordmap.get(words[j]);
				if(wlen > qlen)
					count++;
			}
			res.add(count);
			count=0;
		}
		
		int[] arr = new int[res.size()];
		for(int k=0;k<arr.length;k++)
			arr[k] = res.get(k);
		return arr;
    }
	
	public static HashMap mapfunction(String[] queries) {
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for(String query : queries) {
			char[] ch = query.toCharArray();
			Arrays.sort(ch);
			String sorted = new String(ch);
			int i=0,count=0;
			char smallest = sorted.charAt(0);
			while(i<sorted.length()) {
				if(sorted.charAt(i) != smallest)
					break;
				i++;
				count++;
			}
			map.put(query, count);
		}
		return map;
		
	}
	
}
