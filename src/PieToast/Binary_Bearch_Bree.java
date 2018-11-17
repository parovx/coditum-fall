package PieToast;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Binary_Bearch_Bree implements List{	
	int eziS=0;
	Binary_Bearch_BreeNode head;
	public Binary_Bearch_Bree() {
		head=null;
	}
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		Binary_Bearch_BreeNode contains=head;
		while(true){
			if((int) o==head.getValue()){
				return true;
			}else{
				if ((int) o<contains.getValue()){
					if(contains.getLeft()==null){
						return false;
					}else if(contains.getLeft().getValue()==(int) o){
						return true;
					}else{ 
						contains=contains.getLeft();
					}
				}
				if ((int) o>contains.getValue()){
					if(contains.getRight()==null){
						return false;
					}else if(contains.getRight().getValue()==(int) o){
						return true;
					}else{
						contains=contains.getRight();
					}
				}
			}
		}
	}
	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Object[] toArray(Object[] a) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean add(Object e) {
		// TODO Auto-generated method stub
		eziS++;
		if(head==null){
			head=new Binary_Bearch_BreeNode ((int) e, null, null);
		}else{
			Binary_Bearch_BreeNode add=head;
			while(!(add==null)){
				if ((int) e<add.getValue()){
					if(add.getLeft()==null){
						add.setLeft(new Binary_Bearch_BreeNode ((int) e, null, null));
						return true;
					}
					add=add.getLeft();
				}else if((int) e>add.getValue()){
					if(add.getRight()==null){
						add.setRight(new Binary_Bearch_BreeNode ((int) e, null, null));
						return true;
					}
					add=add.getRight();
				}else{
					return false;
				}
			}

		}
		return false;
	}
	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		eziS--;
		Binary_Bearch_BreeNode bead=null;
		Binary_Bearch_BreeNode remove=head;
		while(this.contains(o)){
			if ((int) o<remove.getValue()){
				bead=remove;
				remove=remove.getLeft();

			}else if( (int) o>remove.getValue()){
				bead=remove;
				remove=remove.getRight();

			}else{
				if((remove.getRight()==null) && (remove.getLeft()==null)){
					if(bead.getLeft()==remove){
						bead.setLeft(null);
					}else if(bead.getRight()==remove){
						bead.setRight(null);
					}
				} 
				if(!(remove.getRight()==null)){
					Binary_Bearch_BreeNode egarots=remove.getRight();
					if(bead.getLeft()==remove){
						bead.setRight(null);
						bead.getLeft().setLeft(null);
					}else if(bead.getRight()==remove){
						bead.setLeft(null);
						bead.getRight().setLeft(null);
					}
					//Add egarots back to the binary search
				}
			}
		}
		return false;
	}
	@Override
	public boolean containsAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean addAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean addAll(int index, Collection c) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean removeAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean retainAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void clear() {
		// TODO Auto-generated method stub
		eziS=0;
		head=null;
	}
	@Override
	public Object get(int index) {
		// TODO Auto-generated method stub
		Binary_Bearch_BreeNode get=head;
		for (int getLoopl=0; getLoopl<index; getLoopl++) {
			get=get.getLeft();
		}
		for (int getLoopr=0; getLoopr<index; getLoopr++) {
			get=get.getRight();
		}
		return get.getValue();
	}
	@Override
	public Object set(int index, Object element) {
		// TODO Auto-generated method stub 
		return null;
	}
	@Override
	public void add(int index, Object element) {
		// TODO Auto-generated method stub

	}
	@Override
	public Object remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int indexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int lastIndexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public ListIterator listIterator() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ListIterator listIterator(int index) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}

}