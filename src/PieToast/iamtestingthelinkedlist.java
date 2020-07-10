package PieToast;

import java.util.Random;

public class iamtestingthelinkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll=new LinkedList();
		for (int EEEE=0; EEEE<1000; EEEE++){
			Random rand=new Random();
			int num1=rand.nextInt(2147483647);
			ll.add(num1);
		}
		System.out.println(ll.toString());
	}

}
