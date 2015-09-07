import java.util.*;
import java.io.*;
import java.math.*;
/*
acmp 61
*/
public class Main{
	public static void main(String[] args){
		PrintWriter pw;
		Scanner sc;
		try{
			sc = new Scanner(new File("input.txt"));
			BigInteger a,b,c;		
			a=sc.nextBigInteger();
			b=sc.nextBigInteger();
			c=a.divide(b);
			//System.out.println(firstTeam+" "+secondTeam);
			pw = new PrintWriter(new File("output.txt"));
			pw.print(c);

			pw.close();
		}
			catch (IOException e){
		}
	}
}