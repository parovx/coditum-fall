package PieToast;

import java.util.Scanner;

public class Pig_World_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Password");
		int Password=scan.nextInt();
		if(Password==728){
		System.out.println("What is your name?");
		String name=scan.next();
		System.out.println("A portal opens up in the sky. You go floating up through it. You come out the other end in a giant lab. A 10-foot tall pig in a lab coat walks out. You see the man from the house tied up.");
		System.out.println("Albert Swinestein: Looks like we have another visitor. Would you like to join Jimothy?");
		System.out.println(""+name+": Bring it on!");
	}else{
		System.out.println("Didn't you pay any attention to the first game! "+Password+" is not the password!");
	}

	}
}
