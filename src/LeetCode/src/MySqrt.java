
public class MySqrt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		System.out.println(mySqrt(8));
	}
	
	public static int mySqrt(int x) {
		
		 if (x == 0)
		        return 0;
		    int left = 1, right = x, mid=0;
		    while (left <= right) {
		        mid = left + (right - left)/2;
		        if (mid > x/mid) {
		            right = mid - 1;
		        } else {
		            if (mid + 1 > x/(mid + 1))
		                return mid;
		            left = mid + 1;
		        }
		    }
		    return mid;
	}
}
