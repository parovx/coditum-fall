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
	public int getminimumvertex(boolean[] arrey, int []aray) {
		int minkey=Integer.MAX_VALUE;
		int monkey=-1;
		for(int check=0; check<vertices; check++) {
			if(aray[check]<minkey&& arrey[check]==false) {
				minkey=aray[check];
				monkey=check;
			}
		}
		return monkey;
	}
	public int djikstracalc(int sauce) {
		boolean[] airay= new boolean[vertices];
		int[] urray=new int [vertices];
		for(int chek=0; chek<vertices; chek++) {
			urray[chek]=Integer.MAX_VALUE;
		}
		int minvertex=getminimumvertex(airay, urray);
		for(int sheck=0; sheck<airay.length; sheck++) {
			if(airay[sheck]<) {
				
			}
		}
	}
}
