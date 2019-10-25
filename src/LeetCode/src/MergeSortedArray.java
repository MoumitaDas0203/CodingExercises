import java.util.Arrays;

public class MergeSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = {0};
		int[] nums2 = {1};
		merge(nums1, 0, nums2,1);
		
	}
	
	 public static void merge(int[] nums1, int m, int[] nums2, int n) {
		 
		int i=m;
		 
		 for(int k = 0;i<nums1.length; i++,k++) {
			 if(k < nums2.length) {
				 if(nums2[k] !=0)
					 nums1[i] = nums2[k];
			 }
				 
		 }
		 Arrays.sort(nums1);
		 
		 for(int num : nums1)
			 System.out.print(num);
		 
	 }

}
