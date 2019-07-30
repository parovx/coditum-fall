package PieToast;

public class heaps {
	public int []heap;
	int currentsize;
	int maxsize;
	public heaps(int maxsize) {
		this.currentsize=0;
		this.maxsize=maxsize;
		heap=new int [this.maxsize+1];
		heap[0]=Integer.MIN_VALUE;
	}
	public int getparent (int pos) {
		return pos/2;
	}
	public int getchildl (int pos) {
		return pos*2;
	}
	public int getchildr(int pos) {
		return pos*2+1;
	}
	public boolean isitaleaf(int pos) {
		if(pos>=currentsize/2 && pos<=currentsize) {
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
					heapifier(getchildr(pos));
				}else {
					swap(pos,getchildl(pos));
					heapifier(getchildl(pos));
				}
			}
		}
	}
	public void minheapifier() {
		for(int downwards=currentsize/2; downwards>0; downwards--) {
			heapifier(downwards);
		}
	}

	public void insert(int value) {
		if(currentsize>=maxsize) {
			return;
		}
		heap[++currentsize]=value;
		int tempcurrentsize=currentsize;
		while(heap[tempcurrentsize]<heap[getparent(tempcurrentsize)]) {
			swap(tempcurrentsize, getparent(tempcurrentsize));
			tempcurrentsize=getparent(tempcurrentsize);
		}
	}
	public int remove() {
		int tempremoved=heap[1];
		heap[1]=heap[currentsize--];
		heapifier(1);
		return tempremoved;
	}
	public void print() {
		for(int upwards=1; upwards<=currentsize/2; upwards++) {
			System.out.println(heap[upwards]+" "+heap[upwards*2]+" "+heap[(upwards*2)+1]);
		}
	}
}
