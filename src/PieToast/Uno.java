package PieToast;

import java.util.Scanner;

public class Uno {
	static UnoCards[] hand= new UnoCards[101];
	static UnoCards[] hand2= new UnoCards[101];
	static UnoDeck deck=new UnoDeck();
	static UnoCards playedcard;
	public static void bigprint() {
		for(int x=0; x<175; x++) {
			System.out.println();
		}
	}
	public static void hand1print() {
		System.out.println("Your Hand: ");
		for(int x=1; x<hand.length+1; x++) {
			if(hand[x]==null) {
				x=103;
			}else {
				System.out.print(x+": "+hand[x].printCard());
			}
		}
		System.out.println();
	}
	public static void hand2print() {
		System.out.println("Your Hand: ");
		for(int x=1; x<hand2.length+1; x++) {
			if(hand2[x]==null) {
				x=103;
			}else {
				System.out.print(x+": "+hand2[x].printCard());
			}
		}
		System.out.println();
	}
	public static void thecardprint() {
		System.out.println("Active Card: "+playedcard.printCard());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		deck.create();
		deck.shuffle();
		for(int hand1maker=0; hand1maker<8; hand1maker++) {
			hand[hand1maker]=deck.get(0);
			deck.remove(0);
			for(int x=0; x<deck.size()-1; x++) {
				deck.set(x, deck.get(x+1));
			}
			//System.out.print(hand[hand1maker].printCard());
		}
		System.out.println();
		for(int hand2maker=0; hand2maker<8; hand2maker++) {
			hand2[hand2maker]=deck.get(0);
			deck.remove(0);
			for(int x=0; x<deck.size()-1; x++) {
				deck.set(x, deck.get(x+1));
			}
			//System.out.print(hand2[hand2maker].printCard());
		}
		System.out.println();
		playedcard=deck.get(0);
		deck.remove(0);
		game(0);
	}
	public static void game(int turn) {
		Scanner scan=new Scanner(System.in);
		// TODO Auto-generated method stub
		if(turn==0) {
			hand1print();
			thecardprint();
			System.out.println("Pick a card to play by selecting the number it appears in in your hand");
			int handcard=scan.nextInt();
			if(hand[handcard].getValue()==playedcard.getValue() || hand[handcard].getColour().equals(playedcard.getColour()) || hand[handcard].getValue()==14 || hand[handcard].getValue()==15) {
				playedcard=hand[handcard];
				remove(hand, handcard);
			}else {
				int drawspace=endfinder(hand);
				hand[drawspace]=deck.get(0);
				deck.remove(0);
				System.out.println("Drew card "+ hand[drawspace].printCard());
				
			}
			game(1);
		}else {
			System.out.println("Pick a card to play by selecting the number it appears in in your hand");
			game(0);
		}
	}
	public static void draw(UnoCards[] handy, int cardsdrawn) {
		for(int y=0; y<handy.length; y++) {
			if(handy[y].equals(null)) {
				for(int x=0; x<cardsdrawn; x++) {
					handy[y+x]=deck.get(0);
					deck.remove(0);
				}
				y=103;
			}
		}

	}
	public static void remove(UnoCards[] hando, int deadcard) {
		int handend=0;
		for(int y=0; y<hando.length; y++) {
			if(hando[y].equals(null)) {
				handend=y;
			}
			y=103;
		}
		hando[deadcard]=null;
		for(int x=deadcard; x<handend; x++) {
			hand[x]=hand[x+1];
		}
	}
	public static int endfinder(UnoCards[] hanb) {
		for(int y=0; y<hanb.length; y++) {
			if(hanb[y].equals(null)) {
				return y;
			}
		}
		return 101;
	}
}
