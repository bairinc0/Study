class Building{}
class House extends Building{}

public class ClassCasts{
    public static void main(String [] args){
        Building b=new House();
        System.out.println(b.getClass().getCanonicalName());
        Class<House> houseType=House.class;
        House h=houseType.cast(b);
        //or
        h=(House)b;
        System.out.println(h.getClass().getCanonicalName());
       
    }
}