class LineUser{
	public static void main(String []a){
		Point x1=new Point();
		Point x2=new Point();
		x1.x=10;
		x1.y=13;
		x2.x=3;
		x2.y=-31;
		Line line=new Line();
		line.beginLine=x1;
		line.endLine=x2;
		System.out.println(line.lineLength());
	}
}