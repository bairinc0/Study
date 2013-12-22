class Berserk extends Hero{
    public Berserk(String name){
        super(name);
        weapon=new AxeBehavior();
    }
    public void battleCry(){
        System.out.println("I'm "+name+" i figth for the honor!");
    }
}