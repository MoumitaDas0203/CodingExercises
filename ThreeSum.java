import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class ThreeSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {-1, 0, 1, 2, -1, -4};
		List<List<Integer>> sums = threeSum(nums);
		for(List<Integer> temp : sums){
			System.out.print(temp+",");
		}
		
	}
	 public static List<List<Integer>> threeSum(int[] nums) {
	    Arrays.sort(nums);
	    List<List<Integer>> sums = new LinkedList<>(); 
		
		for(int i=0;i<nums.length-2;i++){
			if(i==0 || (i>0 && nums[i] != nums[i+1])) {
			//if (i>=0 && nums[i] != nums[i+1]) {
			int start = i+1;
			int end = nums.length-1;
			int ThreeSum = 0-nums[i];
			while(start<end) {
				int TwoSum=nums[start]+nums[end];
				if(TwoSum==ThreeSum) {
					sums.add(Arrays.asList(nums[start],nums[end],nums[i]));
					 while (start < end && nums[start] == nums[start+1]) start++;
	                 while (start < end && nums[end] == nums[end-1]) end--;
	                 start++;end--;
				}else if(TwoSum < ThreeSum) 
					start++;
				else
					end--;		
			}
		}
	}
	return sums; 
	}

}
