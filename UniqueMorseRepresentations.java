import java.util.HashMap;
import java.util.HashSet;

public class UniqueMorseRepresentations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = {"gin", "zen", "gig", "msg"};
		System.out.println(uniqueMorseRepresentations(words));
	}
	 public static int uniqueMorseRepresentations(String[] words) {
		 HashSet<String> hset = new HashSet<String>();
		 HashMap<Character, String> morseCode = new HashMap<Character,String>();
		 String[] morseCodes = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
		 
		 for(int i=97,j=0;i<=122;i++,j++) {
			 morseCode.put((char) i, morseCodes[j] );
		 }
		 
		 for(String word : words) {
			 char[] temp = word.toCharArray();
			 String code = null;
			 for(char letter: temp) {
				 code = code + morseCode.get(letter);
			 }
			hset.add(code); 
		 }
		 return hset.size();
	 }

}
