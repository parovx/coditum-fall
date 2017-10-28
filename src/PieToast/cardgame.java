package PieToast;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

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
		int randbjshuffto=rand.nextInt(12345);
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
		//real
		blackjackplayer.add(blackjackdeck.get(0));
		blackjackplayer.add(blackjackdeck.get(1));
		blackjackdealer.add(blackjackdeck.get(2));
		blackjackdealer.add(blackjackdeck.get(3));
		for(int bjdeal=0; bjdeal<4; bjdeal++){
			blackjackdeck.remove(0);
		}
		//test
		System.out.println(blackjackdeck);
		System.out.println(blackjackplayer);
		System.out.println(blackjackdealer);
		//real
		boolean bjhit=true;
		while(bjhit==true){
			System.out.println("Hit or stand? 1=hit, 2=stand");
			Scanner scan=new Scanner(System.in);
			int bjhitorstay=scan.nextInt();
			if(bjhitorstay==1){
				blackjackplayer.add(blackjackdeck.get(0));
				blackjackdeck.remove(0);
				int sum=sumOf(blackjackplayer);
				if(sum>21){
					System.out.println("YOU BUST! ( ͡° ͜ʖ ͡°)");
					bjhit=false;
				}
				System.out.println(blackjackplayer);
				System.out.println(blackjackdealer);
			}else if(bjhitorstay==2){
				bjhit=false;	
			}else{
				System.out.println("(ಠ_ಠ)");
			}
		}
		if(sumOf(blackjackplayer)<21){
			boolean bjai=true;
			while (bjai=true){
				int sum2=sumOf(blackjackdealer);
				if(sum2<17){
					blackjackdealer.add(blackjackdeck.get(0));
					blackjackdeck.remove(0);
				}else{
					bjai=false;
				}
			}
			//if
			if(sumOf(blackjackdealer)>21){
				System.out.println("DEALER BUST! Dealer will haunt you forever ( ͡° ͜ʖ ͡°)");
			}else if(sumOf(blackjackplayer)>sumOf(blackjackdealer)){
				System.out.println("YOU WIN! Dealer will haunt you forever ( ͡° ͜ʖ ͡°)");
			}else if(sumOf(blackjackdealer)>sumOf(blackjackplayer)){
				System.out.println("YOU LOSE!");
				boolean lenny=true;
				while(lenny=true){
					System.out.println("( ͡° ͜ʖ ͡°)");
				}
			}else{
				System.out.println("TIE! (ಠ_ಠ) To be continued...");
			}
		}
	}

	public static int sumOf(ArrayList<Integer> ListofSum){
		int sum=0;
		for(int i=0; i<ListofSum.size(); i++){
			sum+=ListofSum.get(i);
		}
		return sum;
	}
}
