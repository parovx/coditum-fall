package PieToast;

import java.util.ArrayList;
import java.util.Random;

public class cardgame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> blackjacklist=new ArrayList<Integer>();
		ArrayList<Integer> blackjackplayer=new ArrayList<Integer>();
		ArrayList<Integer> blackjackdealer=new ArrayList<Integer>();
		ArrayList<Integer> blackjackdeck=new ArrayList<Integer>();
		for(int i=0; i<4; i++){
			blackjackdeck.add(10);
			blackjackdeck.add(10);
			blackjackdeck.add(10);
			for(int j=1; j<11; j++){
				blackjackdeck.add(i,j);
			}
		}
		Random rand=new Random();
		int randbjshuffto=rand.nextInt(1234567890);
		System.out.println("Shuffling...");
		for(int shuffleblackjack=0; shuffleblackjack<randbjshuffto; shuffleblackjack++){
			int bjshuff1=(int)(Math.random() * blackjackdeck.size());
			int bjshuff2=(int)(Math.random()*blackjackdeck.size());
			
			int bjtemp1=blackjackdeck.get(bjshuff1);
			int bjtemp2=blackjackdeck.get(bjshuff2);
			
			blackjackdeck.set(bjshuff1, bjtemp2);
			blackjackdeck.set(bjshuff2, bjtemp1);
		}
		//test
			System.out.println(blackjackdeck);
			System.out.println(blackjackplayer);
			System.out.println(blackjackdealer);
		//real
			//blackjackdeck.
	//test
		//System.out.println(blackjackdeck);
		//System.out.println(blackjackplayer);
		//System.out.println(blackjackdealer);
	}

}
