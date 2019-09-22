package PieToast;

public class djikstrasalgorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		adjacencymatrix F=new adjacencymatrix(5);
		F.addedge(0, 1, 9);
		F.addedge(0, 2, 3);
		F.addedge(1, 2, 1);
		F.addedge(4, 3, 1);
		F.addedge(3, 2, 1);
		F.addedge(3, 1, 3);
		F.addedge(4, 2, 3);
		F.printmatrix();
		System.out.println(F.dijkstracalc(0, 4));
		
	}

}
