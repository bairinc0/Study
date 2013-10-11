package chapter9.music;
import chapter8.music.Note;
abstract class Instrument{
    private int i;
    public abstract void play(Note n);
    public String what(){
        return "Instrument";
    }
    public abstract void adjust();
}
class Wind extends Instrument{
    public void play(Note n){
        System.out.println("Wind play "+n);
    }
    public String what(){
        return "Wind";
    }
    public void adjust(){
        
    }
}
class Brass extends Instrument{
    public void play(Note n){
        System.out.println("Brass play "+n);
    }
    public String what(){
        return "Brass";
    }
    public void adjust(){
        System.out.println("Brass adjust ");
    }
}
class Percussion extends Instrument{
    public void play(Note n){
        System.out.println("Percussion play "+n);
    }
    public String what(){
        return "Percussion";
    }
    public void adjust(){
        System.out.println("Percussion adjust ");
    }
}
class Stringed extends Instrument{
    public void play(Note n){
        System.out.println("Stringed play "+n);
    }
    public String what(){
        return "Stringed";
    }
    public void adjust(){
        System.out.println("Stringed adjust ");
    }
}
class Woodwind extends Wind{
    public void play(Note n){
        System.out.println("Woodwind play "+n);
    }
    public String what(){
        return "Woodwind";
    }    
}
public class Music4{
    static void tune(Instrument i){
        i.play(Note.MIDDLE_C);
    }
    static void tuneAll(Instrument []e){
        for (Instrument i:e){
            tune(i);
        }
    }
    public static void main(String[] args){
        Instrument [] orchestra={
            new Wind(),
            new Percussion(),
            new Stringed(),
            new Brass(),
            new Woodwind()                
        };
        tuneAll(orchestra);
    }
}
