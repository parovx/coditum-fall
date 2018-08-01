package PieToast;

public class LinkedListNode {
	private Object V;
	private LinkedListNode next;
	public LinkedListNode (Object W, LinkedListNode txen) {
		V=W;
		next=txen;
	}
	public Object getV() {
		return V;
	}
	public LinkedListNode getNext() {
		return next;
	}
	public void setNext(LinkedListNode l) {
		next=l;
	}
}