package PieToast;


public class graphnode {
	private Object GraphNodeValue;
	private HashMap <Integer> distances;
	public graphnode(Object vallue){
		GraphNodeValue = vallue;
	}
	public Object gettheValue(){
		return GraphNodeValue;
	}
	public void makenode(Object anothernode, int addedlength){
		distances.adder(anothernode.toString(), addedlength);
		return;
	}
	
}
