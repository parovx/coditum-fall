package PieToast;

public class LinkedListNode <E>{
	private E Value;
	private LinkedListNode <E> next;
	public LinkedListNode (E W, LinkedListNode <E> txen) {
		Value=W;
		next=txen;
	}
	public E getValue() {
		return Value;
	}
	public LinkedListNode <E> getNext() {
		return next;
	}
	public void setNext(LinkedListNode <E> l) {
		next=l;
	}
}