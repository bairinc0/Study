public class MiniDuckSimulator{
    public static void main(String [] args){
        Duck mallard=new MallardDuck();
		 Duck model=new ModelDuck();
		if (args[0].equals("1")){
			model.setFlyBehavior(new FlyRocketPowered());
			mallard.setFlyBehavior(new FlyRocketPowered());
		}
        mallard.performQuack();
        mallard.performFly();
        mallard.display();
       
        model.performQuack();
		
        model.display();
		model.performFly();
        System.out.println("lets rock!");
        
        
		
    }
}