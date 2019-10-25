
public class CountAndSay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countAndSay(5));
	}
	
	public static String countAndSay(int n) {
	//1
	//11
	//21
	//1211
	//111221
		if(n==1) return "1";
		String newword="";
		String word="1";
		int count = 1;
		int i=0,k=1;
		while(k<n) {
			char[] ch = word.toCharArray();
			for(i=0;i<ch.length-1;i++) {
				if(ch[i]==ch[i+1]) {
					count++;
				}else if(ch[i]!=ch[i+1] || i+1>=ch.length){
						newword = newword+count+""+ch[i];
						count=1;	
				}
			}
			newword = newword+count+""+ch[i];
			count=1;
			word = newword;
			newword="";
			k++;
		}
		return word;
	}
	

}
