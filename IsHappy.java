import java.util.HashSet;

public class IsHappy {

	public static void main(String[] args) {
		
		System.out.println(isHappy(2));
		
	}
	public static boolean isHappy(int n) {
		
		HashSet<Integer> hset = new HashSet<Integer>();
		int digit =0;
		int sumOfSquares =0;
		while(hset.add(n)) {
		while(n>0) {
			System.out.println(n);
			digit = n%10;
			sumOfSquares = sumOfSquares + digit * digit;
			
			n = n/10;
		}
		
		if(sumOfSquares == 1) {
			return true;
		}
		if(n==0) {
			n=sumOfSquares;
			sumOfSquares=0;
		}
			
		}
		return false;
	}
}
