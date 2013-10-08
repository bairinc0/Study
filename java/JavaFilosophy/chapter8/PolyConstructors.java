class Glyph{
    void draw(){
        System.out.println("Glyph draw");
    }
    Glyph(){
        System.out.println("Glyph before draw call");
        draw();//при создании объекта производного класса тут будет вызван метод из производного класса
        System.out.println("Glyph after draw call");
    }
}
class RoundGlyph extends Glyph{
    private int radius=1;
    RoundGlyph(int r){
        radius=r;
        System.out.println("Round Glyph constructor radius="+radius);
    }
    void draw(){
        System.out.println("Round Glyph draw radius="+radius);
    }
}
public class PolyConstructors{
    public static void main(String []args){
        new RoundGlyph(5);
    }
}