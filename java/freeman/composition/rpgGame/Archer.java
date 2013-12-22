class Archer extends Hero{
    public Archer(String name){
        super(name);
        weapon=new BowBehavior();
    }
    public void battleCry(){
        System.out.println("I'm "+name+" my bow with you!");
    }
}