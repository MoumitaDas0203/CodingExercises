import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reversee(123));
	}
	
	 
	 public static int reversee(int x) {
		 int rev = 0;
		 while (x!=0) {
			 int pop = x%10;
			 x = x/10;
			  if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
	          if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
	          rev = rev*10 + pop ;
		 }
		 
		 return rev;
	 }
}
