package chapter8.music3;
import chapter8.music.Note;

class Instrument{
    public void play(Note n){
        System.out.println("Instrument.play() "+n);
    }
    String what(){
        return "Intrument";
    }
    void adjust(){
         System.out.println("Adjusting Instrument");
    }
}
class Wind extends Instrument{
    public void play(Note n){
        System.out.println("Wind.play() " +n);
    }
    String what(){
        return "Wind";
    }
    void adjust(){
         System.out.println("Adjusting Wind");
    }
}
class Stringed extends Instrument{
    public void play(Note n){
        System.out.println("Stringed.play() " +n);
    }
    String what(){
        return "Stringed";
    }
    void adjust(){
         System.out.println("Stringed Adjust");
    }
}
class Brass extends Instrument{
    public void play(Note n){
        System.out.println("Brass.play() " +n);
    }
    String what(){
        return "Brass";
    }
    void adjust(){
         System.out.println("Adjust Brass");
    }
}

class Woodwind extends Instrument{
    public void play(Note n){
        System.out.println("Woodwind.play() " +n);
    }
    String what(){
        return "Woodwind";
    }
    void adjust(){
         System.out.println("Woodwind Adjust");
    }
}
public class Music3{
    public static void tune(Instrument i){
        i.play(Note.MIDDLE_C);
    }
    public static void tuneAll(Instrument [] e){
        for (Instrument i:e){
            tune(i);
        }
    }
    public static void main(String [] args){
        Instrument [] orchestra={
            new Wind(), new Stringed(),new Brass(), new Woodwind()
        };
        tuneAll(orchestra);
    }
    
}