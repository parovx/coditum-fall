package PieToast;

public class adjacencylist2node {
	private int Dest;
	private int Cost;
	public adjacencylist2node(int destination, int val){
		Dest=destination;
		Cost=val;
	}
	public int getC(){
		return Cost;
	}
	public int getD(){
		return Dest;
	}
	public void setC(int newC){
		Cost=newC;
	}
}