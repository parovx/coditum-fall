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
		UnoCards[] hand2= new UnoCards[101];
		int wildcounter=0;
		int plus4counter=0;
		Stack pickupdeck= new Stack();
		LinkedList nodupes0=new LinkedList();
		LinkedList nodupes1=new LinkedList();
		for(int deckmaker=0; deckmaker<94; deckmaker++) {
			UnoCards bongbong=UnoCards.RandomUnoCard();
			if(nodupes0.contains(bongbong) && bongbong.getValue()<26) {
				pickupdeck.add(bongbong);
				nodupes0.add(bongbong);
			}else if(bongbong.getValue()==26 && wildcounter<4) {
				
			}else if(bongbong.getValue()==27 && plus4counter<4) {
				
			}else if(nodupes0.contains(bongbong) && nodupes1.contains(bongbong)) {
				
			}
		}
		UnoCards[] currentcard= new UnoCards[0];
		hand[0]=UnoCards.RandomUnoCard();
		for (int cardx=1; cardx<7; cardx++){
			if(cardx==1) {
				System.out.println("You");
			}
			UnoCards drawingcard=UnoCards.RandomUnoCard();
			for(int containcheck=0; containcheck<pickupdeck.length)
				hand[cardx].print();
					System.out.print(", ");
					if(cardx==(hand.length-1)) {
						System.out.println();
					}
		}
		System.out.println();
	}
}
