import chapter13.pets.*;
import java.util.*;

public class PetCount4{
    public static void main(String []args){
        TypeCounter counter=new TypeCounter(Pet.class);
        for(Pet pet:Pets.createArray(20)){
            System.out.println(pet.getClass().getSimpleName());
            counter.count(pet);
        }
        System.out.println(counter);
    }
}

