import java.util.*;
import typeinfo.pets.*;

public class ListFeatures{
    public static void main(String[] args){
        System.out.println("Pets!");
         Random rand=new Random(47);
         List <Pet> pets=Pets.arrayList(7);
         System.out.println("1 pets created: "+pets);
         Hamster h=new Hamster();
         pets.add(h);//Adding item
         System.out.println("2 item was added: "+pets);
         System.out.println("3 array.contains: "+pets.contains(h));
         pets.remove(h);
         Pet p=pets.get(2);
         System.out.println("4 index of element: "+p+" "+pets.indexOf(p));
         Pet cymric=new Cymric();
         System.out.println("5 try to find random element: "+pets.indexOf(cymric));
         System.out.println("6 try to delete random element: "+pets.remove(cymric));
         System.out.println("7 delete existing element: "+pets.remove(p));
         System.out.println("8 array: "+pets);
         pets.add(3,new Mouse());
         System.out.println("9 after insert in 3rd position: "+pets);
         List <Pet> sub=pets.subList(1,4);
         System.out.println("Sublist: "+sub);
         System.out.println("10 array.containsAll Sub: "+pets.containsAll(sub));
         Collections.sort(sub);
         System.out.println("Sorted Sublist: "+sub);
         System.out.println("11 array.containsAll Sub after sub sort: "+pets.containsAll(sub));
         Collections.shuffle(sub,rand);
         System.out.println("Shufled Sublist: "+sub);
         System.out.println("12 array.containsAll Sub after sub shuffle: "+pets.containsAll(sub));
         List <Pet> copy=new ArrayList<Pet>(pets);
         sub=Arrays.asList(pets.get(1),pets.get(4));
         System.out.println("sub: "+sub);
         copy.retainAll(sub);
         System.out.println("13 copy.retainAll: "+copy);
         copy=new ArrayList<Pet>(pets);
         copy.remove(2);
         System.out.println("14 copy: "+copy);
         copy.remove(sub);
         System.out.println("15 copy: "+copy);
         copy.set(1,new Mouse());
         System.out.println("16 copy: "+copy);
         copy.addAll(2,sub);
         System.out.println("17 copy: "+copy);
         System.out.println("18: "+pets.isEmpty());
         pets.clear();
         System.out.println("19: "+pets);
         System.out.println("20: "+pets.isEmpty());
         pets.addAll(Pets.arrayList(4));
         System.out.println("21: "+pets);
         Object []o=pets.toArray();
         System.out.println("22: "+o[3]);
         Pet[] pa=pets.toArray(new Pet[0]);
         System.out.println("23: "+pa[3].id());
    }
}