package PieToast;

public class iamtestingtheadjacencymatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		adjacencymatrix am=new adjacencymatrix(5);
		am.addedge(0, 1, 1);
		am.addedge(3, 4, 1);
		am.addedge(2, 3, 1);
		am.addedge(4, 3, 1);
		am.addedge(1, 0, 1);
		am.addedge(3, 2, 1);
		am.addedge(1, 0, 1);
		am.addedge(2, 3, 1);
		am.addedge(3, 2, 1);
		am.addedge(4, 2, 1);
		am.printmatrix();
		System.out.println();
		am.addcolumn(2);
		am.addedge(5, 4, 1);
		am.addedge(6, 5, 1);
		am.addedge(5, 3, 1);
		am.printmatrix();
	}

}