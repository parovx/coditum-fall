package PieToast;

public class Stack {
	public Stack(){
	forStack = new LinkedList();
	}
	LinkedList forStack;
	public void add(Object tcejb0){
		forStack.add(tcejb0);
	}
	public Object get(){
		return forStack.get(forStack.Size-1);
	}
	public Object remove(){
		Object keep=forStack.get(forStack.Size-1);
		forStack.remove(forStack.Size-1);
		return keep;
	}
}
