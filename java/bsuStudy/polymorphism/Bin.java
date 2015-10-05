import java.util.ArrayList;
class Bin{
	ArrayList<Product> myBin=new ArrayList<Product>();
	void add(Product p){
		myBin.add(p);
	}
	void printCheck(){
		if (myBin.size()>0){
			double totalPrice=0;
			int i=1;
			for(Product p:myBin){
				System.out.println(i+"."+" "+p.getName()+" : "+p.getPrice());
				i++;
				totalPrice+=p.getPrice();				
			}
			for (int k=0;k<20;k++)
				System.out.print("-");
			System.out.println();
			System.out.println("Total price:"+totalPrice);
		}
		else{
			System.out.println("Your bin is empty");
		}
	}
}