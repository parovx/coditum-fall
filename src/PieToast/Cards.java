package PieToast;

import java.lang.reflect.Array;
import java.util.Random;

public class Cards {
public String süt;
//ace=1 jack=11 queen=12 king=13
public int value;

public Cards(String suit,int valyü){
	süt=suit;
	value=valyü;
}
// ace=1 jack=11 queen=12 king=13
public void print(){
if(value>1&&value<11){
	System.out.println(value+" of "+süt);
	}else if(value==1){
		System.out.println("Ace of "+süt);
}else if(value==11){
	System.out.println("Jack of "+süt);
}else if(value==12){
	System.out.println("Queen of "+süt);
}else{
	System.out.println("King of "+süt);
}
}
//Hearts=0 Spades=1 Diamonds=2 Clubs=3
public static Cards RandomCard(){
	Random rand=new Random();
	int randomcard=rand.nextInt(13)+1;
	int randomsüt=rand.nextInt(3);
	String randomsüt2="";
	if (randomsüt==0){
		randomsüt2="Hearts";
	}else if (randomsüt==1){
		randomsüt2="Spades";
	}else if (randomsüt==2){
		randomsüt2="Diamonds";
	}else{
		randomsüt2="Clubs";
	}
	
	Cards card1=new Cards(randomsüt2, randomcard);
	
	return card1;
}
//test
	public static void main(String[] args) {
		Cards card2=new Cards("hello",13);
		Cards card1=new Cards("hello",139889);
		System.out.print(card1.greaterthan(card2));
	}
	public boolean greaterthan(Cards othercard){
		return this.value>othercard.value;
	}

}
