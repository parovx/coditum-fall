package PieToast;

public class adjacencylist {
	public int [][]adjacencylist;
	public adjacencylist (int size) {
		this.adjacencylist=new int[size][size];
	}
	public void adder(int sauce, int destination, int cost) {
		adjacencylist[sauce][destination]=cost;
		adjacencylist[destination][sauce]=cost;
	}
/*	public void printcost() {
		for(int sizecounter=0; sizecounter<adjacencylist.length; sizecounter++) {
			System.out.print(adjacencylist[size]+" ");
		}
	}*/
}
