package PieToast;

public class iamtestingtheadjacencylist2 {

	public static void main(String[] args) throws NullPointerException{
		// TODO Auto-generated method stub
		adjacencylist2 alt= new adjacencylist2(4);
		alt.add(0, 1, 3);
		alt.add(1, 0, 2);
		alt.add(2, 3, 1);
		alt.add(3, 0, 2);
		alt.print();
	}

}
