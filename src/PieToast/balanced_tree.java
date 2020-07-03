package PieToast;

public class balanced_tree {
	balanced_node head;
	public balanced_tree(){
		head=null;
	}
	public balanced_node right(balanced_node R) {
		balanced_node templ=R.getLeft();
		R.setLeft(templ.getRight());
		templ.setParent(R.getParent());
		templ.setRight(R);
		R.setParent(templ);
		if(templ.getParent()==null) {
			head=templ;

		}else{
			if(templ.getParent().getLeft()!=null) {

				if(templ.getParent().getLeft().equals(templ.getRight())) {
					templ.getParent().setLeft(templ);
				}
				while(head.getParent()!=null) {
					head=head.getParent();
				}
			}
		}
		System.out.println("right");
		return templ;
	}

	public balanced_node left(balanced_node L) {
		balanced_node tempr=L.getRight();
		tempr.setParent(tempr.getParent().getParent());
		L.setRight(tempr.getLeft());
		tempr.setLeft(L);
		L.setParent(tempr);
		if(tempr.getParent()==null) {
			head=tempr;

		}else{
			if(tempr.getParent().getRight()!=null) {

				if(tempr.getParent().getRight().equals(tempr.getLeft())) {
					tempr.getParent().setRight(tempr);
				}
			}
		}
		System.out.println("left");
		System.out.println("Left balance's right node is "+tempr.getRight().getValue());
		return tempr;
	}
	
	public balanced_node rightleft(balanced_node RL) {
		balanced_node temp2=RL.getRight().getLeft();
		balanced_node temprl=temp2.getRight();
		temp2.setRight(RL.getRight());
		RL.setRight(temp2);
		temp2.setParent(RL);
		temp2.getRight().setParent(temp2);
		temp2.getRight().setLeft(temprl);
		balanced_node tempaboveloop=RL.getParent();
		RL.getParent().setLeft(temp2);
		temp2.setParent(tempaboveloop);
		temp2.setLeft(RL);
		RL.setRight(null);
		System.out.println("rightleft");
		return temp2;

	}

	public balanced_node leftright(balanced_node LR) {
		balanced_node temp2=LR.getLeft();
		balanced_node templr=temp2.getLeft();
		temp2.setLeft(LR.getLeft());
		LR.setLeft(temp2);
		temp2=right(LR);
		temp2.getLeft().setRight(templr);
		balanced_node tempaboveloop=LR.getParent();
		LR.getParent().setRight(temp2);
		temp2.setParent(tempaboveloop);
		temp2.setRight(LR);
		LR.setLeft(null);
		System.out.println("leftright");
		return temp2;
	}

	public balanced_node balance(balanced_node C) {
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
/*
     2
  1     4
      3   5
 */