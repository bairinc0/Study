import java.util.*;
import java.io.*;
/*
acmp 8
*/
public class Main{
	public static void main(String[] args){
		PrintWriter pw;
		Scanner sc;
		try{
			sc = new Scanner(new File("input.txt"));
			int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();			
			pw = new PrintWriter(new File("output.txt"));
			if (a*b==c){
				pw.print("YES");
			}			
			else{
				pw.print("NO");
			}			
			pw.close();
		}
			catch (IOException e){
		}
	}
}