package PieToast;

public class Uno {
	static UnoCards[] hand= new UnoCards[101];
	static UnoCards[] hand2= new UnoCards[101];
	static UnoDeck deck=new UnoDeck();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		deck.create();
		deck.shuffle();
		for(int hand1maker=0; hand1maker<7; hand1maker++) {
			hand[hand1maker]=deck.get(0);
			deck.remove(0);
		}
	}
}
