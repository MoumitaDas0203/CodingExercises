
public class DeleteDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ListNode node = new ListNode(1);
		node.next = new ListNode(1);
		node.next.next = new ListNode(2);
		node.next.next.next = new ListNode(3);
		node.next.next.next.next = new ListNode(3);
		deleteDuplicates(node);
	}
	public static ListNode deleteDuplicates(ListNode head) {
	
	if(head.next==null) return head;
	
		ListNode curr = head;
		
		while(curr != null ) {
			
			if(curr.next == null)
				break;
			
			if(curr.val == curr.next.val) {
				curr = curr.next;
			}
			else
				curr = curr.next;
		}
		return head;
		
	}

}
