import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class FindDisappearedNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {4,3,2,7,8,2,3,1};
		List<Integer> temp = findDisappearedNumbers(nums);
		for(int num : temp) {
			System.out.println(num);
		}
	}
	
	public static List<Integer> findDisappearedNumberss(int[] nums) {
		List<Integer> arr = new ArrayList<Integer>();
		if(nums.length==0) return arr;
		
		TreeSet<Integer> tset = new TreeSet<Integer>();
		
		for(int num : nums) {
			tset.add(num);
		}
		
		int max = nums.length;
		for(int i=1;i<=max;i++) {
			if(!tset.contains(i)) {
				arr.add(i);
			}
		}
            return arr;
    }
	public static List<Integer> findDisappearedNumbers(int[] nums) {
		List<Integer> arr = new ArrayList<Integer>();
		if(nums.length==0) return arr;
		for(int i=1;i<=nums.length;i++) {
			arr.add(i);	
		}
		for(int num: nums) {
			arr.remove(new Integer(num));
		}
		return arr;
	}

	
}
