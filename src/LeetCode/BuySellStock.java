
import java.util.PriorityQueue;

public class BuySellStock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] prices = {2,1,2,1,0,1,2};
		System.out.println(maxProfit(prices));
	}
	
	
	
	public static int maxProfit(int[] prices) {
	
	if(prices.length==0 || prices.length==1 ) return 0;
		
		
	PriorityQueue<Integer> pq = new PriorityQueue<Integer>((a,b)->b-a);
	
	for(int i=1;i<prices.length;i++) {
		pq.offer(prices[i]);
	}
	int maxProfit = Integer.MIN_VALUE;

	int CP=0;	
	for(int i=0;i<prices.length;i++) {
		CP = prices[i];
		if(!pq.isEmpty()) {
			int SP = pq.peek();
			maxProfit = Math.max(SP-CP, maxProfit);
			if(i>0)
			pq.remove(CP);
		}
	}
		return maxProfit;
        
    }

}
