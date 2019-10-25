

import java.util.HashMap;
import java.util.HashSet;

public class ClimbStairs {

	public static HashMap<Integer, Integer> memo = new HashMap<Integer, Integer>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(climbStairs(45));
	}
	
	public static int climbStairs(int n) {
		  
		 if (n == 1) {
			memo.put(n,1);
			 return 1;
		 }
		 if (n == 2) {
			 memo.put(n,2);
			 return 2;
		 }
		 if (n == 3) {
			 memo.put(n,3);
			 return 3;
		 }

		 if(memo.containsKey(n)) {
			return memo.get(n);
		 }else {
			 int result = climbStairs(n-1) + climbStairs(n-2);
			 memo.put(n, result);
			 return result;
		 }
    }
}
