

public class SubLog implements Comparable<SubLog>{
	String id;
	String[] text;
	String log;
	
	public SubLog(String id, String[] text,String log ) {
		this.id = id;
		this.text = text;
		this.log=log;
	}

	@Override
	public int compareTo(SubLog that) {
		// TODO Auto-generated method stub
		for(int i=1;i<this.text.length;i++) {
			if(!(this.text[i].equals(that.text[i]))) {
				return this.text[i].compareTo(that.text[i]) ;
				}
		}
		return this.id.compareTo(that.id);
	}
}
