package PieToast;
public class adjacencylist {
	public int [][]adjacencylist;
	public adjacencylist (int size) {
		this.adjacencylist=new int [size][size];
	}
	public void adder(int sauce, int destination, int cost) {

		for(int thezero=0; thezero<adjacencylist.length; thezero++) {
			if(adjacencylist[sauce][thezero]==0) {
				adjacencylist[sauce][thezero]=cost;	
				return;
			}

		}

	}

	public void printcost() {
		for(int othersizecounter=0; othersizecounter<adjacencylist.length; othersizecounter++) {
			System.out.print(othersizecounter+"  ");
			for(int sizecounter=0; sizecounter<adjacencylist[othersizecounter].length; sizecounter++) {
				System.out.print(adjacencylist[othersizecounter][sizecounter]+" ");
			}
			System.out.println();
		}
	}
}
