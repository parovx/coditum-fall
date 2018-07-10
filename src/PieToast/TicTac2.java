package PieToast;

import java.util.Scanner;

public class TicTac2 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Player o, choose your one-word name.");
		String playeroname=scan.next();
		System.out.println("Player x, choose your one-word name.");
		String playerxname=scan.next();
		String[][] q=new String[3][3];
		for(int e=0; e<3; e++) {

			for(int r=0; r<3; r++) {
				q[e][r]="-";
			}
		}
		for(int e=0; e<3; e++) {
			for(int r=0; r<3; r++){
				System.out.print(q[e][r]+" ");
			}
			System.out.println("");
		}
		boolean win=false;
		while (win==false) {
			System.out.println(playeroname+" ,choose a row.");
			int playerchoiceor=scan.nextInt();
			System.out.println(playeroname+" ,choose a column.");
			int playerchoiceoc=scan.nextInt();
			q[playerchoiceor][playerchoiceoc]="o";
			for(int e=0; e<3; e++) {
				for(int r=0; r<3; r++){
					System.out.print(q[e][r]+" ");
				}
				System.out.println("");
			}
			System.out.println(playerxname+" ,choose a row.");
			int playerchoicexr=scan.nextInt();
			System.out.println(playerxname+" ,choose a column.");
			int playerchoicexc=scan.nextInt();
			q[playerchoicexr][playerchoicexc]="x";
			for(int e=0; e<3; e++) {
				for(int r=0; r<3; r++){
					System.out.print(q[e][r]+" ");
				}
				System.out.println("");
			}
			for(int f=0; f<3; f++) {
				if(q[0][f].equals("o") && q[1][f].equals("o") && q[2][f].equals("o")) {
					win=true;
					System.out.println(playeroname+" wins!");
				}else if(q[f][0].equals("o") && q[f][1].equals("o") &&q[f][2].equals("o")) {
					win=true;
					System.out.println(playeroname+" wins!");
				}
			}
		}
	}
}