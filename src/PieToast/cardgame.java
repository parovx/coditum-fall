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
			for(int j=0; j<13; j++){
				blackjackdeck.add(new Card(j,i));
				
			}
			
		}
		
		boolean stopornot=true;
		while(stopornot==true){
			
		}

		
	}

}
