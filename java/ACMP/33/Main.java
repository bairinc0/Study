import java.util.*;
import java.io.*;
/*
Acmp 33
*/
public class Main{
	public static void main(String[] args){
		PrintWriter pw;
		Scanner sc;
		try{
			sc = new Scanner(new File("input.txt"));
			int a=sc.nextInt(),b=sc.nextInt();
			pw = new PrintWriter(new File("output.txt"));
			pw.print((b-1)+" "+(a-1));
			pw.close();
		}
			catch (IOException e){
		}
	}
}