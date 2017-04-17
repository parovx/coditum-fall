package PieToast;

import java.util.Random;
import java.util.Scanner;

public class Fight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		Random rand=new Random();
System.out.println("<Chicken Man>: Fight me! Har har haw!");
System.out.println("Attack=1 Defend=2 Heal=3");
int chealth=20;
int health=20;
int dah=rand.nextInt(2);
while(health>0){
int move1=scan.nextInt();
if(move1==1&&dah==1){
	chealth=chealth-5;
	health=health-5;
	System.out.println("Did 5 damage to Chicken Man. Chicken Man did 5 damage to you. Chicken Man's health:"+chealth+". Your health="+health+"");
}else if(move1==1&&dah==1){
	System.out.println("Did 0 damage to Chicken Man. Chicken Man's health:"+chealth+". Your health="+health+"");
}else if(move1==2&&dah==0){
	System.out.println("Chicken Man did 0 damage to you. Chicken Man's health:"+chealth+". Your health="+health+"");
}else if(move1==2&&dah==1){
	System.out.println("Nothing happened. Chicken Man's health:"+chealth+". Your health="+health+"");
}else if(move1==1&&dah==2){
	System.out.println("Did 5 damage to Chicken Man. Chicken Man healed 5 damage. Chicken Man's health:"+chealth+". Your health="+health+"");
}else if(move1==2&&dah==2){
	chealth=chealth+5;
	System.out.println("Chicken Man healed 5 damage. Chicken Man's health:"+chealth+". Your health="+health+"");
}else if(move1==3&&dah==0){
	System.out.println("Healed 5 damage. Chicken Man Did 5 damage to you. Chicken Man's health:"+chealth+". Your health="+health+"");
}else if(move1==3&&dah==1){
	health=health+5;
	System.out.println("Healed 5 damage. Chicken Man's health:"+chealth+". Your health="+health+"");
}else if(move1==3&&dah==2){
	chealth=chealth+5;
	health=health+5;
	System.out.println("Healed 5 damage. Chicken Man Healed 5 damage. Chicken Man's health:"+chealth+". Your health="+health+"");
}
if(chealth==0){
	System.out.println("You win!");
	health=0;
	health=health+5;
}
dah=rand.nextInt(2);
	}
if(chealth==0){
	System.out.println("You both died.");
}else if(health==0){
	System.out.println("You died.");
}else{
	System.out.println("You Win!");
}

}
}
