package PieToast;

import java.util.Scanner;

public class Pig_World {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("What is your name?");
		String name=scan.next();
		System.out.println(""+name+", you are entering Pig World. This is very dangerous. You can close this program and do something else. There are many ways you can die. You must make the right decisions to survive. Each pig species is different. Each pig species is dangerous in many different ways. So look out. 3...2...1...0. WEEEEEEEEEEEEEOOOOOOOWWWWW!");
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
			int getrid=scan.nextInt();
			if (getrid==1){
				System.out.println("You throw it out the window. Unfortunately, it hits a bull-pig. The bull-pig starts to charge at you. set up a fire right in front of you=1 sledgehammer=2 step to the side=3");
				int bullpig=scan.nextInt();
				if (bullpig==2){
					System.out.println("You jump outside and squash that bull-pig. You go inside to go eat another sandwich but there is no food! go to butcher shop=1 go to Stop and Shop=2");
				}else if(bullpig==1){
					System.out.println("You start to make a fire but you don't have enough time. The bull-pig runs over you. "+name+"=(Ω-X)");
			}else{
				System.out.println("The bull-pig is right next to you.");
			}
				}else{
			System.out.println("You unsafely leave the dead pig in your house. Then carnivorous pigsects start eating it. They get hungrier and eat you. "+name+"=");
			}
			}
			}else{
				System.out.println("The butcher knife isn't thick enough. The pig easily dodges you, tackles you and surgically removes your arms. You can't really do anything, so you die of thirst 72 hours later. "+name+"=(x-x)");System.out.println("You pick it up to throw it out the window. Of course, it has rabies and bites you. You go crazy and start living in the wild. People find you and scream, run away, and call the police. They find you and send you off in a space ship. You open up the door and your head explodes."+name+"= ………");
			
		}
	}else{
		System.out.println("A pig is in your sandwich. You eat the pig and it eats you from the inside out. "+name+"=");
		
	}
	}


	}

	



