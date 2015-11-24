public class ChicagoCheesePizza extends Pizza{
    public ChicagoCheesePizza(){
        name="Chicago style Deep dish cheese pizza";
        dough="Extra thick";
        sauce="Plum tomato sauce";
        toppings.add("Mozarella cheese");
        toppings.add("special addings");
    }
    void cut(){
        System.out.println("Slice into 4 parts like in Chicago");
    }
}