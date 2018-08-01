package PieToast;

public class LinkedListNode {
	private Object Value;
	private LinkedListNode next;
	public LinkedListNode (Object W, LinkedListNode txen) {
		Value=W;
		next=txen;
	}
	public Object getValue() {
		return Value;
	}
	public LinkedListNode getNext() {
		return next;
	}
	public void setNext(LinkedListNode l) {
		next=l;
	}
}