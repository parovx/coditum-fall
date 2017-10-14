package PieToast;

import java.util.ArrayList;

public class cardgame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList blackjacklist=new ArrayList();
		ArrayList blackjackplayer=new ArrayList();
		ArrayList blackjackdealer=new ArrayList();
		ArrayList blackjackdeck=new ArrayList();
		for(int i=0; i<4; i++){
			blackjackdeck.add(10);
			blackjackdeck.add(10);
			blackjackdeck.add(10);
			for(int j=1; j<11; j++){
				blackjackdeck.add(i,j);
			}
		}
		//test
			System.out.println(blackjackdeck);
			System.out.println(blackjackplayer);
			System.out.println(blackjackdealer);
		//real
			
	//test
		System.out.println(blackjackdeck);
		System.out.println(blackjackplayer);
		System.out.println(blackjackdealer);
	}

}
