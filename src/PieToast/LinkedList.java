package PieToast;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class LinkedList implements List{
	int Size=0;
	LinkedListNode head;
	public LinkedList() {
		head=null;
	}
	@Override
	public boolean add(Object e) {
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

	@Override
	public void add(int index, Object element) {
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
	public void clear() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object get(int index) {
		// TODO Auto-generated method stub
		LinkedListNode get=head;
		for (int getLoop=0; getLoop<index; getLoop++) {
			get=get.getNext();
		}
		return get.getValue();
	}

	@Override
	public int indexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
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
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		Size--;

		return false;
	}

	@Override
	public Object remove(int index) {
		// TODO Auto-generated method stub
		return null;
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
	public Object set(int index, Object element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List subList(int fromIndex, int toIndex) {
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

