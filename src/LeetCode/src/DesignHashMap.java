
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

//1	     1
//2.     11
//3.     21
//4.     1211
//5.     111221 
//6.     312211
//7.     13112221
//8.     1113213211
//9.     31131211131221
//10.   13211311123113112211

public class DesignHashMap {
	
	public  static LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = {"cool","lock","cook"};
		System.out.println(commonChars(words));
	}
	
	 public static List<Character> commonChars(String[] A) {
	        
	        int[] alph = new int[26];
	        for(int i=0;i<A[0].length();i++) {
	        	alph[i-'a']++;
	        }
	        for(int i=1;i<A.length;i++) {
	        	
	        	
	        }
			return null;
	    }
	 
	 

}
