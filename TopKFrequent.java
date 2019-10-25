import java.awt.List;
import java.util.*;
import java.util.Map.Entry;

public class TopKFrequent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1};
		int k=2;
		topKFrequent(nums, k);
	}
	
	public static ArrayList<Integer> topKFrequent(int[] nums, int k) {
        
		HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<nums.length;i++) {
			int key = nums[i];
			if(!map.containsKey(key)) {
				map.put(key,1);
			}else {
				int val = map.get(key);
				map.put(key, val+1);
			}
		}
		
	LinkedList<Map.Entry<Integer, Integer>> unsortedlist = new LinkedList<Map.Entry<Integer, Integer>>(map.entrySet());
	Collections.sort(unsortedlist, new Comparator<Map.Entry<Integer, Integer>>() { 
        public int compare(Map.Entry<Integer, Integer> o1,  
                           Map.Entry<Integer, Integer> o2) 
        { 
            if(o1.getValue() > o2.getValue())
            	return -1;
            if(o1.getValue() < o2.getValue())
            	return 1;
            return 0;
        } 
    }); 	
	ArrayList<Integer> FrequenyList = new ArrayList<Integer>();
	HashMap<Integer, Integer> temp = new LinkedHashMap<Integer, Integer>(); 
    for (Map.Entry<Integer, Integer> aa : unsortedlist) { 
        temp.put(aa.getKey(), aa.getValue()); 
    } 
	Iterator<Map.Entry<Integer, Integer>> it = temp.entrySet().iterator();
	    while (it.hasNext() && k>0) {
        Map.Entry pair = it.next();
        FrequenyList.add((Integer) pair.getKey());
        System.out.println(pair.getKey() + " = " + pair.getValue());
        k--;
        it.remove(); // avoids a ConcurrentModificationException
    }
		
	return FrequenyList;
    }
}
