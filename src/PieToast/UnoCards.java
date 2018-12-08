package PieToast;

import java.util.Random;

public class UnoCards {
	public String colour;
	public int value;
	public UnoCards(String coloor, int valoo){
		colour=coloor;
		value=valoo;
	}
	public void print(){
		if(value<10){
			System.out.println(colour+" "+value);
		}else if(value>9 && value<19){
			int temp=value-9;
			System.out.println(colour+" "+temp);
		}else if(value==19){
			System.out.println(colour+" 0");
		}else if(value==20 || value==21){
			System.out.println(colour+" skip turn");
		}else if(value==22 || value==23){
			System.out.println(colour+" reverse");
		}else if(value==24 || value==25){
			System.out.println(colour+" draw two");
		}else if(value==26){
			System.out.println("WILD CARD");
		}else{
			System.out.println("DRAW FOUR");
		}
	}
	public static UnoCards RandomUnoCards(){
		Random rand=new Random();
		int randomcard=rand.nextInt(27);
		int randomcolor=rand.nextInt(3);
		String randomcolor2="";
		if (randomcolor==0){
			randomcolor2="Red";
		}else if (randomcolor==1){
			randomcolor2="Yellow";
		}else if (randomcolor==2){
			randomcolor2="Green";
		}else{
			randomcolor2="Blue";
		}
		UnoCards carda=new UnoCards(randomcolor2, randomcard);
		return carda;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println();
	}

}
