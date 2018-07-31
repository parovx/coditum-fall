package PieToast;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Arraylist implements List{

	@Override
	public boolean add(Object arg0) {
		// TODO Auto-generated method stub
		A[size]=arg0;
		size++;
		if (size==A.length){
			Object[] B= new Object[A.length+1];
			for(int AtoB=0; AtoB<A.length; AtoB++) {
				B[AtoB]=A[AtoB];
			}
			A=B;
		}
		return true;
	}

	@Override
	public void add(int arg0, Object arg1) {
		size++;// TODO Auto-generated method stub
		if (size==A.length){
			Object[] B= new Object[A.length+1];
			for(int AtoB=0; AtoB<A.length; AtoB++) {
				B[AtoB]=A[AtoB];
			}
			A=B;
		}
		for(int backwards=size-2; backwards>=arg0; backwards--) {
			A[backwards+1]=A[backwards];
		}

		A[arg0]=arg1;

	}

	@Override
	public boolean addAll(Collection arg0) {
		// TODO Auto-generated method stub
		for(Object object: arg0) {
			add(object); 
		}
		return true;
	}

	@Override
	public boolean addAll(int arg0, Collection arg1) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		for(int clear=0; clear<A.length; clear++) {
			A[clear]=null;
		}
		size=0;
	}

	@Override
	public boolean contains(Object arg0) {
		// TODO Auto-generated method stub
		//		for(int c=0; c<size; c++) {
		//			if(A[c].equals(arg0)) {
		//				return true;
		//			}
		//		}
		//		return false;
		return indexOf(arg0)>=0;
	}

	@Override
	public boolean containsAll(Collection arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object get(int arg0) {
		// TODO Auto-generated method stub

		return A[arg0];
	}

	@Override
	public int indexOf(Object arg0) {
		// TODO Auto-generated method stub
		for(int s=0; s<size; s++) {

			if(A[s].equals(arg0)) {
				return s;
			}
		}
		return -1;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int lastIndexOf(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ListIterator listIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListIterator listIterator(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(Object arg0) {
		// TODO Auto-generated method stub
		if(indexOf(arg0)>=0) {
			remove(indexOf(arg0));
			return true;
		}
		return false;
	}

	@Override
	public Object remove(int arg0) {
		// TODO Auto-generated method stub
		size--;
		Object V=A[arg0];
		for(int forwards=arg0; forwards<=size; forwards++) {
			A[forwards]=A[forwards+1];
		}
		return V;
	}

	@Override
	public boolean removeAll(Collection arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object set(int arg0, Object arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	public List subList(int arg0, int arg1) {
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
	public String toString() {
		String tS= "[";
		for(int t=0; t<size; t++) {
			if(t==size-1) {
				tS+=A[t];
			}else {
			 tS+=A[t]+",";
			}
		 }
		
		tS+="]";
		return tS;
	}
	Object[] A= new Object[5];
	int size=0;
}
