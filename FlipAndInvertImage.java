import java.util.Arrays;
import java.util.HashSet;

public class FlipAndInvertImage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] A= {{1,1,0}, {1,0,1}, {0,0,0}};
		//int[][] B = flipAndInvertImage(A);
		/*for( int[] t : B) {
			for(int t1 : t)
			System.out.print(t1+",");
			System.out.println();
		}
		*/
		/*int[] C = {3,1,2,4};
		sortArrayByParity(C);
		*/
		
		/*String str1 = "ABABAB";
		String str2 = "ABAB";
		System.out.print(gcdOfStrings(str1,str2));
		*/
		
		String str = "PAYPALISHIRING";
		convert(str,4);
}
	
	 public static void convert(String s, int numRows) {
	      int j=0, row = numRows, length = s.length(), index=0;
		 char[] str = s.toCharArray();
		 char[] ch = new char[s.length()];
		 int diag = row-2, k=1;
		 ch[0] = str[0];
		 for(int i=0;i<s.length();i++) { 
			 
			 while(i==0 && index < length){
				 index = i + index +  row + (row - diag);
				 if(index < length)
					 ch[k++] = str[index];
			 }
			 while(index < length){
				 index = i + index ;
				 ch[k++] = str[index];
				 ch[k] = str[index+ (row-diag)];
			 }
		 }
		 
		for(char c:ch)
			System.out.print(c);
		 
	 }
	 
	public static String gcdOfStrings(String s1, String s2) {
	String d = s1.length() < s2.length() ? s1 : s2;
    int n = d.length();
    for (int i = 1; i <= n; i++) {
        if (n % i != 0) continue;
        String sub = d.substring(0, n/i );
        if (s1.replaceAll(sub, "").equals("") && s2.replaceAll(sub, "").equals("")) {
            return sub;
        }
    }
    return "";
 }
	
	
	public static int[][] flipAndInvertImage(int[][] A) {
	
		for(int i=0;i<A.length;i++) {
			
			int[] arr = A[i];
			int first=0, last = arr.length-1;
			
			while(first < last) {
				int temp = arr[first];
				arr[first] = arr[last];
				arr[last] = temp;
				first++;last--;
			}
			first=0;
			while(first < arr.length) {
				arr[first] = (arr[first] == 0) ? 1 : 0;
				first++;
			}
		A[i] = arr;
		
		}
	 return A;
	}
	
	 public static void sortArrayByParity(int[] A) {
	        
	        int[] B = new int[A.length];
	        int first=0, last=A.length-1;
	        for(int i=0;i<A.length;i++){
	            if(A[i]%2 == 0) {
	            	B[first++] = A[i];
	            }
	            if(A[i]%2 != 0) {
	            	B[last--] = A[i];
	            }
	        }
	        
	        for(int temp : B )
	        	System.out.print(temp + ",");
	        
	    }

}
