import java.util.*;
public class DuckSort{
    public static void main(String [] args){
        Duck [] ducks={
            new Duck("Donald",10),
            new Duck("Huey",3),
            new Duck("Dewey",5),
            new Duck("Louie",4),
            new Duck("Duffy",8)
        };
        System.out.println("Before Sorting");
        display(ducks);
        Arrays.sort(ducks);
        System.out.println("\nAfter Sorting");
        display(ducks);
    }
    public static void display(Duck[] ducks){
        for (int i=0;i<ducks.length;i++){
            System.out.println(ducks[i]+";");
        }
    }
}