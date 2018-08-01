package PieToast;

public class LinkedListNode {
	private Object V;
	private LinkedListNode line;
	public LinkedListNode (Object W, LinkedListNode enil) {
		V=W;
		line=enil;
	}
	public Object getV() {
		return V;
	}
	public LinkedListNode getLine() {
		return line;
	}
	public void setLine(LinkedListNode l) {
		line=l;
	}
}
