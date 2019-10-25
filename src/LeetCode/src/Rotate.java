
public class Rotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[] a = {1,2};
			rotate(a,3);
	}
	public static void rotate(int[] nums, int k) {
        
		int[] a = new int[nums.length];
		for(int i=0;i<nums.length;i++) {
			a[(i+k)%nums.length] = nums[i];
		}
		for(int i=0;i<nums.length;i++) {
			nums[i]= a[i];
		}
    }
}
