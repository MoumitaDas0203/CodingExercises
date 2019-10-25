import java.util.HashMap;

public class Fibonacci {
	
	public static HashMap<Integer, Integer> memo = new HashMap<Integer, Integer>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(fib(9));

	}
	public static int fib(int n) {
		
	    // base cases
	    if (n == 0 || n == 1) {
	    	memo.put(n, n);
	        return n;
	    }
		    
	    if(memo.containsKey(n)) {
	    	return memo.get(n);
	    }else {
	    	int result = fib(n-1) + fib(n-2);
	    	memo.put(n, result);
	    	 return result;
	    }
	   
	}
}
