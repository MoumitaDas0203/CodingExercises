import java.util.ArrayList;
import java.util.Stack;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode node = new ListNode(1);
		node.next = new ListNode(2);
		node.next.next = null;
		//isPalindrome(node);
		System.out.print(validPalindrome("aba"));
	}
	public static boolean isArmstrong(int N) {
       
		ArrayList<Integer> arr = new ArrayList<Integer>();
		while(N>0) {
			arr.add(N%10);
			N = N/10;
		}
		int pow = arr.size();
		int sum =0;
		for(int n: arr) {
			sum = (int) (sum + Math.pow(n,3));
			if(sum > N)
				break;
		}
		return sum==N;
		
    }
	
	public static boolean isPalindrome(ListNode head) {
		
		Stack<Integer> st = new Stack<Integer>();
		ListNode curr = head;
		while(head!=null) {
				st.add(head.val);
				head = head.next;
		}
		
			
			while(curr!=null) {
				if(curr.val == st.peek()) {
					st.pop();
					curr=curr.next;
				}else
					return false;
			
			}
			return true;
		
	 }
	//cb b cc
	 public static boolean validPalindrome(String s) {
		 if(s.length()==0 || s.length()==1) return true;

	     char[] ch = s.toCharArray();
	     int len = s.length();
		 int first=0, second= len-1;
		 while(first<=second) {
			 if(ch[first]==ch[second]) {
				 first++;
				 second--;
			 }
			 else
				 break;				 
		 }
		 
		 if(first>=second) return true;
		 return isPalin(s.substring(first, second)) || isPalin(s.substring(first+1,second+1));
		 
		 
	 }
	 
	 public static boolean isPalin(String s) {
		
		 int i=0, j=s.length()-1;
		 while(i<j) {
			 if(s.charAt(i++)!=s.charAt(j--)) {
				 return false;
			 }
		 }
		 return true;
	 }
	 
	 

}
