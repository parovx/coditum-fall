package PieToast;

public class balanced_tree {

	balanced_node head=null;
	public balanced_tree(){

	}
	public static balanced_node right(balanced_node R) {
		balanced_node templ=R.getLeft();
		R.setLeft(templ.getRight());
		templ.setRight(R);
		return templ;
	}

	public static balanced_node left(balanced_node L) {
		balanced_node tempr=L.getRight();
		L.setRight(tempr.getLeft());
		tempr.setLeft(L);
		return tempr;
	}

	public static balanced_node rightleft(balanced_node RL) {
		balanced_node thetemp1=RL.getRight();
		balanced_node thetemp2=RL.getRight().getLeft();
		RL.setRight(thetemp2.getLeft());
		thetemp2.setLeft(RL);
		thetemp1.setLeft(thetemp2.getRight());
		thetemp2.setRight(thetemp1);
		return thetemp2;
	}

	public static balanced_node leftright(balanced_node LR) {
		balanced_node thetemp1=LR.getLeft();
		balanced_node thetemp2=LR.getLeft().getRight();
		LR.setLeft(thetemp2.getRight());
		thetemp2.setRight(LR);
		thetemp1.setRight(thetemp2.getLeft());
		thetemp2.setLeft(thetemp1);
		return thetemp2;
	}

	public static void balance(balanced_node C) {
		if(C.getRight()==null && C.getLeft()!=null) {
			if(C.getLeft().getLeft()==null && C.getLeft().getRight()!=null) {
			//	C=leftright(C);
			}else if(C.getLeft().getLeft()!=null && C.getLeft().getRight()==null){
				C=left(C);
			}
		}
		if(C.getRight()!=null && C.getLeft()==null) {
			if(C.getRight().getRight()==null && C.getRight().getLeft()!=null){
			//	C=rightleft(C);
			}else if(C.getRight().getRight()!=null && C.getRight().getLeft()==null) {
				C=right(C);
			}
		}
	}

	public  void add(int n) {
		if(head==null){
			head=new balanced_node (n);
		}else{
			balanced_node temp=head;
			balanced_node parent=null;
			while(true) {
				sidewaysprint(head, 0);
				System.out.println("a");
				if(temp.getValue()>n && temp.getLeft()==null) {
					temp.setLeft(new balanced_node (n));
					if(parent!=null && parent!=head) {
						balance(parent);
					}
					break;
				}else if(temp.getValue()<n && temp.getRight()==null) {
					temp.setRight(new balanced_node (n));
					if(parent!=null && parent!=head) {
						balance(parent);
					}
					break;
				}else if(temp.getValue()>n && temp.getLeft()!=null) {
					parent=temp;
					temp=temp.getLeft();
				}else if(temp.getValue()<n && temp.getRight()!=null){
					parent=temp;
					temp=temp.getRight();
				}
			}
		}
	}

	public void sidewaysprint (balanced_node node, int depth) {

		if(node!=null) {
			sidewaysprint(node.getRight(), depth+1);
			for(int spacer=0; spacer<depth; spacer++) {
				System.out.print("  ");
			}
			System.out.println(node.getValue());
			sidewaysprint(node.getLeft(), depth+1);
		}
	}
}