
public class MaxProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.print(maxProduct(nums));
	}
	

	
	public static int maxProduct(int[] nums) {
	
	int product =1, max = Integer.MIN_VALUE;
	for (int i=0;i<nums.length;i++) {
		product = product * nums[i];
		if(product > max)
			max = product;
		if(product == 0)
			product = 1;
	}
	product=1;
	for(int i=nums.length-1;i>=0;i--) {
		product = product * nums[i];
		if(product > max)
			max = product;
		if(product == 0)
			product = 1;
	}
	
	return max;
}

}
