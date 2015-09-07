import java.util.*;
import java.io.*;
public class Main{
	public static void main(String[] args){
		PrintWriter pw;
		Scanner sc;
		try{
			sc = new Scanner(new File("input.txt"));
			int n=sc.nextInt(),a=sc.nextInt(),b=sc.nextInt();
			pw = new PrintWriter(new File("output.txt"));
			pw.print(a*b*n*2);
			pw.close();
		}
			catch (IOException e){
		}
	}
}