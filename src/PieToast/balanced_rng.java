package PieToast;

import java.util.Random;

public class balanced_rng {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int EEEE=0; EEEE<2147483647; EEEE++){
			Random rand=new Random();
			int num1=rand.nextInt(2147483647);
			System.out.println("bt.add("+num1+");");
		}
	}

}
