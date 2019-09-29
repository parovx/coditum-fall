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
		int minkey=Integer.MAX_VALUE-1;
		int monkey=0;
		for(int check=0; check<size; check++) {
			if(aray[check]<minkey&& arrey[check]==false) {
				minkey=aray[check];
				monkey=check;
			}
		}
		return monkey;
	}
	public int dijkstracalc(int sauce, int dest) {
		boolean[] checkingboolean= new boolean[size];
		int[] distances=new int [size];

		for(int chek=0; chek<size; chek++) {
			distances[chek]=Integer.MAX_VALUE-1;		
			checkingboolean[chek]=false;
		}
		distances[sauce]=0;
		while(checkingboolean[dest]==false){
			for(int sheccloop1=0; sheccloop1<5; sheccloop1++) {
				int minvertex=getminimumvertex(checkingboolean, distances);
				checkingboolean[minvertex]=true;
				for(int sheccloop2=0; sheccloop2<5; sheccloop2++) {
					System.out.print(minvertex+" ");
					System.out.println(sheccloop2+" ");
					if(adjacencyarray[minvertex][sheccloop2]>0) {
						if(checkingboolean[sheccloop2]==false) {
							int newminimum=distances[minvertex]+adjacencyarray[minvertex][sheccloop2];
							if(distances[sheccloop2]>newminimum) {
								System.out.print(minvertex+" ");
								System.out.print(sheccloop2+" ");
								System.out.println(adjacencyarray[minvertex][sheccloop2]);
								distances[sheccloop2]=newminimum;

								System.out.println();
							}
						}
					}

				}
			}
		}
		return distances[size-1];
	}

	public int minspanningtree(int source){
		int theaddeddistances=0;
		boolean[] checkingboolean= new boolean[size];
		int[] distances=new int [size];

		for(int chek=0; chek<size; chek++) {		
			checkingboolean[chek]=false;
			distances[chek]=Integer.MAX_VALUE-1;
		}
		for(int sheccloop1=0; sheccloop1<5; sheccloop1++) {
			int minvertex=getminimumvertex(checkingboolean, distances);
			checkingboolean[minvertex]=true;
			for(int sheccloop2=0; sheccloop2<5; sheccloop2++) {
				theaddeddistances=theaddeddistances+getcost(source, sheccloop2);
			}
		}
		return theaddeddistances;
	}

}
