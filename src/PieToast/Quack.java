package PieToast;

import java.util.Scanner;

public class Quack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("HI. MY NAME IS PASQUALE!");
System.out.println("I am in 5th grade at Hindley in Darien.");
int quack=7;
Scanner scan= new Scanner(System.in);
String moo=scan.next();
if (quack==7){
	System.out.println("Who are you?");
	String hi=scan.next();
	if (hi=="Pasquale"){
	System.out.println("QUACK!!!");
	}else{
		System.out.println(""+hi+" Is watching the output");
		String baa=scan.next();
		String meow=scan.next();
		System.out.println(""+moo+""+hi+""+baa+""+meow+" Is Your name");
	}
}
	}

}
