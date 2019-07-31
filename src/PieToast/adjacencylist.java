package PieToast;
import java.util.ArrayList;
public class adjacencylist {
	public ArrayList<Integer>[] adjacencylist;
	public adjacencylist (int size) {
		this.adjacencylist=new ArrayList[size];
	}
	public void adder(int sauce, int destination, int cost) {
		adjacencylist[sauce].add(destination);
		adjacencylist[destination].add(sauce);
	}
	
	public void printcost() {
		for(int sizecounter=0; sizecounter<adjacencylist.length; sizecounter++) {
			System.out.print(adjacencylist[sizecounter]);
		}
	}
}
