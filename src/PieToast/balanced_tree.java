package PieToast;

public class balanced_tree {
	public static void right(balanced_node L) {
		balanced_node thetempL=L;
		balanced_node thetemp2=L.getLeft().getRight();
		L.setLeft(thetemp2);
		L.getLeft().setRight(L);
	}
	public static void left(balanced_node R) {
		balanced_node thetempR=R;
		balanced_node thetemp2=R.getRight().getLeft();
		R.setRight(thetemp2);
		R.getRight().setLeft(R);
	}
	public static balanced_node rightleft(balanced_node RL) {
		balanced_node thetemp1=RL.getRight();
		balanced_node thetemp2=RL.getRight().getLeft();
		thetemp2.setRight(thetemp1);
		thetemp2.setLeft(RL);
		return thetemp2;
	}
}