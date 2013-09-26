// од демонстрирует пример быстрого вычислени€

public class FastCalc{
	static boolean test1(int val){
		System.out.println("test1("+val+")");
		System.out.println("result:"+(val<1));
		return val<1;	
	}
	static boolean test2(int val){
		System.out.println("test2("+val+")");
		System.out.println("result:"+(val<2));
		return val<2;	
	}	
	static boolean test3(int val){
		System.out.println("test3("+val+")");
		System.out.println("result:"+(val<3));
		return val<3;	
	}
	public static void main(String[] args){
		/*в следующей строке сработает быстрое вычисление,
		* так как test2(2) вернЄт false то test3 работать не будет
		*/
		boolean b=test1(0)&&test2(2)&&test3(2);
		System.out.println("variable b="+b);
		//а тут все 3 функции работают!
		boolean c=test1(0)&&test2(4)||test3(2);
	}
} 
