
public class DailyTemperatures {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] T = {80,80,80,34,80,80,34,80,80,80};
		//[1, 1, 4, 2, 1, 1, 0, 0]
		int[] temp =dailyTemperatures(T);
		for(int num : temp)
			System.out.print(num+",");
	}
	
	public static int[] dailyTemperatures(int[] T) {
        if(T.length==0) return new int[1];
        
		int start, end=1, index=0, count=0;
		int[] days= new int[T.length];
		for(start=0, end=1;end<T.length;end++) {
			if(T[start] >= T[end]) {
				if(end==T.length-1) {
					end=start+1;
					index++;
					start++;
				}
				else
					continue;
			}
			if(T[start] < T[end]) {
				days[index++] = end-start;
				end = start+1;
				start++;
			}
		}
		return days;
    }

}
