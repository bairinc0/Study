class Point{
	double x;
	double y;
	void printPoint(){
		System.out.print("Coordinates: ("+x+","+y+") - ");
		if (x==0&&y==0){
			System.out.println("Zero point");
		}
		if (x==0&&y!=0){
			System.out.println("OX axis");
		}
		if (x!=0&&y==0){
			System.out.println("OY axis");
		}
		if (x>0&&y>0){
			System.out.println("I-st quater");
		}
		if (x<0&&y>0){
			System.out.println("II-nd quater");
		}
		if (x<0&&y<0){
			System.out.println("III-rd quater");
		}
		if (x>0&&y<0){
			System.out.println("IV-th quater");
		}
	}
}