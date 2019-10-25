
public class DefangIPaddr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String addr = "1.1.1.1";
		System.out.print(defangIPaddr(addr));
	}
	
	public static String defangIPaddr(String address) {
       
		int length = address.length();
		int newlength=0;
		for(int i=0;i<length;i++) {
			if(address.charAt(i)=='.')
				newlength++;
		}
		char[] newaddress = new char[length+(newlength*2)];
		
		for(int i=0,j=0;i<newaddress.length;i++,j++) {
			if(address.charAt(j)=='.') {
				newaddress[i] = '[';
				newaddress[i+1] = '.';
				newaddress[i+2] =']';
				i=i+2;
			}else
				newaddress[i]=address.charAt(j);
		}
		
		return new String(newaddress);
    }

}
