class Book{
	boolean checkedOut=false;
	Book(boolean checkOut){
		checkedOut=checkOut;
	}
	void checkIn(){
		checkedOut=false;
	}
	public void finalize(){
		if (checkedOut){
			System.out.println("Error: checkedout");
		}
	}
}
public class TerminationCondition{
	public static void main(String[] args){
		Book novel=new Book(true);
		novel.checkIn();
		new Book(true);//тут ошибка ибо не убрали флаг!!
		System.gc();
	}
} 