
public class JudgeCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String moves="RRDD";
		System.out.print(judgeCircle(moves));
	}
	public static boolean judgeCircle(String moves) {
        int[][] d = new int[2][2];
		for(int i=0;i<moves.length();i++) {
			if(moves.charAt(i)=='U') {
				d[0][0]=d[0][0]+1;
			}
			if(moves.charAt(i)=='D') {
				d[0][0]=d[0][0]-1;
			}
			if(moves.charAt(i)=='R') {
				d[0][1]=d[0][1]+1;
			}
			if(moves.charAt(i)=='L') {
				d[0][1]=d[0][1]-1;
			}
		}
		return (d[0][0]==0) && (d[0][1]==0) ?true:false;
    }
}
