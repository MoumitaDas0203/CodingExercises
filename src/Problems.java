import java.util.ArrayList;

public class Problems {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//multiples(1000);
		//fib1(10);
		getPrime(600851475143L);
	}
	
	public static void multiples(int n) {
 		int sum=0;
 		for(int i=0;i<n;i++) {
 			if( i%3==0 || i%5==0 || (i%3==0 && i%5==0)) {
 				sum = sum + i;
 			}
 		}
 		System.out.println(sum);
 	}
	
	 public static int fib1(int N) {
		 int evensum =0;
		 ArrayList<Integer> arr = new ArrayList<Integer>();
		 if(N==0) return 0;
		 if(N==1) return 1;
	        int a=1,b=2;
	        arr.add(a);
	        arr.add(b);
	        int c= 0;
	        for(int i=3;;i=i+1){
	            c = a+b;
	            if(c>4000000)
	            	break;
	            if(c<=4000000)
	            	arr.add(c);
	            a=b;
	            b=c;
	        }
	        
	        for(int t: arr) {
	        	if(t%2==0) {
	        		evensum = evensum + t;
	        	}
	        	System.out.print(t+" ");
	        }
	        System.out.println("hoiya "+evensum);
	        return c;
	    }
	 
	 public static void getPrime(long n) {
		 int maxPrime=-1;
		 double sqr = Math.sqrt(n);
		 
		 for(int i=2;i<=sqr;i++) {
			 if(n%i==0) {
				 if(isPrime(i))
					 maxPrime = Math.max(maxPrime, i);
			 }
		 }
		 System.out.print(maxPrime);
		 
	 }
	 
	 public static boolean isPrime(int n) {
		 
		 for(int i=2;i<n;i++) {
			 if(n%i==0)
				 return false;
		 }
		 return true;
	 }
	 
	 
	 
	 

}
