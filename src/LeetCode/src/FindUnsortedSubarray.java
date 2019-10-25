import java.util.Arrays;

public class FindUnsortedSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {2, 6, 4, 8, 10, 9, 15};
		System.out.println(findUnsortedSubarray(nums));
	}
	
	public static int findUnsortedSubarray(int[] nums) {
		if(nums.length==0) return 0;
		int[] unsorted = new int[nums.length];
		for(int i=0;i<nums.length;i++) {
			unsorted[i] = nums[i];
		}
		Arrays.sort(nums);
		if(Arrays.equals(nums, unsorted)) return 0;
		int start=0, end=0;
		for(int i=0;i<nums.length;i++) {
			if(unsorted[i] != nums[i] ) {
				start=i;
			break;
			}
		}
		for(int i=nums.length-1;i>=0;i--) {
			if(unsorted[i] != nums[i] ) {
				end=i;
			break;
			}
		}
		return end-start+1;
        
    }

}
