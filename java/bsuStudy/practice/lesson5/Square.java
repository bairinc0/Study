class Square extends Shape{
	int a;
	//x,y - left upper corner
	Square (int a){
		this.a=2*a;
	}
	void draw(int x,int y){
		for (int j=0;j<y;j++){
			System.out.println();
		}
		String s="";
		for (int i=0;i<x;i++){
			s+=" ";
		}
		for (int j=0;j<a;j++){
			System.out.print(s);
			for (int i=0;i<a;i++){
				System.out.print("* ");
			}
			System.out.println();
		}		
	}
	void erase(){}
}