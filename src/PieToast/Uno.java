package PieToast;

public class Uno {

	public boolean contains(UnoCards[]hee, String colour, int value){
		for(int ee=0; ee<hee.length; ee++){
			
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UnoCards[] hand= new UnoCards[101];
		UnoCards[] aihand= new UnoCards[101];
		UnoCards[] pickupdeck= new UnoCards[94];
		hand[0]=UnoCards.RandomUnoCard();
		for (int cardx=1; cardx<8; cardx++){
			hand[cardx]=UnoCards.RandomUnoCard();
			System.out.println("You");
			System.out.println("Card "+cardx);
			hand[cardx].print();
			System.out.println("________________________________________");
		}
		for (int cardf=0; cardf<94; cardf++){
			pickupdeck[cardf]=UnoCards.RandomUnoCard();
			if(cardf==93){
				System.out.println("Deck Card "+cardf);
				pickupdeck[cardf].print();
		//		if((hand.contains(pickupdeck[cardf].colour) || (hand.contains(pickupdeck(cardf).value))){
					
				}
			}
		}
	}


//}
