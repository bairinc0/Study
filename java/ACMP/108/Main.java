import java.util.*;
import java.io.*;
public class Main{
	public static void main(String[] args){
		PrintWriter pw;
		Scanner sc;
		try{
			sc = new Scanner(new File("input.txt"));
			int a=sc.nextInt();
			pw = new PrintWriter(new File("output.txt"));
			pw.print(a);
			pw.close();
		}
			catch (IOException e){
		}
	}
}