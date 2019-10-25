import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class AddTwoNumbers {
	
		public static void main(String[] args) {
		// TODO Auto-generated method stub
			ListNode l1= new ListNode(8);
			l1.next = new ListNode(9);
			l1.next.next = new ListNode(9);
			
			ListNode l2 = new ListNode(2);
			//l2.next = new ListNode(9);
			//l2.next.next = new ListNode(4);
			
			ListNode temp = addTwoNumbers(l1,l2);
			while(temp!=null) {
				System.out.print(temp.val +" ");
				temp = temp.next;
			}
			
	}
	
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		
		if(l1.val == 0 && l1.next == null)
			return l2;
		if(l2.val == 0 && l2.next == null)
			return l1;
		
		Queue<Integer> s3 = new LinkedList<Integer>();
		int carry=0;
		while(l1 != null && l2 !=null) {
			int sum = l1.val + l2.val + carry;
			carry=0;
			if(sum <10) {
				s3.add(sum);
			}else {
				s3.add(sum%10);
				carry = sum/10;
			}
			
			l1=l1.next;
			l2=l2.next;
		}
		
		if(l1!=null) {
			while(l1 !=null) {
				s3.add((l1.val+carry)%10);
				carry=(l1.val+carry)/10;
				l1=l1.next;
			}
		}
		if(l2!=null) {
			while(l2 !=null) {
				s3.add((l2.val+carry)%10);
				carry = (l2.val+carry)/10;
				l2=l2.next;
			}
		}
		if(carry>0)
			s3.add(carry);
		carry=0;
		ListNode l3 =  new ListNode(s3.poll());
		ListNode head = l3;
		ListNode pointer = l3;
		while(s3.size()>0) {
			ListNode newnode = new ListNode(s3.poll());
			newnode.next = null;
			head.next = newnode;
			head=newnode;
		}
		
		return  pointer;
    }

}


