public class Nasl3{
	public static void main(String [] args){
		ClassThree c3=new ClassThree();
		
	}
}
class ClassOne{
	ClassOne(){
		System.out.println("ClassOne Constructor");
	}
}
class ClassTwo extends ClassOne{
	ClassTwo(){
		System.out.println("ClassTwo Constructor");
	}
}
class ClassThree extends ClassTwo{
	ClassThree(){
		System.out.println("ClassThree Constructor");
	}
}
