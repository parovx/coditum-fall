package PieToast;

public class adjacencymatrix {
	public int [][]adjacencyarray;
	public adjacencymatrix(int size) {
		this.adjacencyarray= new int [size][size];
	}
	public void addedge(int source, int destination, int cost) {
		adjacencyarray[source][destination]=cost;
		adjacencyarray[destination][source]=cost;
	}
	public void printmatrix() {
		for(int rowcounter=0; rowcounter<adjacencyarray.length; rowcounter++) {
			for(int columncounter=0; columncounter<adjacencyarray.length; columncounter++) {
				System.out.print(adjacencyarray[rowcounter][columncounter]+" ");
			}
			System.out.println();
		}
	}
	public int getcost(int sauce, int destination) {
		return adjacencyarray[sauce][destination];
	}
	public boolean checkforconnection(int sauce, int destination){
		if (getcost(sauce, destination)==0) {
			return true;
		}
		return false;
	}
	public void addcolumn(int more) {
		int [][]newarray;
		newarray=new int [more+adjacencyarray.length][more+adjacencyarray.length];
		for(int rowcounter=0; rowcounter<adjacencyarray.length; rowcounter++) {
			for(int columncounter=0; columncounter<adjacencyarray.length; columncounter++) {
				newarray[rowcounter][columncounter]=adjacencyarray[rowcounter][columncounter];
			}
		}
		adjacencyarray=newarray;
	}
}
