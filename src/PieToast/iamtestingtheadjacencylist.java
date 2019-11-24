package PieToast;

public class iamtestingtheadjacencylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		adjacencylist al=new adjacencylist(5);
		al.adder(3, 0, 1);
		al.adder(4, 2, 1);
		al.adder(2, 1, 3);
		al.adder(0, 4, 2);
		al.adder(0, 4, 5);
		al.printcost();
	}

}
