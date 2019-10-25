import java.util.HashMap;

public class Contest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String word="loonbalxballpoon";
		//System.out.println(maxNumberOfBalloons(word));
		
		int[] arr = {-1,-2};
		kConcatenationMaxSum(arr,3);
		}

	public static int maxNumberOfBalloons(String text) {
		
		if(text==null || text.length()==0)
			return 0;
        
		String word="balloon";
		int count=0;
		char[] wch = word.toCharArray();
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		char[] ch = text.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(!map.containsKey(ch[i])) {
				map.put(ch[i],1);
			}else {
				int val = map.get(ch[i]);
				map.put(ch[i],++val);
			}
		}
		String newword="";
		for(int i=0;i<wch.length;i++) {
			if(map.containsKey(word.charAt(i))) {
				int val = map.get(word.charAt(i));
				if(val>1)
					map.put(word.charAt(i), val-1);
				else
					map.remove(word.charAt(i));
				newword = newword+word.charAt(i);
			}else {
				break;
			}
			if(i==wch.length-1) {
				if (newword.equals(word)) {
					newword="";
					count++;
					i=-1;
				}
					
			}
		}
		return count;
    }
	
	public static int kConcatenationMaxSum(int[] arr, int k) {
        int j=0;
        int mod  = (int) Math.pow(10,9)+7;
		int[] newarr = new int[arr.length * k];
		for(int i=0; i<newarr.length; i++,j++) {
			newarr[i] = arr[j];
			
			if(j==arr.length-1) {
				k--;
				j=-1;
			}
			if(k==0)
				break;
			
		}
		int  sum=0, max= Integer.MIN_VALUE;
		for(int i=0; i<newarr.length; i++) {
			sum = sum + newarr[i];
			if(sum < 0) {
				sum = 0;
			}
			if(sum > 0) {
				max = Math.max(max, sum);
			}
		}
		
		max = max <0 ? 0 : max;
		System.out.print(max);
		return max;
    }
	
	
}
