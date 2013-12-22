class Knight extends Hero{
    public Knight(String name){
        super(name);
        weapon=new SwordBehavior();
    }
    public void battleCry(){
        System.out.println("I'm "+name+" and i raise you for the Lorderon!");
    }
}