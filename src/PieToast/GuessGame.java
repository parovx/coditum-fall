package PieToast;

import java.util.Random;
import java.util.Scanner;

public class GuessGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int guesses=0;
		System.out.println("GUESS A NUMBER BETWEEN ONE AND FIFTY!");		
Random rand=new Random();
Scanner scan= new Scanner(System.in);
int wap=rand.nextInt(50);
boolean wip=false;
while(wip==false){
	int wop=scan.nextInt();
	guesses++;
	if(wop==wap){
		System.out.println("YOU WIN ON ATTEMPT NUMBER "+guesses+"!");
		wip=true;
	}
	if(wop<wap){
		System.out.println("TOO LOW!");
	}
	if(wop>wap){
		System.out.println("TOO HIGH!");
	}
	}

}
}