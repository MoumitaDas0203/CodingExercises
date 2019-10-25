import java.util.PriorityQueue;

public class FindKthLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,2,3,1,2,4,5,5,6};
		System.out.println(findKthLargest(arr,4	));
	}
	public static int findKthLargest(int[] nums, int k) {
	      
	   PriorityQueue<Integer> pq = new PriorityQueue<>( (a,b) -> b-a);
	   for(int num : nums)
		   pq.add(num);
	int num=0;
	while(k>0) {
		num = pq.poll();
		k--;
	}
	
	return num;
}
	
}
