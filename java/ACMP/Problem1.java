import java.util.*;
import java.io.*;
public class Problem1{
	public static void main(String[] args){
		PrintWriter pw;
		Scanner sc;
		try{
			sc = new Scanner(new File("input.txt"));
			int a=sc.nextInt(), b=sc.nextInt();
			pw = new PrintWriter(new File("output.txt"));
			pw.print(a+b);
			pw.close();
		}
			catch (IOException e){
		}
	}
}