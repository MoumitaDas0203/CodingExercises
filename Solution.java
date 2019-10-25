import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S ="aAAbbbb";
		String J ="aA";
		//System.out.print(numJewelsInStones(J,S));
		
		ListNode node = new ListNode(1);
		node.next = new ListNode(2);
		/*
		node.next.next = new ListNode(3);
		node.next.next.next = new ListNode(4);
		node.next.next.next.next = new ListNode(5);
		*/
		//ListNode temp = removeNthFromEnd(node,1);
		
		int[] nums = {1,2,3};
		List<List<Integer>> list = subsets(nums);
		
	}
	
	public static int numJewelsInStones(String J, String S) {
		
		if(J.length()==0 || S.length()==0)
			return 0;
		
		int count=0;
		HashSet<Character> set = new HashSet<Character>();
		char[] ch = J.toCharArray();
		for(char c : ch)
			set.add(c);
		
		ch=null;
		ch=S.toCharArray();
		for(char c : ch) {
			if(set.contains(c))
				count++;
		}
		
		return count;
	}
	
	public static ListNode removeNthFromEnd(ListNode head, int n) {
		if(head == null) return null;
		if(head.next == null) return null;
	    int len=0;
	    ListNode newnode = head;
		ListNode current = head;
		while(current!=null) {
			current = current.next;
			len++;
		}
		if(n==len) {
			head = head.next;
			newnode = head;
		}else {
		ListNode prev=null;
		len = len - n;
			while(len>0) {
				prev = head;
				head = head.next;
				len--;
			}
			prev.next = head.next;
		}
		
		return newnode;
		
	}
	
	public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
		subsetsHelper(list, new ArrayList<>(), nums, 0);
		return list;
    }
    
    private static void subsetsHelper(List<List<Integer>> list , List<Integer> resultList, int []         nums, int start){
		list.add(new ArrayList<>(resultList));
		for(int i = start; i < nums.length; i++){
          
			resultList.add(nums[i]);
          
			subsetsHelper(list, resultList, nums, i + 1);
          
			resultList.remove(resultList.size() - 1);
		}
	}
    
  
}
