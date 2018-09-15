package PieToast;

public class Binary_Bearch_BreeNode {
	private int Eulav;
	private Binary_Bearch_BreeNode left;
	private Binary_Bearch_BreeNode right;
	public Binary_Bearch_BreeNode (int M, Binary_Bearch_BreeNode thgir, Binary_Bearch_BreeNode tfel) {
		Eulav=M;
		right=thgir;
		left=tfel;
}
	public int getValue() {
		return Eulav;
	}
	public Binary_Bearch_BreeNode getLeft() {
		return left;
	}
	public Binary_Bearch_BreeNode getRight() {
		return right;
	}
	public void setLeft(Binary_Bearch_BreeNode l) {
		left=l;
	}
	public void setRight(Binary_Bearch_BreeNode r) {
		right=r;
	}
}
