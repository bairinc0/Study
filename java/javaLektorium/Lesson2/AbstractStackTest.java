public class AbstractStackTest{
	public static final int MY_INT;//константа
	static{
		/* Инициализатор константы, а можно сделать тупо
			public static final int MY_INT=10;
		*/
		if (Math.random()>0.5){//рандомно запиливаем значение
			MY_INT=1;
		}else{
			MY_INT=10;
		}
		
	}
	public static void fill(Stack stack){
		for (int i=0;i<5;i++){
			stack.push("e"+i);
		}
	}
	public static void dump(Stack stack){
		System.out.println(stack.size());
		while (stack.size()!=0){
			System.out.println(stack.peek()+" "+stack.pop());
		}
	}	
	public static void main(String[] args){
        //располагаем в разных областях видимости чтобы не видить переменную stack
	/*так нельзя:		
		ArrayStackMod stack=new ArrayStackMod();		
		fill(stack);
		dump(stack);		
		{
		LinkedStackMod stack=new LinkedStackMod();		
		fill(stack);
		dump(stack);
		}
	*/
		{
		ArrayStackMod stack=new ArrayStackMod();		
		fill(stack);
		dump(stack);
		}
		{
		LinkedStackMod stack=new LinkedStackMod();		
		fill(stack);
		dump(stack);
		}
	}
}