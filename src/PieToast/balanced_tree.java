package PieToast;

public class balanced_tree {
	public static void right(balanced_node L) {
		balanced_node thetempL=L;
		balanced_node thetemp2=L.getLeft().getRight();
		L.getLeft().setRight(L);
		L.setLeft(thetemp2);
	}
	public static void left(balanced_node R) {
		balanced_node thetempR=R;
		balanced_node thetemp2=R.getRight().getLeft();
		R.getRight().setLeft(R);
		R.setRight(thetemp2);
	}
}