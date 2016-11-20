package PieToast;

import java.util.Scanner;

public class Pig_World {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("What is your name?");
		int name=scan.nextInt();
		System.out.println(""+name+", you are entering Pig World. This is very dangerous. You can close this program and do something else. There are many ways you can die. You must make the right decisions to survive. Each pig species is different. Each pig species is dangerous in many different ways. So look out. 3...2...1...0.");
System.out.println("You are on a farm. You are eating a peanut butter and jelly sandwich. Then you hear a noise in your sandwich. Will you cut it open? 1=yes 2=no.");
int sandwich=scan.nextInt();
if (sandwich==1){
	System.out.println("A pig jumps out at you. You only have .1 seconds to grab a weapon. butcher knife=1 rolling pin=2");
	int weapon=scan.nextInt();
	if(weapon==2){
		System.out.println("The pig bangs into the rolling pin. You can attack it. squash it=1 throw it out the window=2");
		int attack=scan.nextInt();
		if (attack==1){
			System.out.println("You roll over the pig with the rolling pin. Now you have a dead pig in the house. throw it out the window=1 just leave it=2");
		}else{
			System.out.println("You pick it up to throw it out the window. Of course, it has rabies and bites you. You go crazy and start living in the wild. People find you an scream, run away, and call the police. They find you and send you off in a space ship. You open up the door and your head explodes.You= ………");
		}
	}else{
		System.out.println("The butcher knife isn't thick enough. The pig easily dodges you, tackles you and surgically removes your arms. You cant really do anything, so you die of thirst 72 hours later. You=(x-x)");
	}
	}else{
System.out.println("A pig is in your sandwich. You eat the pig and it eats you from the inside out. You=(x_X)");
	}
	}
}


