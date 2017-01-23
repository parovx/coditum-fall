package PieToast;

import java.lang.reflect.Array;

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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cards testcard=new Cards("Justin Bieber's Foot",13);
		testcard.print();
		Cards[] deck=new Cards[3];
			
	}

}
