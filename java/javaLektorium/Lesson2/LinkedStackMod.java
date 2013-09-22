public class LinkedStackMod extends AbstractStack{
	private Node head;
	
	private class Node{
		private final Object value;
		private final Node next;
		private Node(Node next, Object value){
			this.next=next;
			this.value=value;
		}
	}
	public void push(Object element){
		size++;
		head=new Node(head,element);
	}
	public Object popS(){		
		Object value=head.value;
		head=head.next;
		return value;
	}
	public Object peek(){
		if (head==null){
			return null;
		}
		return head.value;
	}
	
}