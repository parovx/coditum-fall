package PieToast;

public class iamtestingthebalancedtree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		balanced_tree bt=new balanced_tree();
		//bt.add(9);
		bt.add(5);
		bt.add(4);
		bt.add(1);
		bt.add(3);
		bt.add(2);
		bt.sidewaysprint(bt.head, 0);
	}

}
