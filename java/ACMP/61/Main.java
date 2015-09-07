import java.util.*;
import java.io.*;
/*
acmp 61
*/
public class Main{
	public static void main(String[] args){
		PrintWriter pw;
		Scanner sc;
		try{
			sc = new Scanner(new File("input.txt"));
			int firstTeam,secondTeam;		
			firstTeam=0;
			secondTeam=0;
			int a,b;
			for (int i=0;i<4;i++){
				a=sc.nextInt();
				b=sc.nextInt();
				firstTeam+=a;
				secondTeam+=b;
			}
			//System.out.println(firstTeam+" "+secondTeam);
			pw = new PrintWriter(new File("output.txt"));
			if (firstTeam>secondTeam){
				pw.print(1);
			}
			else if (firstTeam<secondTeam){
				pw.print(2);
			}	
			else{
				pw.print("DRAW");
			}			
			pw.close();
		}
			catch (IOException e){
		}
	}
}