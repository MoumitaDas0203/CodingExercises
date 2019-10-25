import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

public class FindAndReplacePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = {"abc","cba","xyx","yxx","yyx"};
		String pattern ="abc";
		List<String> temp = findAndReplacePattern(words, pattern);
		for(String t : temp)
			System.out.println(t);
	}
	
	 public static List<String> findAndReplacePattern(String[] words, String pattern) {
	 List<String> matched = new ArrayList<String>();
	 String patternMap = getMapping(pattern);
	 String tempPattern="";
	 for(String word: words) {
		 tempPattern = getMapping(word);
		 if(tempPattern.equals(patternMap))
				matched.add(word);		 
	 }
	 	return matched;
	 }
	 
	 public static String getMapping(String word) {
		 StringBuilder sb = new StringBuilder();
		 String pat="";
		 HashMap<Character, String> pmap = new HashMap<Character, String>();
		 for(int i=0;i<word.length();i++) {
			 char temp = word.charAt(i);
			 if(!pmap.containsKey(temp)) {
				 pat = i+"";
				 pmap.put(temp,pat);	 
			 }else {
				 if(i!=0) {
					pat  = pmap.get(temp);
				 }
			 }
			 sb.append(pat);
		 } 
		 return sb.toString();
	 }
	 
	/* public static List<String> findAndReplacePattern(String[] words, String pattern) {
	        List<String> result = new ArrayList<String>();
	        if(words == null || words.length == 0 || pattern == null)
	            return result;
	        
	        String patternPat = getPatternStr(pattern);
	        for(String word : words){
	            String wordPat = getPatternStr(word);
	            if(wordPat.equals(patternPat))
	                result.add(word);
	        }
	        return result;
	    }
	 
	 public static String getPatternStr(String str){
	        HashMap<Character, String> map = new HashMap<Character, String>();
	        StringBuilder sb = new StringBuilder();
	        String l = "";
	        
	        for(int i = 0; i < str.length(); i++){
	            char c = str.charAt(i);
	            if(map.containsKey(c) &&  i != 0){
	                l = map.get(c);
	            }
	            else{
	                l = i+"";
	                map.put(c, l);
	            }
	            sb.append(l);
	        }
	        String pat = sb.toString();
	        return pat;
	    }
	    */

}
