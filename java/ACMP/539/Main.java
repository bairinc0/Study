import java.util.*;
import java.io.*;
/*
acmp 539
*/
public class Main{
	public static void main(String[] args){
		PrintWriter pw;
		Scanner sc;
		try{
			sc = new Scanner(new File("input.txt"));
			int n=sc.nextInt();
			pw = new PrintWriter(new File("output.txt"));
			if (n%2==0){
				pw.print(n/2);
			}
			else{
				pw.print(n);
			}
			pw.close();
		}
			catch (IOException e){
		}
	}
}