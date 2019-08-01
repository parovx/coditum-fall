package PieToast;

public class djikstra {
	public adjacencymatrix dam;
	public int vertices;
	public djikstra(int vertices) {
		dam= new adjacencymatrix(vertices);
		this.vertices=vertices;
	}
	public void addedge(int sauce, int destination, int cost) {
		dam.addedge(sauce, destination, cost);		
	}
	public void getminimumvertex(boolean[] arrey, int []aray) {
		int minkey=Integer.MAX_VALUE;
		int monkey=-1;
		for(int check=0; check<vertices; check++) {
			if(aray[check]<minkey) {
				
			}
		}
	}
}
