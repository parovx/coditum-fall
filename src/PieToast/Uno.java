package PieToast;

public class Uno {
	static UnoCards[] hand= new UnoCards[101];
	static UnoCards[] hand2= new UnoCards[101];
	public boolean contains(UnoCards[]hee, String colour, int value){
		for(int ee=0; ee<hee.length; ee++){

		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int wildcounter=0;
		int plus4counter=0;
		Stack pickupdeck= new Stack();
		LinkedList nodupes0=new LinkedList();
		LinkedList nodupes1=new LinkedList();
		for(int deckmaker=0; deckmaker<94; deckmaker++) {
			UnoCards bongbong=UnoCards.RandomUnoCard();
			if(!nodupes0.contains(bongbong) && bongbong.getValue()<26) {
				pickupdeck.add(bongbong);
				nodupes0.add(bongbong);
			}else if(bongbong.getValue()==26 && wildcounter<4) {
				pickupdeck.add(bongbong);
				wildcounter=wildcounter+1;
			}else if(bongbong.getValue()==27 && plus4counter<4) {
				pickupdeck.add(bongbong);
				plus4counter=plus4counter+1;
			}else if(nodupes0.contains(bongbong) && !nodupes1.contains(bongbong)) {
				pickupdeck.add(bongbong);
				nodupes1.add(bongbong);
			}else if(nodupes1.contains(bongbong)){
				deckmaker=deckmaker-1;
			}else if(bongbong.getValue()==26 && wildcounter>=4) {
				deckmaker=deckmaker-1;
			}else if(bongbong.getValue()==27 && plus4counter>=4) {
				deckmaker=deckmaker-1;
			}
		}
		for(int handadder=0; handadder<7; handadder++) {
			UnoCards movingcard=(UnoCards) pickupdeck.get();
			hand[handadder]=movingcard;
			pickupdeck.remove();
			printhand();
		}
		for(int hand2adder=0; hand2adder<7; hand2adder++) {
			UnoCards movingcard=(UnoCards) pickupdeck.get();
			hand2[hand2adder]=movingcard;
			pickupdeck.remove();
		}
		System.out.println();
	}
	public static void printhand() {
		int handprint=0;
		while(hand[handprint]!=null) {
			hand[handprint].print();
			System.out.print(", ");
			handprint=handprint+1;
		}
	}
}
