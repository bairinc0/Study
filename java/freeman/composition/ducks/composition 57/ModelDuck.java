class ModelDuck extends Duck{
    public ModelDuck(){
        quackBehavior=new MuteQuack();
        flyBehavior=new FlyNoWay();
    }
    public void display(){
        System.out.println("I'm best hunter's friend");
    }
}
