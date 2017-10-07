package PieToast;

import java.util.Random;

public class Card {
	public String sout;
	//2=0 3=1 4=2 5=3 6=4 7=5 8=6 9=7 10=8 jack=9 queen=10 king=11 ace=12 joker=13
	public int vallou;

	public Card(String suit,int valyou){
		sout=suit;
		vallou=valyou;
	}
	// ace=12 jack=9 queen=10 king=11 joker=13
	public void print(){
	if(vallou<9){
		System.out.println(vallou+2+" of "+sout);
		}else if(vallou==12){
			System.out.println("Ace of "+sout);
	}else if(vallou==9){
		System.out.println("Jack of "+sout);
	}else if(vallou==10){
		System.out.println("Queen of "+sout);
	}else{
		System.out.println("King of "+sout);
	}
	}
	//Hearts=0 Spades=1 Diamonds=2 Clubs=3
	public static Cards RandomCard(){
		Random rand=new Random();
		int randomcard=rand.nextInt(13);
		int randomsut=rand.nextInt(3);
		String randomsut2="";
		if (randomsut==0){
			randomsut2="Hearts";
		}else if (randomsut==1){
			randomsut2="Spades";
		}else if (randomsut==2){
			randomsut2="Diamonds";
		}else{
			randomsut2="Clubs";
		}
		
		Cards card1=new Cards(randomsut2, randomcard);
		
		return card1;
	}
	//test
		public static void main(String[] args) {
			Cards card2=new Cards("hello",138778);
			Cards card1=new Cards("hello",189778);
			System.out.print(card1.greaterthan(card2));
		}
		public boolean greaterthan(Cards othercard){
			return this.vallou>=othercard.value;
		}
}
