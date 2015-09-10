import java.util.ArrayList;
class BigBox{
	int boxMaxSize=4;
	int catCount=0;
	ArrayList <Cat> box=new ArrayList<Cat>();
	public void add(Cat newCat){
		if (catCount<boxMaxSize){
			catCount++;
			box.add(newCat);
		}
		else{
			System.out.println("Box overload!!! On cat"+newCat);			
		}
	}
	public String toString(){
		int i=1;
		String out="";		
		for(Cat cat:box){
			out+="Cat number "+i+":"+cat+"\n";
			i++;
		}
		return out;
	}
}