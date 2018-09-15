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
		return false;
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
				}else{
					if((int) e<add.getValue()){
						if(add.getRight()==null){
							add.setRight(new Binary_Bearch_BreeNode ((int) e, null, null));
						return true;
						}
						add=add.getRight();
					}
				}
			}
			
		}
		return false;
	}
	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
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

	}
	@Override
	public Object get(int index) {
		// TODO Auto-generated method stub
		return null;
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