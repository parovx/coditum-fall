package PieToast;

public class adjacencymatrix {
	public int [][]adjacencyarray;
	public int size;
	public adjacencymatrix(int size) {
		this.size=size;
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
	public int getminimumvertex(boolean[] arrey, int []aray) {
		int minkey=Integer.MAX_VALUE;
		int monkey=-1;
		for(int check=0; check<size; check++) {
			if(aray[check]<minkey&& arrey[check]==false) {
				minkey=aray[check];
				monkey=check;
			}
		}
		return monkey;
	}
	public int djikstracalc(int sauce) {
		boolean[] checc= new boolean[size];
		int[] distances=new int [size];
		for(int chek=0; chek<size; chek++) {
			distances[chek]=Integer.MAX_VALUE;
		}
		distances[sauce]=0;
		for(int sheck=0; sheck<size; sheck++) {
			int minvertex=getminimumvertex(checc, distances);
			checc[minvertex]=true;
			for(int shecc=0; shecc<size; shecc++) {
				if(adjacencyarray[minvertex][shecc]>0) {
					if(checc[shecc]==false && adjacencyarray[minvertex][sheck]!=Integer.MAX_VALUE) {
						
					}
				}
			}
			/*	if(urray[sheck]<minvertex) {
				sheck=minvertex;
			}*/
		}
	}
}
