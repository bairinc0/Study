public class Buyer{
	public static void main(String [] args){
		Bread b=new Bread("Ukrainskii",30,0,300,0.4,"Black");
		Milk m=new Milk("Utro",50,0,400,1,1);
		TV t=new TV("LG - 720 PM",20000,5,3,"LG corporation",32);
		Bin myBin=new Bin();
		myBin.add(b);
		myBin.add(m);
		myBin.add(t);
		myBin.printCheck();
	}
}