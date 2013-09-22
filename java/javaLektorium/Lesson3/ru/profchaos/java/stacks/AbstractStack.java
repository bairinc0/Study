package ru.profchaos.java.stacks;

public abstract class AbstractStack<E> implements Stack<E>{
	protected int size;
	public boolean isEmpty(){
		return size()==0;
	}
	public int size(){
		return size;
	}
	public E pop(){
		if(isEmpty()){
			return null;
		}
		size--;
		return popS();
	}
	protected abstract E popS();
	
}