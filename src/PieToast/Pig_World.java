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
					System.out.println("You jump outside and squash that bull-pig. You go inside to go eat another sandwich but there is no food! go to butcher shop=1 go to Stop&Shop=2");
					int shop=scan.nextInt();
					if(shop==2){
						System.out.println("You go to the cookies and crackers section at Stop&Shop. oreos=1 goldfish=2");
						int foods=scan.nextInt();
						if(foods==1){
							System.out.println("You drive your car home. A zombie pig is blocking the road. throw oreos=1 drive over it=2");
						int zombie=scan.nextInt();
						if (zombie==1){
							System.out.println("You throw that beautiful bag of oreos at the zombie. It hits him in the head and he falls down. You just drive away from him and back to your house. If you didn't remember, you had no food. You die of starvation. "+name+"=(XoX)");
						}else{
							System.out.println("You drive over him like a pickle. You go home and eat some oreos and go to sleep. You wake up in the morning and your house explodes. build a new one=1 go live in some other person's house=2");
						int boomedhouse=scan.nextInt();
						if(boomedhouse==2){
							System.out.println("You see an Earthling driving in a car. You drive after him and go in his house. You are tired. sleep in closet=1 sleep in bed=2");
							int sleepplace=scan.nextInt();
							if(sleepplace==1){
								System.out.println("You go to sleep in his closet. A plutonium atomic bomb drops somewhere.");
								System.out.println("You wake up in the morning. There is something grabbing you. It gets tighter. It is strangling you. hit it with a knife=1 hit it with a spoon=2");
								int killcoat=scan.nextInt();
								if(killcoat==1){
									System.out.println("You stab the thing. It falls down. You open the door and throw it out. It was a coat pig. You want to take over this house. kill the owner=1 kindly ask him=2");
									int takehouse=scan.nextInt();
									if(takehouse==1){
										System.out.println("You kill the owner of the house. throw body out the window=1 do nothing=2");
										int getridman=scan.nextInt();
									}
								}
							}else{
								System.out.println("You run into the mans bed. He finds you there when he needs to go to sleep. He throws you out the window like a spoon and you go flying 100,000,000,000,000,000,000,000,000,000 miles and you hit the ground so hard that you die. "+name+"=(X0X)");
							}
						}else{
							System.out.println("You drive your car to Home Depot. Construction pigs drop giant planks of wood on you and kill you. "+name+"=(x.X)");
						}
						}
						}else{
							System.out.println("You drive your car home. A zombie pig is blocking the road. throw goldfish=1 drive over it=2");
						int zombie2=scan.nextInt();
						if(zombie2==1){
							System.out.println("You throw that beautiful bag of goldfish at the zombie. It hits him in the head and he falls down. You just drive away from him and back to your house. If you didn't remember, you had no food. You die of starvation. "+name+"=(XoX)");
						}else{
							System.out.println("You run him over like a pickle. You drive home and open up your goldfish. Apparently Pepperidge Farms had a problem and accidentally made sharks. Your tongue gets cut on he sharp teeth and pig-viruses get into your tongue and make it swell up so badly that it breaks your house and blocks out your whole face and you can't breathe and die. "+name+"=(OoO)");
						}
						}
			
					}else{
						System.out.println("Of course, the butcher shop has been taken over by rebellious man-eating pigs. You get butchered and sold to some old man-eating pig with a big head. You get eaten. "+name+"=***");
					}
				}else if(bullpig==1){
					System.out.println("You start to make a fire but you don't have enough time. The bull-pig runs over you. "+name+"=(Ω-X)");
			}else{
				System.out.println("The bull-pig is right next to you. He turns and runs over you. He remembers he didn't have breakfast, so he puts syrup on you and eats you. "+name+"=*˜*˜*");
			}
				}else{
			System.out.println("You unsafely leave the dead pig in your house. Then giant carnivorous pigsects start eating it. They get hungrier and eat you. "+name+"=***");
			}
			}else{
				System.out.println("You pick it up to throw it out the window. Of course, it has rabies and bites you. You go crazy and start living in the wild. Other people that have entered Pig World find you and scream, run away, and call the police. They find you and send you off in a space ship. You open up the door and your head explodes."+name+"= ………");
			}
			}else{
				System.out.println("The butcher knife isn't thick enough. The pig easily dodges you, tackles you and surgically removes your arms. You can't really do anything, so you die of thirst 72 hours later. "+name+"=(x-x)");
				
			
		}
	
	}else{
		System.out.println("A pig is in your sandwich. You eat the pig and it eats you from the inside out. "+name+"=***");
		
	}
	}


	}

	



