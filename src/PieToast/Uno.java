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
			//		bigprint();
			hand1print();
			thecardprint();
			System.out.println("Pick a card to play by selecting the number it appears in in your hand");
			int handcard=scan.nextInt();
			if(hand[handcard].getValue()==playedcard.getValue() || hand[handcard].getColour().equals(playedcard.getColour()) || hand[handcard].getValue()==14 || hand[handcard].getValue()==15) {
				playedcard=hand[handcard];
				remove(hand, handcard);
			}else {
				boolean drawing=true;
				while(drawing==true) {
					int drawspace=endfinder(hand);
					hand[drawspace]=deck.get(0);
					deck.remove(0);
					System.out.println("Drew card "+ hand[drawspace].printCard());
					if(hand[drawspace].getValue()==playedcard.getValue() || hand[drawspace].getColour().equals(playedcard.getColour()) || hand[drawspace].getValue()==14 || hand[drawspace].getValue()==15) {
						System.out.println("Card "+ hand[drawspace].printCard()+" was played");
						playedcard=hand[handcard];
						remove(hand, handcard);
						drawing=false;
					}
				}
			}
			if(playedcard.getValue()==13) {
				hand2[endfinder(hand2)]=deck.get(0);
				deck.remove(0);
				hand2[endfinder(hand2)]=deck.get(0);
				deck.remove(0);
			}
			if(playedcard.getValue()==14) {
				System.out.println("Pick a color to set the wild card to(1 for red, 2 for blue, 3 for green, 4 for yellow)");
				int wild4color=scan.nextInt();
				if(wild4color==1) {
					playedcard.setColour("Red");
				}else if(wild4color==2) {
					playedcard.setColour("Blue");
				}else if(wild4color==3) {
					playedcard.setColour("Green");
				}else {
					playedcard.setColour("Yellow");
				}
			}
			if(playedcard.getValue()==15) {
				hand2[endfinder(hand2)]=deck.get(0);
				deck.remove(0);
				hand2[endfinder(hand2)]=deck.get(0);
				deck.remove(0);
				hand2[endfinder(hand2)]=deck.get(0);
				deck.remove(0);
				hand2[endfinder(hand2)]=deck.get(0);
				deck.remove(0);
				System.out.println("Pick a color to set the wild card to(1 for red, 2 for blue, 3 for green, 4 for yellow)");
				int wild4color=scan.nextInt();
				if(wild4color==1) {
					playedcard.setColour("Red");
				}else if(wild4color==2) {
					playedcard.setColour("Blue");
				}else if(wild4color==3) {
					playedcard.setColour("Green");
				}else {
					playedcard.setColour("Yellow");
				}
			}
			if(playedcard.getValue()==11 || playedcard.getValue()==12) {
				game(0);
			}else {
				game(1);
			}
		}else {
			//	bigprint();
			hand2print();
			thecardprint();
			System.out.println("Pick a card to play by selecting the number it appears in in your hand");
			int handcard=scan.nextInt();
			if(hand2[handcard].getValue()==playedcard.getValue() || hand2[handcard].getColour().equals(playedcard.getColour()) || hand2[handcard].getValue()==14 || hand2[handcard].getValue()==15) {
				playedcard=hand2[handcard];
				remove(hand2, handcard);
			}else {
				boolean drawing=true;
				while(drawing==true) {
					int drawspace=endfinder(hand2);
					hand2[drawspace]=deck.get(0);
					deck.remove(0);
					System.out.println("Drew card "+ hand2[drawspace].printCard());
					if(hand2[drawspace].getValue()==playedcard.getValue() || hand2[drawspace].getColour().equals(playedcard.getColour()) || hand2[drawspace].getValue()==14 || hand2[drawspace].getValue()==15) {
						System.out.println("Card "+ hand2[drawspace].printCard()+" was played");
						playedcard=hand2[drawspace];
						remove(hand2, drawspace);
						drawing=false;
					}
				}
			}
			if(playedcard.getValue()==13) {
				hand[endfinder(hand)]=deck.get(0);
				deck.remove(0);
				hand[endfinder(hand)]=deck.get(0);
				deck.remove(0);
			}
			if(playedcard.getValue()==14) {
				System.out.println("Pick a color to set the wild card to(1 for red, 2 for blue, 3 for green, 4 for yellow)");
				int wild4color=scan.nextInt();
				if(wild4color==1) {
					playedcard.setColour("Red");
				}else if(wild4color==2) {
					playedcard.setColour("Blue");
				}else if(wild4color==3) {
					playedcard.setColour("Green");
				}else {
					playedcard.setColour("Yellow");
				}
			}
			if(playedcard.getValue()==15) {
				hand[endfinder(hand)]=deck.get(0);
				deck.remove(0);
				hand[endfinder(hand)]=deck.get(0);
				deck.remove(0);
				hand[endfinder(hand)]=deck.get(0);
				deck.remove(0);
				hand[endfinder(hand)]=deck.get(0);
				deck.remove(0);
				System.out.println("Pick a color to set the wild card to(1 for red, 2 for blue, 3 for green, 4 for yellow)");
				int wild4color=scan.nextInt();
				if(wild4color==1) {
					playedcard.setColour("Red");
				}else if(wild4color==2) {
					playedcard.setColour("Blue");
				}else if(wild4color==3) {
					playedcard.setColour("Green");
				}else {
					playedcard.setColour("Yellow");
				}
			}
			if(playedcard.getValue()==11 || playedcard.getValue()==12) {
				game(1);
			}else {
				game(0);
			}
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
		hando[deadcard]=null;
		for(int x=deadcard; x<hando.length-1; x++) {
			hando[x]=hando[x+1];
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
