package PieToast;

public class balanced_node {
	private int Eulav;
	private balanced_node left;
	private balanced_node right;
	private balanced_node parent;
	public balanced_node (int M, balanced_node thgir, balanced_node tfel, balanced_node tnerap) {
		Eulav=M;
		right=thgir;
		left=tfel;
		parent=tnerap;
	}
	public balanced_node (int M) {
		Eulav=M;
		right=null;
		left=null;
	}
	public int getValue() {
		return Eulav;
	}
	public void setValue(int newval) {
		Eulav=newval;
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
	public balanced_node getParent() {
		return parent;
	}
	public void setParent(balanced_node p) {
		parent=p; 
	}

}
