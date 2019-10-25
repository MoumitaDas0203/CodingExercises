
public class SearchRotatedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {4,5,6,7,0,1,2};
		System.out.print(search(arr,0));
	}
	
	public static int search(int[] nums, int target) {
        
	    return binarySearch(nums, 0, nums.length-1, target);  
	 }
    
    public static int binarySearch(int[] nums, int low, int high, int target){
        while(low<high) {
	        int medium = low + (low+high)/2;
	        if(nums[medium] == target){
	            return medium;
	        }else if (nums[medium] < target ){
	            return binarySearch(nums, medium+1, high, target);
	        }else
	            return binarySearch(nums, low, medium-1, target);
        }
        return -1;
    }
}
