public class HelloWorldArgs{
	public static void main(String[] args){
		if (args.length>0){
			System.out.print("Hello:");
			for (int i=0;i<args.length;i++){
				System.out.print(args[i]+",");
			}
		}
		else{
			System.out.println("Error! String is not ready!");
		}
	}
}