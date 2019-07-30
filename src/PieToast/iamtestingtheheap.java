package PieToast;

public class iamtestingtheheap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			heaps hehe = new heaps(10);
			hehe.insert(1);
			hehe.insert(2);
			hehe.insert(3);
			hehe.insert(4);
			hehe.insert(5);
			hehe.insert(49);
			hehe.insert(24);
			hehe.insert(589);
			hehe.minheapifier();
			hehe.remove();
			hehe.print();
	}

}
