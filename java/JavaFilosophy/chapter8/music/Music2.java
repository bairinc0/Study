package chapter8.music;

class Stringed extends Instrument{
    public void play(Note n){
        System.out.println("Stringed play "+n);
    }
}
class Brass extends Instrument{
    public void play(Note n){
        System.out.println("Brass play "+n);
    }
}
public class Music2{
    //ПЛОХО - мы определяем для каждого объекта свой метод!
    public static void tune(Wind i){
        i.play(Note.MIDDLE_C);
    }
    public static void tune(Brass i){
        i.play(Note.MIDDLE_C);
    }
    public static void tune(Stringed i){
        i.play(Note.MIDDLE_C);
    }
    public static void main(String[] args){
        Wind flute=new Wind();
        tune(flute);
        Stringed guitar=new Stringed();
        tune (guitar);
        Brass horn=new Brass();
        tune(horn);
    }
}