import java.util.PriorityQueue;

public class KthSmallestMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {{1,5,9}, {10, 11, 13},{12, 13, 15}};
		System.out.println(kthSmallest(matrix,8));
	}
	
	public static int kthSmallest(int[][] matrix, int k) {
		
		int n = matrix.length ;
		int low = matrix[0][0];
		int hi = matrix[n-1][n-1];
		
		while(low <= hi) {
			//int mid = low + (hi - low)/2;
			int mid = (low + hi)/2;
			int count = countLessOrEqual(matrix,mid);
			if(count < k)
				low = mid + 1;
			else
				hi = mid - 1;
		}
		return low;
	}
	
	public static int countLessOrEqual(int[][] matrix, int target) {
		
		int n = matrix.length;
		int i = n-1, j = 0;
		int count = 0;
		while (i>= 0 && j<n) {
			if(matrix[i][j]> target) {
				i--;
			} else {
				count = count + i + 1;
				j++;
			}
		}
		
		return count;
	}
	
	}

