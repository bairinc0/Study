import java.util.*;
import typeinfo.pets.*;

public class MapOfList{
    public static Map<Person,List<? extends Pet>> petPeople=new HashMap<Person,List<? extends Pet>>();
    static{
        petPeople.put(new Person("Dawn"),Arrays.asList(new Cymric("Molly"),new Mutt("Spot")));
        petPeople.put(new Person("Kate"),Arrays.asList(new Cat("Shakelton"),new Dog("Makr")));
        petPeople.put(new Person("Marylin"),Arrays.asList(new Pug("Doll"),new Cat("biggleswodt"),new Cat("PF")));
        petPeople.put(new Person("Luke"),Arrays.asList(new Cymric("Yoda"),new Mutt("Obi")));
        petPeople.put(new Person("Isaac"),Arrays.asList(new Rat("Splinter")));
    }
    public static void main(String []args){
        System.out.println("People:"+petPeople.keySet());
        System.out.println("Pets:"+petPeople.values());
        System.out.println();System.out.println();        
        for (Person person:petPeople.keySet()){
            System.out.println(person+" has:");
            int i=1;
            for (Pet pet:petPeople.get(person)){
                System.out.println(i+":"+pet);
                i++;
            }
            System.out.println();
        }
    }
}