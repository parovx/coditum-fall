package PieToast;

import java.util.Scanner;

public class Pig_World_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Password");
		String Password=scan.next("wearenumber1");
		if(Password!="wearenumber1"){
		System.out.println("What is your name?");
		String name=scan.next();
		System.out.println("A portal opens up in the sky. You go floating up through it. You come out the other end in a giant lab. A 10-foot tall pig in a lab coat walks out. You see the man from the house tied up.");
		System.out.println("Albert Swinestein: Looks like we have another visitor. Would you like to join Jimothy?");
		System.out.println(""+name+": Bring it on!");
		System.out.println("Albert Swinestein: You  defeated my two best workers. It'll be much harder to fight me!");
		System.out.println(name+": They were so easy. it was, like, 3 right questions then you're done! It'll proably be the same fighting you!");
		System.out.println("Albert Swinestein: But I've caught you're friend Jimothy. You need to get him back to close the portal. And as you can see, this game has lots of dialogue. You must defeat me by picking to say the right things, not choosing the right actions!");
		System.out.println("1= say Give back Jimothy! 2=say Screw You!");
		int screwz=scan.nextInt();
		if (screwz==2) {
			System.out.println(name+": Screw You!");
			System.out.println("Screws fall from the lab roof. They dig into  Albert Swinestein. ");
			System.out.println("Albert Swinestein: You figured out how this works. You think you can winbut you're going down!.");
			System.out.println("You go plummeting into the ground with so much force that you dig through it.");
		}else {
			System.out.println(name+": Give back Jimothy !");
			System.out.println("Albert Swinestein: You think it would be that easy? Idiot. You should go die in a hole.");
			System.out.println("A hole appears in the ground and you fall in. Of course, you die.");
		}
	}else{
		System.out.println("Didn't you pay any attention to the first game! "+Password+" is not the password!");
	}

	}
}
