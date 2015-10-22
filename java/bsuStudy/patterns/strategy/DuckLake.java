public class DuckLake{
	public static void main(String [] a){
		MallardDuck md=new MallardDuck();
		md.f=new FlyNoWay();
		md.performFly();
		MallardDuck md2=new MallardDuck();
		md2.f=new FlyWithWings();
		md2.performFly();
		md.f=new TopolM();
		md.performFly();
	}
}