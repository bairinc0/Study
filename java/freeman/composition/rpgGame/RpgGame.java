import java.util.*;
public class RpgGame{
    public static void main(String [] args){
        ArrayList<Hero> arr=new ArrayList<Hero>();
        arr.add(new Archer("Sylvanas"));
        arr.add(new Knight("Uther"));
        arr.add(new Berserk("Grom Hellscream"));
        for (Hero c:arr){
            c.fight();
            c.battleCry();
        }
    }
}