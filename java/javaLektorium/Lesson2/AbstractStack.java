public abstract class AbstractStack implements Stack{
	protected int size;
	public boolean isEmpty(){
		return size()!=0;
	}
	public int size(){
		return size;
	}
	public Object pop(){
		if(size==0){
			return null;
		}
		size--;
		return popS();
	}
	protected abstract Object popS();
	
}