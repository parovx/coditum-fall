package PieToast;

public class balanced_node {
	private int Eulav;
	private balanced_node left;
	private balanced_node right;
	public balanced_node (int M, balanced_node thgir, balanced_node tfel) {
		Eulav=M;
		right=thgir;
		left=tfel;
	}
	public balanced_node (int M) {
		Eulav=M;
		right=null;
		left=null;
	}
	public int getValue() {
		return Eulav;
	}
	public balanced_node getLeft() {
		return left;
	}
	public balanced_node getRight() {
		return right;
	}
	public void setLeft(balanced_node l) {
		left=l;
	}
	public void setRight(balanced_node r) {
		right=r;
	}
	public void setValue(int newval) {
		Eulav=newval;
	}

	public void add(Object a){
		if ((int) a < getValue()) {
			getLeft().add(a);
		} else if((int)a> getValue()){
			getRight().add(a);
		}else{
			return;
		}
	}
}
