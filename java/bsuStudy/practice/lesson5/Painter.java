public class Painter{
	void paintFigure(String name,int x,int y){
		Shape s=new Shape();
		switch (name){
			case "Square":
				s=new Square(5);
			break;	
			case "Triangle":
				s=new Triangle(4);
			break;
		}
		s.draw(x,y);
	}
	public static void main(String []a){
		Painter p=new Painter();
		if (a.length>0){
			p.paintFigure(a[0],2,3);
		}	
	}
}
