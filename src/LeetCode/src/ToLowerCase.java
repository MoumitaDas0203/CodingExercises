import java.util.Arrays;
import java.util.HashSet;

public class ToLowerCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(toLowerCase("LOVELY"));
		int[] A = {-4,-1,0,3,10};
		A = sortedSquares(A);
		for(int temp: A)
			System.out.print(temp+" ");
	}
	
	public static String toLowerCase(String str) {
		if(str == "" || str.length() == 0)
			return str;
        char[] strs = str.toCharArray();
        for(int i=0;i<strs.length;i++) {
        	int temp = str.charAt(i);
        	if(temp >=65 && temp <=91)
        		temp = str.charAt(i)+32;
        		strs[i] = (char) temp;
        }
        return new String(strs);
    }
	
	public static int[] sortedSquares(int[] A) {
        
		for(int num=0;num<A.length;num++) {
				A[num] = A[num] * A[num];
		}
		Arrays.sort(A);
		return A;
    }
	
	}
