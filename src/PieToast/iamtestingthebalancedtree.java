package PieToast;

import java.util.Random;

public class iamtestingthebalancedtree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		balanced_tree bt=new balanced_tree();
		for (int EEEE=0; EEEE<2147483647; EEEE++){
			Random rand=new Random();
			int num1=rand.nextInt(2147483647);
			bt.add(num1);
		}
		bt.sidewaysprint(bt.head, 0);
	}

}
