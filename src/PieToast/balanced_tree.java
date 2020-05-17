package PieToast;

public class balanced_tree {
	
	balanced_node head;
	public balanced_tree(){
		
	}
	public static balanced_node right(balanced_node R) {
		balanced_node thetemp1=R.getLeft();
		thetemp1.setRight(R);
		R.setLeft(null);
		return thetemp1;
	}
	
	public static balanced_node left(balanced_node L) {
		balanced_node thetemp1=L.getRight();
		thetemp1.setRight(L);
		L.setRight(null);
		return thetemp1;
	}
	
	public static balanced_node rightleft(balanced_node RL) {
		balanced_node thetemp1=RL.getRight();
		balanced_node thetemp2=RL.getRight().getLeft();
		thetemp2.setRight(thetemp1);
		RL.setRight(null);
		thetemp2.setLeft(RL);
		thetemp2.setRight(null);
		return thetemp2;
	}
	
	public static balanced_node leftright(balanced_node LR) {
		balanced_node thetemp1=LR.getLeft();
		balanced_node thetemp2=LR.getLeft().getRight();
		thetemp2.setLeft(thetemp1);
		LR.setLeft(null);
		thetemp2.setRight(LR);
		thetemp2.setLeft(null);
		return thetemp2;
	}
	
	public static void balance(balanced_node C) {
		if(C.getRight()==null && C.getLeft()!=null) {
			if(C.getLeft().getLeft()==null && C.getLeft().getRight()!=null) {
				leftright(C);
			}else if(C.getLeft().getLeft()!=null && C.getLeft().getRight()==null){
				left(C);
			}
		}
		if(C.getRight()!=null && C.getLeft()==null) {
			if(C.getRight().getRight()==null && C.getRight().getLeft()!=null){
				rightleft(C);
			}else if(C.getRight().getRight()!=null && C.getRight().getLeft()==null) {
				right(C);
			}
		}
	}
}