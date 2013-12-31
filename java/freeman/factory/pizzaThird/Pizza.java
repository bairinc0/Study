abstract class Pizza{
    String name;
    Dough dough;
    Sauce sauce;
    //Veggies veggies[];
    Cheese cheese;
    //Pepperoni pepperoni;
    Clams clams;
    abstract void prepare();
    void bake(){
        System.out.println("Bake for 25 minutes at 300 C ");
    }
    void cut(){
        System.out.println("cutting into 8 slices");
    }
    void box(){
        System.out.println("Put into PizzaStore box ");
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public String toString(){
        String description;
        description="Name:"+name+" Dough:"+dough+" Sauce:"+sauce+" Cheese:"+cheese;        
        if (clams!=null){
            description+=" Clams:"+clams;
        }
        return description;
    }
}