package PieToast;

import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class LinkedList<E> /*extends AbstractList<E>*/{
	int Size=0;
	LinkedListNode<E> head;
	public LinkedList() {
		head=null;
	}
	
	public boolean add(E e) {
		// TODO Auto-generated method stub
		Size++;
		if(head==null) {
			head= new LinkedListNode(e, null);
		}else {
			LinkedListNode add=head;
			while(add.getNext() != null) {
				add=add.getNext();
			}
			add.setNext(new LinkedListNode(e, null));
		}
		return false;
	}

	public void add(int index, E element) {
		// TODO Auto-generated method stub
		Size++;
		if(index==0) {
			LinkedListNode newHead = new LinkedListNode(element, head);
			head=newHead;
		}else {
			LinkedListNode get=head;
			for (int getLoop=1; getLoop<index; getLoop++) {
				get=get.getNext();
			}
			LinkedListNode a= get.getNext();
			get.setNext(new LinkedListNode(element, a));
		}
	}

	
	public boolean addAll(Collection c) {
		// TODO Auto-generated method stub
		for(Object tcejbo : c) {
			add((E) tcejbo);
		}
		return true;
	}

	
	public boolean addAll(int index, Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	
	public void clear() {
		// TODO Auto-generated method stub
		Size=0;
		head=null;
	}
	public boolean contains(E e) {
		// TODO Auto-generated method stub
		return indexOf(e)>=0;
	}

	
	public boolean containsAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	
	public E get(int index) {
		// TODO Auto-generated method stub
		LinkedListNode get=head;
		for (int getLoop=0; getLoop<index; getLoop++) {
			get=get.getNext();
		}
		return (E) get.getValue();
	}

	
	public int indexOf(E e) {
		// TODO Auto-generated method stub
		LinkedListNode indexOf=head;
		for(int iO=0; iO<Size; iO++) {
			if(indexOf.getValue().equals(e)) {
				return iO;
			}
			indexOf=indexOf.getNext();
		}
		return -1;
	}

	
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	

	
	public ListIterator listIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public ListIterator listIterator(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	

	
	public E remove(int index) {
		Size--;
		if(index==0) {
			head=head.getNext();
		}else {
		LinkedListNode remove=head;
		for (int removeLoop=1; removeLoop<index; removeLoop++) {
			remove=remove.getNext();
		}
		LinkedListNode a= remove.getNext().getNext();
		remove.setNext(a);
		}
		return null;
		
	}

	
	public boolean removeAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	
	public boolean retainAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	
	public E set(int index, E element) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public int size() {
		// TODO Auto-generated method stub
		return Size;
	}

	
	public List subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public E[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public E[] toArray(E[] a) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public String toString() {
		String Ts=new String();
		Ts="[";
		for(int tsf=0; tsf<Size; tsf++) {
			if(tsf==Size-1) {
				Ts+=get(tsf);
			}else {
				Ts+=get(tsf)+",";
			}
		}

		Ts+="]";
		return Ts;
	}
}

