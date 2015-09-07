import java.util.*;
import java.io.*;
import java.math.*;
/*
acmp 271
*/
public class Main{
	public static void main(String[] args){
		PrintWriter pw;
		Scanner sc;
		try{
			sc = new Scanner(new File("input.txt"));
			long n;
			n=sc.nextLong();
			ArrayList<long> []a=new long[1200000000];
			a[0]=1;
			a[1]=1;
			for (long i=2;i<n;i++){
				//a[i]=a[i-2]+a[i-1];
			}
			pw = new PrintWriter(new File("output.txt"));
			//pw.print(a[n-1]);
			pw.close();
		}
			catch (IOException e){
		}
	}
}