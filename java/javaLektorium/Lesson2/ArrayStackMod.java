public class ArrayStackMod extends AbstractStack{
	private Object[] elements=new Object[0];
	
	
	
	public void push(Object value){
		ensureCapacity(size+1);
		elements[size++]=value;
	}
	public void ensureCapacity(int capacity){
		if (elements.length >= capacity){
			return;
		}
		Object[] newElements=new Object[capacity*2];
		for (int i=0;i<size;i++){
			newElements[i]=elements[i];
		}
		elements=newElements;
	}
	public Object popS(){
		return elements[size];
	}
	public Object peek(){
		if (size==0){
			return null;
		} 
		return elements[size-1];
	}
}