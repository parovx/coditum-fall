package PieToast;



public class WAR {

	public static void main(String[] args)	{
		//54 cards, 2 decks, 27 cards in each deck, 2<3<4<5<6<7<8<9<10<11(jack)<12(queen)<13(king)<1(ace)<14(joker)
		//two empty decks for the cards you/opponent win
		// compare top cards, winner gets both
		//when tied, put down 3 cards. Then take a card from the top. Better one wins all cards on the field

		Cards[] deck= new Cards[27];
		Cards[] deck2= new Cards[27];
		deck[0]=Cards.RandomCard();
		for (int cardx=0; cardx<27; cardx++){
			deck[cardx]=Cards.RandomCard();
			System.out.println("Player 1");
			System.out.println("Card "+cardx);
			deck[cardx].print();
			System.out.println("________________________________________");
			deck2[cardx]=Cards.RandomCard();
			System.out.println("Player 2");
			System.out.println("Card "+cardx);
			deck2[cardx].print();
			System.out.println("________________________________________");
		}
		int player1points=0;
		int player2points=0;
		int top=0;
		int points=1;
		while(top<27){
			if(deck2[top].greaterthan(deck[top])){
				System.out.println("Player 2 (^_^)WINS(^_^) round "+top+"!");
				points=1;
				player2points+=points;
				System.out.println("________________________________________");
				System.out.println("Player 1 has "+player1points+" points!");
				System.out.println("Player 2 has "+player2points+" points!");
				System.out.println("________________________________________");
			}else if(deck[top].greaterthan(deck2[top])){
				System.out.println("Player 1 (^_^)WINS(^_^) round "+top+"!");
				points=1;
				player1points+=points;
				System.out.println("________________________________________");
				System.out.println("Player 1 has "+player1points+" points!");
				System.out.println("Player 2 has "+player2points+" points!");
				System.out.println("________________________________________");
			}else{
				System.out.println("¿(O_O)tie(O_O)?");
				System.out.println("________________________________________");
				points+=3;
				top+=2;
				System.out.println("Player 1 has "+player1points+" points!");
				System.out.println("Player 2 has "+player2points+" points!");
				System.out.println("________________________________________");
			}top++;
		}
		if (player1points>player2points){
			System.out.println("Player 1 (^_^)WINS(^_^) the game!"); 
		}else{
			System.out.println("Player 2 (^_^)WINS(^_^) the game!");
		}

	}
}





