public class StackTest{
	public static void main(String[] args){
		ArrayStack stack=new ArrayStack();
		for (int i=0;i<5;i++){
			stack.push("e"+i);
		}
		System.out.println(stack.size());
		while (stack.size()!=0){
			System.out.println(stack.peek()+" "+stack.pop());
		}
	}
}