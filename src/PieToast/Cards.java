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
public Cards RandomCard(){
	Random rand=new Random();
	int randomcard=rand.nextInt(13)+1;
	int randomsüt=rand.nextInt(3);
	String randomsüt2="";
	if (randomsüt==0){
		return
	}
	
	Cards card1=new Cards(randomsüt2, randomcard);
	
}
//test
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cards testcard=new Cards("Cheese",13);
		testcard.print();
		Cards[] deck=new Cards[3];
			
	}

}
