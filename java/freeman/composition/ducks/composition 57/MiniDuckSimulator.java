public class MiniDuckSimulator{
    public static void main(String [] args){
        Duck mallard=new MallardDuck();
        mallard.performQuack();
        mallard.performFly();
        mallard.display();
        Duck model=new ModelDuck();
        model.performQuack();
        model.performFly();
        model.display();
        System.out.println("lets rock!");
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}