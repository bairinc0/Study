package chapter13.toys;

interface HasBattaries{}
interface Waterproof{}
interface Shoots{}

class Toy{
    Toy(){}
    Toy(int i){}
}

class FancyToy extends Toy implements HasBattaries,Waterproof,Shoots{
    FancyToy(){
        super(1);
    }
}

public class ToyTest{
    static void printInfo(Class cc){
        System.out.println(" ----------------------------------------------------------");
        System.out.println("class name:"+cc.getName()+" is he an interface? ["+cc.isInterface()+"]");
        System.out.println("Simple name:"+cc.getSimpleName());
        System.out.println("Canonical name:"+cc.getCanonicalName());
    }
    public static void main(String [] args){
        Class c=null;
        try{
            c=Class.forName("chapter13.toys.FancyToy");
        }
        catch(ClassNotFoundException e){
            System.out.println("I can't found class FancyToy");
            System.exit(1);
        }
        printInfo(c);
        for (Class face:c.getInterfaces()){
            printInfo(face);
        }
        Class up=c.getSuperclass();
        Object obj=null;
        try{
            obj=up.newInstance();
        }
        catch(InstantiationException e){
            System.out.println("Can't create object");
            System.exit(1);
        }
        catch(IllegalAccessException e){
            System.out.println("Havn't access rights");
            System.exit(1);
        }
        printInfo(obj.getClass());
    }
}

