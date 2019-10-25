import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class GroupAnagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
		groupAnagrams(strs);
	}
	public static List<List<String>> groupAnagrams(String[] strs) {
       
		List<List<String>> arrays = new ArrayList<List<String>>();
		HashMap<String, List<String>> hmap = new HashMap<String, List<String>>();
		
		for(int i=0;i<strs.length;i++) {
			
			char[] word = strs[i].toCharArray();
			Arrays.sort(word);
			String sortedword = new String(word);
			
			if (!hmap.containsKey(sortedword)){
				List<String> arr = new ArrayList<String>();
				arr.add(strs[i]);
				hmap.put(sortedword,arr);
			}else {
				List<String> t = hmap.get(sortedword);
				t.add(strs[i]);
				hmap.put(sortedword,t);
			}
		}	
			Iterator it = hmap.entrySet().iterator(); 
			while(it.hasNext()) {
				Map.Entry<String, List<String>> ele = (Map.Entry<String, List<String>>) it.next();
				arrays.add(ele.getValue());		
				hmap.remove(ele);
			}
		return arrays;
	}
}
