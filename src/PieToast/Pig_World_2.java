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
		System.out.println("Albert Swinestein: You  defeated my two best fighters. It'll be much harder to fight me!");
		System.out.println(name+": They were so easy. it was, like, 3 right questions then you're done! It'll proably be the same fighting you!");
		System.out.println("Albert Swinestein: But I've caught your friend Jimothy. You need to get him back to close the portal. And as you can see, this game has lots of dialogue. You must defeat me by picking to say the right things, not choosing the right actions!");
		System.out.println("1= say 'Give back Jimothy!' 2=say 'Screw You!'");
		int screwz=scan.nextInt();
		if (screwz==2) {
			System.out.println(name+": Screw You!");
			System.out.println("Screws fall from the lab roof. They dig into  Albert Swinestein. ");
			System.out.println("Albert Swinestein: You figured out how this works. You think you can win but you're going down!");
			System.out.println("You go plummeting into the ground with so much force that you dig through it.");
			System.out.println("1=sing 'I believe I can fly!' 2=say 'Screw You!'");
			int hole=scan.nextInt();
			if(hole==2) {
				System.out.println(name+": Screw You!");
				System.out.println("Screws fall from the lab roof. They dig into  Albert Swinestein. One even hits him in the eye. He trips into the hole.");
				System.out.println("Albert Swinestein: Seriously? You did the same thing! Why don't you Just get out of my world! You---");
				System.out.println("1=interrupt and say 'Your World?' 2= say nothing.");
				int erupt=scan.nextInt();
				if(erupt==1) {
					System.out.println(name+": Your World?");
					System.out.println("Yes, Pig World is my world. I created it! The people that sent you here made you think that they created a world that went wrong. They've sent over 50 people here and they all died. But Jimothy managed to  survive. And you barely even know who those people that sent you here are! Let me tell you... They're Pigs! They Somehow managed to escape through the portal and take on human form. They are my most succesful workers. They have led us Pigs to be more superior than humans!");
					System.out.println("1=say 'Humans Are Still More Superior Than Pigs. Get Shrekt.' 2=say 'Screw You.'");
					int sup=scan.nextInt();
					if(sup==1) {
						System.out.println(name+": Humans are still more superior than pigs. Get Shrekt.");
						System.out.println("Shrek comes out of nowhere and kills Albert Swinestein.");
						System.out.println("Now that the leader of the pigs has been defeated, the portal opens and you, Jimothy and Shrek escape. Without their leader, the pigs all die.");
						System.out.println("THE END!");
						System.out.println("Loserboard:");
						System.out.println("1. The_Memer");
						System.out.println("2. The_Memer");
						System.out.println("3. The_Memer");
						System.out.println("Leaderboard");
						System.out.println("1. "+name+"");
						System.out.println("2. Jimothy");
						System.out.println("3. Anybody but The_Memer");
					}else {
						System.out.println(name+": Screw You!");
						System.out.println("Screws fall from the ceiling but Albert Swinestein easily dodges them.");
						System.out.println("Albert Swinestein: Ha! You thought I'd be unprepared for a third screw rain? You should really get a life!");
						System.out.println("You turn into a ghost and can't do anything. Jimothy dies, then Albert Swinestein escapes through the portal and brings all the pigs to Earth. They kill all humans and become more superior than them.");
					}
				}else {
					System.out.println("Albert Swinestein: And blah blah blah blah blah blah blah blah blah. Blah blah, blah, blah?! Blah Blah Blah! Blah blah blah blah blah, blah blah blah blah blah blah blah! Why are you still listening to me? Is this really that important? You know what? You don't have to listen. I'll give you a break.");
					System.out.println("You break into pieces"+name+"= .,.…,,‚¸…");
				}
			}else {
				System.out.println(name+": I belive I can fly...");
				System.out.println("Nothing happens.");
				System.out.println("Albert Swinestein: Idiot! You made yourself believe you could fly, but you can't. You only belive you can. Get Wrecked.");
				System.out.println("A wrecking ball appears from the ceiling and crashes into you. you break. "+name+"=..,.,...");
			}
		}else {
			System.out.println(name+": Give back Jimothy !");
			System.out.println("Albert Swinestein: You think it would be that easy? Idiot. You should go die in a hole.");
			System.out.println("A hole appears in the ground and you fall in. Of course, you die. "+name+"=X.x");
		}
	}else{
		System.out.println("Didn't you pay any attention to the first game! "+Password+" is not the password!");
	}

	}
}
