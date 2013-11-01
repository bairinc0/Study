class Candy {
    static {
        System.out.println("Loading Candy");
    }
}
class Gum {
    static {
        System.out.println("Loading Gum");
    }
}
class Cookie {
    static {
        System.out.println("Loading cookie");
    }
}
public class SweetShop{
    public static void main(String []args){
        System.out.println("Begin!!!");
        new Candy();
        System.out.println("Candy is created");
        try{
            Class.forName("Gum");
        }
        catch(ClassNotFoundException e){
            System.out.println("Exception!! Class Gum not found");
        }
        System.out.println("I want cookie");
        new Cookie();
        System.out.println("Cookie is created");
    }
}