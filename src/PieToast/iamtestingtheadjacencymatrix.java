package PieToast;

public class iamtestingtheadjacencymatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		adjacencymatrix am=new adjacencymatrix(5);
		am.addedge(0, 1, 1);
		am.addedge(3, 4, 1);
		am.addedge(2, 3, 4);
		am.addedge(4, 3, 3);
		am.addedge(1, 0, 2);
		am.addedge(3, 2, 1);
		am.addedge(1, 0, 2);
		am.addedge(2, 3, 1);
		am.addedge(3, 2, 4);
		am.addedge(4, 2, 3);
		am.addedge(1, 1, 2);
		am.addedge(2, 1, 1);
		am.addedge(3, 1, 3);
		am.addedge(3, 3, 2);
		am.addedge(4, 4, 4);
		am.addedge(2, 2, 3);
		am.addedge(0, 0, 1);
		am.addedge(0, 2, 3);
		am.addedge(0, 4, 3);
		am.addedge(1, 4, 2);
		am.addedge(0, 3, 4);
		am.printmatrix();
		System.out.println();
		System.out.println(am.dijkstracalc(0));
		am.printmatrix();
	}

}