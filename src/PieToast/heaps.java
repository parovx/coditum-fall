package PieToast;

public class heaps {
	public int []heap;
	int currentsize;
	int maxsize;
	public heaps(int maxsize) {
		this.currentsize=0;
		this.maxsize=maxsize;
		heap=new int [this.maxsize];
	}
	public int getparent (int pos) {
		return pos/2;
	}
	public int getchildl (int pos) {
		return pos*2+ 1;
	}
	public int getchildr(int pos) {
		return pos*2+2;
	}
	public boolean isitaleaf(int pos) {
		if(pos>=currentsize/2 && pos<currentsize) {
			return true;
		}else {
			return false;
		}
	}
	public void swap(int pos, int sop) {
		int temporarypos=heap[pos];
		heap[pos]=heap[sop];
		heap[sop]=temporarypos;
	}
	public void heapifier(int pos) {
		if(isitaleaf(pos)==false){
			if(heap[getchildl(pos)]<heap[pos] || heap[getchildr(pos)]<heap[pos]) {
				if(heap[getchildl(pos)]>heap[getchildr(pos)]) {
				swap(pos, getchildr(pos));
				}else {
					swap(pos,getchildl(pos));
				}
			}
		}
	}
}
