/*
 *Сокрытие имён
 */
class Homer{
    char doh(char c){
        System.out.println("DOH(char)");
        return 'd';
    }
    float doh(float f){
        System.out.println("DOH(float)");
        return f;
    }
}
class Milhouse{
    
}
class Bart extends Homer{
    void doh (Milhouse m){
        System.out.println("DOH(Milohouse)");
    }
}
public class Hide{
    public static void main(String [] args){
        Bart b=new Bart();
        b.doh(1);
        b.doh('x');
        b.doh(1.0f);
        b.doh(new Milhouse());
    }
}