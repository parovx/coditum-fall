package PieToast;

public class iamtestingtheadjacencymatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		adjacencymatrix am=new adjacencymatrix(5);
		am.addedge(0, 1, 1);
		am.addedge(3, 4, 2);
		am.addedge(2, 1, 4);
		am.addedge(3, 1, 3);
		am.printmatrix();
		System.out.println();
		System.out.println(am.bfs(2, 4));
	}

}