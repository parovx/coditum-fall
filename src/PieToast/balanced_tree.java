package PieToast;

public class balanced_tree {

	balanced_node head=null;
	public balanced_tree(){

	}
	public static balanced_node right(balanced_node R) {
		balanced_node templ=R.getLeft();
		R.setLeft(templ.getRight());
		templ.setRight(R);
		System.out.println("right");
		return templ;
	}

	public static balanced_node left(balanced_node L) {
		balanced_node tempr=L.getRight();
		tempr.setParent(null);
		L.setRight(tempr.getLeft());
		tempr.setLeft(L);
		L.setParent(tempr);
		System.out.println("left");
		System.out.println("Left balance's right node is "+tempr.getRight().getValue());
		return tempr;
	}
//no problem is here, balance is the problem
	public static balanced_node rightleft(balanced_node RL) {
		balanced_node temp2=RL.getRight().getLeft();
		balanced_node temprl=temp2.getRight();
		temp2.setRight(RL.getRight());
		RL.setRight(temp2);
		temp2=left(RL);
		temp2.getRight().setLeft(temprl);
		System.out.println("rightleft");
		return temp2;
		
	}

	public static balanced_node leftright(balanced_node LR) {
		balanced_node temp2=LR.getLeft().getRight();
		balanced_node templr=temp2.getLeft();
		temp2.setLeft(LR.getLeft());
		LR.setLeft(temp2);
		temp2=right(LR);
		temp2.getLeft().setRight(templr);
		System.out.println("leftright");
		return temp2;
	}

	public static balanced_node balance(balanced_node C) {
		if(C.getRight()==null && C.getLeft()!=null) {
			if(C.getLeft().getLeft()==null && C.getLeft().getRight()!=null) {
				return leftright(C);
			}else if(C.getLeft().getLeft()!=null && C.getLeft().getRight()==null){
				return right(C);
			}
		}
		if(C.getRight()!=null && C.getLeft()==null) {
			if(C.getRight().getRight()==null && C.getRight().getLeft()!=null){
				return rightleft(C);
			}else if(C.getRight().getRight()!=null && C.getRight().getLeft()==null) {
				return left(C);
			}
		}
		return C;
	}

	public  void add(int n) {
		if(head==null){
			head=new balanced_node (n);
		}else{
			balanced_node temp=head;
			while(true) {
				sidewaysprint(head, 0);
				System.out.println("add begins");
				if(temp.getValue()>n && temp.getLeft()==null) {
					temp.setLeft(new balanced_node (n));
					temp.getLeft().setParent(temp);
					if(temp.getParent()!=null) {
						balance(temp.getParent());
						//overwrite parent
					}
					break;
				}else if(temp.getValue()<n && temp.getRight()==null) {
					temp.setRight(new balanced_node (n));
					temp.getRight().setParent(temp);
					if(temp.getParent()!=null) {
						System.out.println("parent "+temp.getParent().getValue());
						balance(temp.getParent());
					}
					break;
				}else if(temp.getValue()>n && temp.getLeft()!=null) {
					temp=temp.getLeft();
				}else if(temp.getValue()<n && temp.getRight()!=null){
					temp=temp.getRight();
				}
			}
		}
		if(!head.equals(null)){
			
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