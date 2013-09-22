//Перегружаем методы в зависимости от сигнатуры/входных параметров
public class BothStackTest{
	public static void fill(LinkedStack stack){
		for (int i=0;i<5;i++){
			stack.push("e"+i);
		}
	}
	public static void dump(LinkedStack stack){
		System.out.println(stack.size());
		while (stack.size()!=0){
			System.out.println(stack.peek()+" "+stack.pop());
		}
	}	
	public static void fill(ArrayStack stack){
		for (int i=0;i<5;i++){
			stack.push("e"+i);
		}
	}
	public static void dump(ArrayStack stack){
		System.out.println(stack.size());
		while (stack.size()!=0){
			System.out.println(stack.peek()+" "+stack.pop());
		}
	}	
	public static void main(String[] args){
        //располагаем в разных областях видимости чтобы не видить переменную stack
		{
		ArrayStack stack=new ArrayStack();		
		fill(stack);
		dump(stack);
		}
		{
		LinkedStack stack=new LinkedStack();		
		fill(stack);
		dump(stack);
		}
	}
}