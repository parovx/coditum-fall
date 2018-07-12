package PieToast;

import java.util.Scanner;

public class Battleship2 {
	static String[][] b = new String[10][10];
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int a=0; a<10; a++) {
			for(int c=0; c<10; c++) {
				b[a][c]="-";
			}
		}
		printBoard();
		placeShips(2);
		printBoard();
		placeShips(3);
		printBoard();
		placeShips(3);
		printBoard();
		placeShips(4);
		printBoard();
		placeShips(5);
		printBoard();
	}
	public static void printBoard() {
		System.out.println("   1 2 3 4 5 6 7 8 9 10");
		for(int x=0; x<10; x++){
			if(x==9) {
				System.out.print(x+1+" ");
			}else {
				System.out.print(x+1+"  ");
			}

			for (int z=0; z<10; z++) {
				System.out.print(b[x][z]+" ");
			}
			System.out.println();
		}
	}
	public static void placeShips(int I){
		System.out.println("Would you like your ship that takes up "+I+" spaces to be going up and down or left and right?( Press 1 for up and down, press 2 for left and right.)");
		int p1upordown=scan.nextInt();
		System.out.println("Choose the row of the upmost (if you chose up and down) or the furthest left (if you chose left and right) part of your ship that takes up "+I+" spaces.");
		int p1rchoice=scan.nextInt();
		p1rchoice--;
		System.out.println("Choose the column of the upmost (if you chose up and down) or the furthest left (if you chose left and right) part of your ship that takes up "+I+" spaces.");
		int p1cchoice=scan.nextInt();
		p1cchoice--;
		for(int y=0; )
		for(int t=0; t<I; t++) {
			if(p1upordown==1) {
				b[p1rchoice+t][p1cchoice]="o";
			}else if(p1upordown==2) {
				b[p1rchoice][p1cchoice+t]="o";
			}else {
				while(1<2) {
					for (int EEEE=0; EEEE<99; EEEE++){
						System.out.print("E");
					}
					for (int EEEE=0; EEEE<99; EEEE++){
						System.out.print("E");
						if (EEEE==1 || EEEE== 2 || EEEE==4 || EEEE==8  ||  EEEE==10 || EEEE==16 ||  EEEE==20 || EEEE==32 || EEEE==40 ||  EEEE==50 ||  EEEE==60 || EEEE==70 ||  EEEE==70 ||  EEEE==80 ||  EEEE==90 ||  EEEE==91 ||  EEEE==92 ||  EEEE==93 ||  EEEE==94 ||  EEEE==95 ||  EEEE==96 ||  EEEE==97 ||  EEEE==98 ||  EEEE==99) {
							System.out.println();
						}
					}
					for (int WDITY=0; WDITY<3; WDITY++) {
						System.out.println("WHAT DID I TELL YOU?");
					}
				}
			}
		}
	}
}
