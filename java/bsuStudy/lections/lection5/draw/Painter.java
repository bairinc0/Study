public class Painter{
	void paintFigure(String name,int x,int y){
		Shape s;
		switch (name){
			case "Square":
				s=new Square(5);
			break;	
			default:
				s=new Square(10);
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
