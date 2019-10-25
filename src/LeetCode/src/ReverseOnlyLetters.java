import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class ReverseOnlyLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.print(reverseOnlyLetters("a-bC-dEf-ghIj"));
		//System.out.print(toGoatLatin("I speak Goat Latin"));
		//System.out.print(buddyStrings("aa","aa"));
		int[] arr1 = {2,3,1,3,2,4,6,7,9,2,19};
		int[] arr2= {2,1,4,3,9,6};
		//relativeSortArray(arr1,arr2);
		//System.out.println(detectCapitalUse("uSa"));
		String paragraph= "Bob. hIt, baLl";
		String[] banned = {"bob","hit"};
		System.out.println(mostCommonWord(paragraph,banned));
	}
	
	public static String reverseOnlyLetters(String S) {
		
		if(S==null || S.isEmpty()) return S;
		
		int i=0, j=S.length()-1;
		char[] str = S.toCharArray();
		while(i<j) {
			if( Character.isLetter(str[i]) && Character.isLetter(str[j])){
				char temp = S.charAt(i);
				str[i] = S.charAt(j);
				str[j]  =temp;
				i++;
				j--;
			}
			else if ( !Character.isLetter(str[i])){
				i++;
			}
			else if ( !Character.isLetter(str[j])){
				j--;
			}
			
			else
			{
				i++;
				j--;
			}
			
		}
		return new String(str);
    }
	
	 public static String toGoatLatin(String S) {
		 
		 String append="a";
		 String[] str = S.split("\\s");
		 for(int i=0; i<str.length;i++) {
			String word = str[i];
			char letter = word.charAt(0);
			if(letter =='a' || letter =='e' || letter =='i' || letter =='o' ||letter =='u' ||
			   letter =='A' || letter =='E' || letter =='I' || letter =='O' ||letter =='U' ) {
				str[i] = word + "ma" + append;
			}
			else {
				char temp = word.charAt(0);
				str[i] = word.substring(1)+temp+"ma"+append;
				}
			append = append + "a";
			}
		 StringBuffer sb = new StringBuffer();
		 for(String s : str) {
			sb.append(s);
			sb.append(" ");
		 }
		 
		 return sb.toString().trim();
		}
	 
	 public static boolean buddyStrings(String A, String B) {
	     
		 if(A.length()!= B.length() || (A.isEmpty() || B.isEmpty()) ) return false;
		
		 char[] Arr = A.toCharArray();
		 char[] Brr = B.toCharArray();
		 
		 if(A.equals(B)) {
			 int[] freq = new int[26];
			 for(char c : A.toCharArray()) {
				 freq[c-'a']++;
				 if(freq[c-'a'] >1) return true;
			 }
			 return false;
		 }
		 List<Integer> list = new ArrayList<Integer>();
		 for(int i=0;i<A.length();i++) {
			if(Arr[i] != Brr[i]) {
				list.add(i);
			}
		 }
		 
		 if(list.size() != 2) return false;
		 
		 int i = list.get(0);
		 int j = list.get(1);
		 
		 return (A.charAt(i)==B.charAt(j) && A.charAt(j)==B.charAt(i) );
	    }
	 
	 public static int[] relativeSortArray(int[] arr1, int[] arr2) {
		 
		 TreeMap<Integer,Integer> map = new TreeMap<Integer, Integer>();
		 for(int i=0;i<arr1.length;i++) {
			 if(!map.containsKey(arr1[i])){
				 map.put(arr1[i],1);
			 }else {
				 int count = map.get(arr1[i]);
				 map.put(arr1[i], count+1);
			 }
		 }
		 int index=0;
		 ArrayList<Integer> list = new ArrayList<Integer>();
		 int[] result = new int[arr1.length];
		 for(int i=0;i<arr2.length;i++) {
			 if(map.containsKey(arr2[i])) {
				 int count = map.get(arr2[i]);
				 while(count>0) {
					 result[index++]=arr2[i];
					 map.remove(arr2[i]);
					 count--;
				 }
			 }
		 }
		 Iterator it = map.entrySet().iterator();
		 while(it.hasNext()) {
			Map.Entry<Integer, Integer> ob = (Map.Entry<Integer, Integer>) it.next();
			int value = ob.getKey();
			int count = ob.getValue();
			while(count>0) {
				 result[index++]=value;
				 //map.remove(value);
				 count--;
			 }
		 }
		
	     return result;   
	    }
	 
	 public static boolean detectCapitalUse(String word) {
	     int count =0;
		 char[] ch = word.toCharArray();
		 for(int i=1;i< ch.length; i++) {
			 if(ch[i] >= 'A' && ch[i] <= 'Z')
				 count++;
		 }
		if(count == 0 || count == word.length()) return true;
		
		if(count==1 && ch[0] >= 'A' && ch[0] <='Z') return true;
		
		return false;
	    }
	 
	 public static String mostCommonWord(String paragraph, String[] banned) {
		 TreeMap<String, Integer> map = new TreeMap<String,Integer>();
		 HashSet<String> set = new HashSet<String>();
	  
		 	for (String word : banned) {
		 		set.add(word);
		 	}
			String[] words = paragraph.split("[\\s\\,\\!\\?\\'\\;\\.]");
			for(String word : words) {
				if(!set.contains(word.toLowerCase()) && word!="" && !word.isEmpty()) {
					if (!map.containsKey(word.toLowerCase())) {
						map.put(word.toLowerCase(), 1);
					}else {
						int count = map.get(word.toLowerCase());
						map.put(word.toLowerCase(), count+1);
					}
				}
			}
			int max = 0 ;
			String word1="";
			for(Map.Entry<String,Integer> entry : map.entrySet()) {
				  String key = entry.getKey();
				  Integer value = entry.getValue();
				  if(value >= max) {
					  max = value;
					  word1 = key; 
				  }
				 // System.out.println(key + " => " + value);
				}
			
			return word1;
		 }
	    }
	 


