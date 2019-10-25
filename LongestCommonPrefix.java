import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String[] strs = {"flower","flow","flight"};
		//System.out.print(longestCommonPrefix(strs));
		
		int[] arr = {1,2,3,2,1};
		int[] brr = { 3,2,1,4,7 };
		System.out.print(findLength(arr,brr));
	}
	
	 public static int findLength(int[] A, int[] B) {
	       
		 int ans = 0;
	        int[][] memo = new int[A.length + 1][B.length + 1];
	        for (int i = A.length - 1; i >= 0; --i) {
	            for (int j = B.length - 1; j >= 0; --j) {
	                if (A[i] == B[j]) {
	                    memo[i][j] = memo[i+1][j+1] + 1;
	                    if (ans < memo[i][j]) ans = memo[i][j];
	                }
	            }
	        }
	        return ans;
	 }
	 
	public static String longestCommonPrefix(String[] strs) {		
		 if(strs.length == 0) return "";
	     if(strs.length == 1) return strs[0]; 
	     if(strs == null || strs.length == 0)    return "";
	     String pre = strs[0];
	     int i = 1,end=0;
	     while(i < strs.length){
	    	 String word = strs[i];
	         while(word.indexOf(pre) != 0) {
	        	 end = pre.length()-1;
	             pre = pre.substring(0,end);
	         }
	         i++;
	     }
	     return pre;
		
	}
	
	
	
}
