public class Hello{
	public static void main(String [] args){
		if (args.length>0){
			System.out.print("Hello:");
			for (int i=0;i<args.length-1;i++){
				System.out.print(args[i]+", ");
			}
			System.out.print(args[args.length-1]+".");
		}	
		else{
			System.out.println("Error! Array is null!");
		}	
	}
}