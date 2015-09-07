import java.util.*;
import java.io.*;
/*
acmp 21
*/
public class Main{
	public static void main(String[] args){
		PrintWriter pw;
		Scanner sc;
		try{
			sc = new Scanner(new File("input.txt"));
			int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
			int max,min;
			if (a>b && a>c){
				max=a;
			}
			else if (b>c){
				max=b;
			}
			else{
				max=c;
			}
			if (a<b && a<c){
				min=a;
			}
			else if (b<c){
				min=b;
			}
			else{
				min=c;
			}
			pw = new PrintWriter(new File("output.txt"));
			pw.print(max-min);
			pw.close();
		}
			catch (IOException e){
		}
	}
}