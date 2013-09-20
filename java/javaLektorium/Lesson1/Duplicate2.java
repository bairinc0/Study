public class Duplicate2{
	private static int parseInt(String s){
		int r=0;
		for (char ch:s.toCharArray()){
			r=r*10+ch-'0';
		}
		return r;
	}
	public static void main(String[] args){
		System.out.println(parseInt(args[0])*2);
	}
}