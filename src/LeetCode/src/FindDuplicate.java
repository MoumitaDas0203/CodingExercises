import java.util.HashSet;

public class FindDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int findDuplicate(int[] nums) {
        int dup = 0;
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i=0;i<nums.length;i++){
			if(set.contains(nums[i])) {
				dup=nums[i];
				break;
			}
			else
				set.add(nums[i]);
		}
		return dup;
    }
}
