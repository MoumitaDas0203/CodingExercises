import java.util.HashSet;

public class Monotonic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] A = {1,1,0};
		System.out.println(isMonotonic(A));

	}
	
	 public static  boolean isMonotonic(int[] A) {
		 
		 if (A.length==0) return false;
		 if (A.length==1) return true;
		 int[] count = new int[2];
		 
		 for(int i=1;i<A.length;i++) {
			 if(A[i] == A[i-1])
				 continue;
			 if(A[i] > A[i-1])
				 count[0] = 1;
			 if(A[i] < A[i-1])
				 count[1] = 1;
		 if(count[0] == 1 && count[1] == 1) return false;
		 }
		 return true;
	        
	    }

}
