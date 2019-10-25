import java.util.HashSet;

public class PrintAllPermutations {
	
	public static HashSet<String> hset = new HashSet<String>(); // for distinct permutations

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abc";
		int n=str.length()-1;
		permute(str,0,n);
		//System.out.println(hset.size());
		
	}
	
	public static void permute(String s, int start, int end) {
		//HashSet<String> hset = new HashSet<String>();
		if(start == end) {
			//System.out.println("start==end");
			hset.add(s);
			System.out.println(s);
			//hset.add(s);
		}else {
			for(int i=start;i<=end;i++) {
				//System.out.println("Calling swap down function: s="+s+" ,start="+start+" ,end="+i+" ,String="+s);
				s = swap(s,start,i);
				//System.out.println("Calling permute function: s="+s+" ,start="+(start+1)+" ,end="+end+" ,String="+s);
				permute(s, start+1, end);
				//System.out.println("Calling swap up function: s="+s+" ,start="+start+" ,end="+i+" ,0String="+s);
				s = swap(s,start,i);
			}
		}
	}	
	public static String swap(String s,int i,int j ) {
		char temp;
		char[] chars = s.toCharArray();
		temp = chars[i];
		char temp1 = chars[j];
		chars[i]= temp1;
		chars[j]=temp;
		
		return String.valueOf(chars);
	}
	
}
