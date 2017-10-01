package PieToast;
import java.lang.reflect.Array;
import java.util.Random;
public class deckforcardgame {
	public String suit3;
	public int value3;
	public deckforcardgame(String suit4,int value4){
		suit3=suit4;
		value3=value4;
	}
	public void print(){
		if(value3<9){
			System.out.println(value3+2+" of "+suit3);
		}else if(value3==12){
			System.out.println("Ace of "+suit3);
		}else if(value3==9){
			System.out.println("Jack of "+suit3);
		}else if(value3==10){
			System.out.println("Queen of "+suit3);
		}else{
			System.out.println("King of "+suit3);
		}
	}
	public static deckforcardgame Randomdeckforcardgame(){
		Random rand=new Random();
		int randomcard2=rand.nextInt(14);
		int randomsuit=rand.nextInt(3);
		String randomsuit2="";
		if (randomsuit==0){
			randomsuit2="Hearts";
		}else if (randomsuit==1){
			randomsuit2="Spades";
		}else if (randomsuit==2){
			randomsuit2="Diamonds";
		}else{
			randomsuit2="Clubs";
		}
	
	deckforcardgame carda=new deckforcardgame(randomsuit2, randomcard2);
	return carda;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
