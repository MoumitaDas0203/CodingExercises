import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.PriorityQueue;

public class UniqueEmails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String[] emails = {"test.email.alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
		//System.out.print(numUniqueEmails(emails));
		
		String[] input = {"a1 9 2 3 1","g1 act car","zo4 4 7","ab1 off key dog","a8 act zoo"};
		String[] temp = reorderLogFiles(input);
		for(String t : temp) {
			System.out.print(t+" , ");
		}
	}

public static  int numUniqueEmails(String[] emails) {
    HashSet<String> hset = new HashSet<String>();

	for(int i=0;i<emails.length;i++) {
		String email = emails[i];
		String[] parts = email.split("@");
		String local = parts[0];
		String domain = parts[1];
		local = local.split("\\+")[0];
		local = local.replace(".", "");
		email = (local+"@").concat(domain);
		hset.add(email);
	}
	return hset.size();
    }

	public static String[] reorderLogFiles(String[] logs) {
		if(logs==null || logs.length==0) return new String[]{};
		PriorityQueue<SubLog> letterlog = new PriorityQueue<SubLog>();
		ArrayList<String> digitlog = new ArrayList<String>();
		
		for(int i=0;i<logs.length;i++) {
			String log = logs[i];
			String[] text = logs[i].split("\\s");
			if(Character.isDigit(text[1].charAt(0))) {
				digitlog.add(log);
			}else {
				letterlog.offer(new SubLog(text[0],text,log));
			}
		}
		int i=0;
		String[] result = new String[letterlog.size()+digitlog.size()];
		while (!letterlog.isEmpty()) {
			result[i++] = letterlog.poll().log;
		}
		for(String temp : digitlog)
			result[i++] = temp;
		return result;
	}
	
}

