package PieToast;

import java.util.Scanner;

public class Connect2 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Player red, choose your one-word name.");
		String playerrname=scan.next();
		System.out.println("Player yellow, choose your one-word name.");
		String playeryname=scan.next();
		String[][] q=new String[6][7];
		for(int e=0; e<6; e++) {
			for(int r=0; r<7; r++) {
				q[e][r]="-";
			}
		}
		for(int e=0; e<6; e++) {
			for(int r=0; r<7; r++){
				System.out.print(q[e][r]+" ");
			}
			System.out.println("");
		}
		boolean win=false;
		while (win==false) {
			System.out.println(playerrname+" choose a column.");
			int rchoice=scan.nextInt();
			for(int w=5; w>=0; w--) {
				if(q[w][rchoice].equals("-")) {
					q[w][rchoice]="r";
					break;
				}
				if(w==0 && !q[w][rchoice].equals("-")){
					System.out.println("This column is full.");
					boolean full=true;
					while(full==true) {
						System.out.println(playerrname+" choose a column.");
						rchoice=scan.nextInt();
						if(w==0 && !q[w][rchoice].equals("-")){
							System.out.println("This column is full.");
						}else {
							for(int i=5; i>=0; i--) {
								if(q[i][rchoice].equals("-")) {
									q[i][rchoice]="r";
									break;
								}
							}
							full=false;
						}
					}
				}
			}
			for(int e=0; e<6; e++) {
				for(int r=0; r<7; r++){
					System.out.print(q[e][r]+" ");
				}
				System.out.println("");
			}

			System.out.println(playeryname+" choose a column.");
			int ychoice=scan.nextInt();
			for(int w=5; w>=0; w--) {
				if(q[w][ychoice].equals("-")) {
					q[w][ychoice]="y";
					break;
				}
				if(w==0 && !q[w][ychoice].equals("-")){
					System.out.println("This column is full.");
					boolean full=true;
					while(full==true) {
						System.out.println(playeryname+" choose a column.");
						ychoice=scan.nextInt();
						if(w==0 && !q[w][ychoice].equals("-")){
							System.out.println("This column is full.");
						}else {
							for(int i=5; i>=0; i--) {
								if(q[i][ychoice].equals("-")) {
									q[i][ychoice]="y";
									break;
								}
							}
							full=false;
						}
					}
				}
			}
			for(int e=0; e<6; e++) {
				for(int r=0; r<7; r++){
					System.out.print(q[e][r]+" ");
				}
				System.out.println("");
			}
		}
	}
}