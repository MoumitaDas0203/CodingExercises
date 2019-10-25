import java.util.LinkedHashMap;

public class AlienSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] words = {"hello","leetcode"};
		String order = "hlabcdefgijkmnopqrstuvwxyz";
		System.out.println(isAlienSorted(words,order));
	}
	public static boolean isAlienSorted(String[] words, String order) {
    
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		int priority=1;
		for(char c : order.toCharArray()) {
			map.put(c,priority++);
		}
		String first = words[0];
		boolean rs = false;
		for(int i=1;i<words.length;i++) {
			String second = words[i];
			rs = sort(first, second, map); 
			if(rs==false) return false;
			first = second;
		}
		
		return true;
    }
	public static boolean sort(String first, String second, LinkedHashMap<Character, Integer> map) {
		
		int i=0,j=0;
		while(i< first.length() && j<second.length()) {
			int index1 = map.get(first.charAt(i));
			int index2 = map.get(second.charAt(j));
			if(index1 == index2) {
				i++;j++;
			}
			if(index1 > index2) 
				return false;
			if(index2 > index1)
				return true;
			
			
		}
		if(i<first.length()) {
			return false;
		}	
		return true;
	}

}
