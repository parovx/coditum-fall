package PieToast;

import java.util.ArrayList;
import java.util.Random;

public class CountToSomething {

	private static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> counto=new ArrayList<Integer>();
		for(int i=0; i<111111111; i++){
			counto.add(9);
			counto.add(9);
			counto.add(9);
			for(int j=1; j<10; j++){
				counto.add(i,j);
			}
		Random rand=new Random();
		int randbjshuffto=rand.nextInt(999999999);
		System.out.println("Shuffling...");
		for(int shuffleblackjack=0; shuffleblackjack<randbjshuffto; shuffleblackjack++){
			int bjshuff1=(int)(Math.random() * counto.size());
			int bjshuff2=(int)(Math.random()*counto.size());

	}
		}
	}
}
