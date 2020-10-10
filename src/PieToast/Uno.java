package PieToast;

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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		deck.create();
		deck.shuffle();
		for(int hand1maker=0; hand1maker<7; hand1maker++) {
			hand[hand1maker]=deck.get(0);
			deck.remove(0);
			for(int x=0; x<deck.size()-1; x++) {
				deck.set(x, deck.get(x+1));
			}
			//System.out.print(hand[hand1maker].printCard());
		}
		System.out.println();
		for(int hand2maker=0; hand2maker<7; hand2maker++) {
			hand2[hand2maker]=deck.get(0);
			deck.remove(0);
			for(int x=0; x<deck.size()-1; x++) {
				deck.set(x, deck.get(x+1));
			}
			//System.out.print(hand2[hand2maker].printCard());
		}
		System.out.println();
		game(0);
	}
	public static void game(int turn) {
		// TODO Auto-generated method stub
		if(turn==0) {
			System.out.println("Pick a card to play by selecting the number it appears in in your hand");
			turn=1;
		}else {
			System.out.println("Pick a card to play by selecting the number it appears in in your hand");
			turn=0;
		}
	}
}
