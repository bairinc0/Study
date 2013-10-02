/*
 *ѕример правильного завершени€ класса
 */
class Shape{
    Shape(int i){
        System.out.println("Shape Constructor");
    }
    void dispose(){
        System.out.println("Shape finalizer");
    }
}
class Circle extends Shape{
    Circle(int i){
        super(i);
        System.out.println("Circle Constructor");
    }
    void dispose(){
        System.out.println("Destroy Circle");
        super.dispose();
    }
}
class Triangle extends Shape{
    Triangle(int i){
        super(i);
        System.out.println("Triangle Constructor");
    }
    void dispose(){
        System.out.println("Destroy Triangle");
        super.dispose();
    }
}
class Line extends Shape{
    private int start,end;    
    Line(int start,int end){
        super(start);
        this.start=start;
        this.end=end;
        System.out.println("Line Constructor start="+start+" end="+end);
    }
    void dispose(){
        System.out.println("Destroy Line");
        super.dispose();
    }
}
public class CADSystem extends Shape{
    private Circle c;
    private Triangle t;
    private Line [] lines=new Line[3];
    public CADSystem(int i){
        super(i);
        for (int j=0;j<lines.length;j++){
            lines[j]=new Line(j,j*j);
        }
        c=new Circle(i+2);
        t=new Triangle(i);
        System.out.println("Combined Constructor");
    }
    void mix(){
        System.out.println("MIX ALL FIGURES");
    }
    void dispose(){
        System.out.println("Destroy CAD");
        t.dispose();
        c.dispose();
        for (int i=0;i<lines.length;i++){
            lines[i].dispose();
        }
        super.dispose();
    }
    public static void main(String[] args){
        CADSystem x=new CADSystem(40);
        try{
            x.mix();
        }finally{
            x.dispose();
        }
    }
}