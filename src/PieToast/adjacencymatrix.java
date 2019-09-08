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
		int monkey=0;
		for(int check=0; check<size; check++) {
			if(aray[check]<minkey&& arrey[check]==false) {
				minkey=aray[check];
				monkey=check;
			}
		}
		return monkey;
	}
	public int dijkstracalc(int sauce) {
		boolean[] checkingboolean= new boolean[size];
		int[] distances=new int [size];
		for(int chek=0; chek<size; chek++) {
			distances[chek]=Integer.MAX_VALUE;
		}
		distances[sauce]=0;
		int destination=adjacencyarray[size-1][size-1];
		while(destination!=9){
			for(int sheccloop1=0; sheccloop1<Integer.MAX_VALUE; sheccloop1++) {
				int minvertex=getminimumvertex(checkingboolean, distances);
				checkingboolean[minvertex]=true;
				for(int sheccloop2=0; sheccloop2<Integer.MAX_VALUE; sheccloop2++) {
					if(adjacencyarray[minvertex][sheccloop2]>0) {
						if(checkingboolean[sheccloop2]==false && adjacencyarray[minvertex][sheccloop1]!=Integer.MAX_VALUE) {
							int newminimum=distances[minvertex]+adjacencyarray[minvertex][sheccloop2];
							if(distances[sheccloop2]==destination){
								distances[sheccloop2]=newminimum;
							}else if(distances[sheccloop2]>newminimum) {
								System.out.print(minvertex+" ");
								System.out.print(sheccloop2+" ");
								System.out.println(adjacencyarray[minvertex][sheccloop2]);
								distances[sheccloop2]=newminimum;
								adjacencyarray[minvertex][sheccloop2]=9;
								for(int rowcounter=0; rowcounter<adjacencyarray.length; rowcounter++) {
									for(int columncounter=0; columncounter<adjacencyarray.length; columncounter++) {
										System.out.print(adjacencyarray[rowcounter][columncounter]+" ");
									}
									System.out.println();
								}
								System.out.println();
							}
						}
					}

				}
			}
		}
		return distances[size-1];
	}
}
