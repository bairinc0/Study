package chapter8;
class Meal{
    Meal(){
        System.out.println("Meal()");
    }
}
class Bread{
    Bread(){
        System.out.println("Bread()");
    }
}
class Cheese{
    Cheese(){
        System.out.println("Cheese()");
    }
}
class Lettuce{
    Lettuce(){
        System.out.println("Lettuce()");
    }
}
class Lunch extends Meal{
    Lunch(){
        System.out.println("Lunch()");
    }
}
class PortableLunch extends Lunch{
    PortableLunch(){
        System.out.println("PortableLunch()");
    }
}
public class Sandwitch extends PortableLunch{
    /*
     Сперва вызываются конструкторы базового класса по цепочке иерархии
     * потом конструкторы классов созданных для композиции
     * в конце непосредственно конструктор класса
     */
    private Bread b=new Bread();
    private Cheese c= new Cheese();
    private Lettuce l=new Lettuce();
    public Sandwitch(){
        System.out.println("Sandwitch()");
        System.out.println("I have been initialized!!");
    }
    public static void main(String[] args){
        new Sandwitch();
    }
}