import java.util.TreeSet;

public class SearchRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] nums= {5,7,7,8,8,10};
		int[] nums= {2,2,2};
		int[] temp =searchRange(nums,2);
		
		for(int t : temp)
			System.out.println(t+" ");
	}
	
	 public static int[] searchRange(int[] nums, int target) {
		 int[] range = new int[2];
		 range[0]= -1;
		 range[1]= -1;
		 if(nums.length==1 && nums[0]!=target) 
			 return range;
		 if(nums.length==1 && nums[0]==target) { 
			
			 range[0]=0;
			 range[1]=0;
			 
			 return range;
		 }
		 int k=0;
		 int low=0, hi=nums.length-1;
		 
		 	while(low<=hi && k<2) { 
		 		int mid = low + (hi-low)/2;
		 		
		 		if(nums[mid]==target) {
		 			range[k++]=mid;
		 		if((mid-1) > 0 && nums[mid-1] <= target)
		 			low=mid+1;
		 		else
		 			hi = mid;
		 		}
		 		else if(nums[mid]<=target) {
		 			if( (mid+1) < nums.length && (nums[mid+1]) == target) {
		 				range[k++]= mid+1;
		 				low=mid+1;
		 			}else
		 				low = mid+1;
		 		}
		 		else if (nums[mid]>=target){
		 			if((mid-1) >=0 && (nums[mid-1])==target) {
		 				range[k++]=mid-1;
		 				hi=mid-1;
		 			}else
		 				hi=mid-1;	
		 		}
		 }
		 	if(range[0]>range[1]) {
		 		int temp = range[0];
		 		range[0] = range[1];
		 		range[1] = temp;
		 	}
		 	return range;
	  }
}
