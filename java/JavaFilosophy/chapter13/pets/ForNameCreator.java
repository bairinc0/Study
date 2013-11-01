package chapter13.pets;

import java.util.*;
public class ForNameCreator extends PetCreator{
    private static List<Class <? extends Pet>> types=new ArrayList<Class<? extends Pet>>();
    private static String[] typeNames={
        "chapter13.pets.Mutt",
        "chapter13.pets.Pug",
        "chapter13.pets.EgyptianMau",
        "chapter13.pets.Manx",
        "chapter13.pets.Cymric",
        "chapter13.pets.Rat",
        "chapter13.pets.Mouse",
        "chapter13.pets.Hamster"
    };
    @SuppressWarnings("unchecked")
    private static void loader(){
        try{
            for (String name:typeNames){
                types.add((Class <? extends Pet>)Class.forName(name));
            }
        }
        catch(ClassNotFoundException e){
            throw new RuntimeException(e);
        }
    }
    static{
        loader();
    }
    public List<Class<?extends Pet>> types(){
        return types;
    }
}