package ru.profchaos.java.stacks;

public interface Stack<E>{
	void push(E o);
	E pop();
	E peek();
	int size();	
	boolean isEmpty();
}