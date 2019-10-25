import java.util.Comparator;
import java.util.PriorityQueue;

	
public class PriorityQueueExample {

	public static void main(String[] args) {
	int arr[] = new int[] { 1, 1, 1, 1, 2, 2, 3, 3 }; 
	rearrangeArray(arr); 
	} 

	// Function to rearrange numbers in array such 
	// that no two adjacent numbers are same 
		public static void rearrangeArray(int[] arr) 
		{ 
			int n = arr.length; 

			// Store frequencies of all elements 
			// of the array 
			int[] count = new int[10000]; 
			int visited[] = new int[10000]; 

			for (int i = 0; i < n; i++) 
				count[arr[i]]++; 

			// Insert all characters with their frequencies 
			// into a priority_queue 
		PriorityQueue<Key> pq = new PriorityQueue<>(new KeyComparator());

			// Adding high freq elements in descending order 
			for (int i = 0; i < n; i++) { 
				int val = arr[i]; 

				if (count[val] > 0 && visited[val] != 1) 
					pq.add(new Key(count[val], val)); 
				visited[val] = 1; 
			} 

			// 'result[]' that will store resultant value 
			int result[] = new int[n]; 

			// work as the previous visited element 
			// initial previous element will be ( '-1' and 
			// it's frequency will also be '-1' ) 
			Key prev = new Key(-1, -1); 

			// Traverse queue 
			int l = 0; 
			while (pq.size() != 0) { 

				// pop top element from queue and add it 
				// to result 
				Key k = pq.peek(); 
				pq.poll(); 
				result[l] = k.num; 

				// If frequency of previous element is less 
				// than zero that means it is useless, we 
				// need not to push it 
				if (prev.freq > 0) 
					pq.add(prev); 

				// make current element as the previous 
				// decrease frequency by 'one' 
				(k.freq)--; 
				prev = k; 
				l++; 
			} 

			// If length of the resultant array and original 
			// array is not same then the array is not valid 
			if (n != result.length) { 
				System.out.println(" Not valid Array "); 
			} 
			// Otherwise Print the result array 
			else { 
				for (int i : result) { 
					System.out.print(i + " "); 
				} 
			} 
		} 
		
		// Comparator class to sort in descending order 
		public static class KeyComparator implements Comparator<Key> { 

			// Overriding compare()method of Comparator 
			public int compare(Key k1, Key k2) 
			{ 
				if (k1.freq < k2.freq) 
					return 1; 
				else if (k1.freq > k2.freq) 
					return -1; 
				return 0; 
			} 
		} 

	} 


