import java.util.ArrayList;
import java.util.Arrays;

public class MergeInterval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] arr= {{1,4},{0,2},{3,5}};
		int[][] temp = merge(arr);
		for(int i=0;i<temp.length;i++)
			System.out.println("{ "+temp[i][0]+" , "+ temp[i][1]+ "}");
	}
	
	public static int[][] merge(int[][] intervals) {
		
		if (intervals.length==1) return intervals;
		
		ArrayList<Object> result= new ArrayList<>();
		Arrays.sort(intervals, (a,b)-> a[0] - b[0]);
		
		int[] interval1 = intervals[0];
		
		for(int i=1; i<intervals.length;i++) {
			int[] interval2 = intervals[i];
			if(interval1[1] >= interval2[0]) {
				interval1[1] = Math.max(interval1[1], interval2[1]);
				if(!result.contains(interval1))
					result.add(interval1);								
			}else {
				if(i==1)
					result.add(interval1);
				result.add(interval2);
				interval1 = interval2;				
			}
		}
		int[][] res = new int[result.size()][2];
		int k=0;
		for(k=0;k<result.size();k++) {
			int[] temp = (int[]) result.get(k);
			res[k][0] = temp[0];
			res[k][1] = temp[1];
		}
		
		return res;
    }

}
