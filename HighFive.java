import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.TreeMap;
import java.util.TreeSet;

public class HighFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] items = {
				{1,91},{1,92},{2,93},{2,97},{1,60},{2,77},{1,65},{1,87},{1,100},{2,100},{2,76}};
		int[][] arr = highFive(items);
		for (int i = 0; i < arr.length; i++) 
         System.out.println(arr[i][0]+" , "+arr[i][1]);
	}
	
	public static int[][] highFive(int[][] items) {
		
		TreeMap<Integer,PriorityQueue<Integer>> map = new TreeMap<Integer, PriorityQueue<Integer>>();
		
		for(int i=0;i<items.length;i++) {
			
			int id = items[i][0];
			int score = items[i][1];
			
			if(!map.containsKey(id)) {
				PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
				pq.add(score);
				map.put(id, pq);
			}else {
				PriorityQueue<Integer> pq = map.get(id);
				pq.add(score);
				map.put(id, pq);
			}	
		}
				
		Iterator<Map.Entry<Integer, PriorityQueue<Integer>>> itr = map.entrySet().iterator();
		int i=0;
		int[][] arr = new int[map.size()][2];
		 while(itr.hasNext()) 
	        { 
	             Entry<Integer, PriorityQueue<Integer>> entry = itr.next(); 
	             int id  =  entry.getKey() ;  
	             PriorityQueue<Integer> pq = entry.getValue();
	             int average=0,k=0;
	             while(!pq.isEmpty() && k<5) {
	            	 average = average + pq.poll();
	            	 k++;
	             }
	             arr[i][0] = id;
	             arr[i][1] = average/5;
	             i++;
	        }
		 
		 return arr;
	}
	
	public static int sumOfDigits(int[] A) {
	    
		TreeSet<Integer> set = new TreeSet<Integer>();
		for(int temp : A)
			set.add(temp);
		
		int num = set.first();
		int sum=0, remain;
		while(num>0) {
			remain = num%10;
			sum = sum + remain;
			num = num/10;
		}
		return sum%2!=0 ? 0: 1;
		
	}

}
