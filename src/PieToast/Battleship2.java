package PieToast;

import java.util.Scanner;

public class Battleship2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String[][] b=new String[10][10];
		for(int a=0; a<10; a++) {
			for(int c=0; c<10; c++) {
				b[a][c]="-";
			}
		}
		printBoard(b);
		System.out.println("Would you like your ship to be going up and down or left and right?( Press 1 for up and down, press 2 for left and right.)");
		int p1upordown=scan.nextInt();
		System.out.println("Choose the row of the center part of your ship that takes up three spaces.");
		int p1rchoice=scan.nextInt();
		p1rchoice--;
		System.out.println("Choose the column center part of your ship that takes up three spaces.");
		int p1cchoice=scan.nextInt();
		p1cchoice--;
		if(p1upordown==1) {
				b[p1rchoice][p1cchoice]="o";
				b[p1rchoice+1][p1cchoice]="o";
				b[p1rchoice-1][p1cchoice]="o";
			}else if(p1upordown==2) {
				b[p1rchoice][p1cchoice]="o";
				b[p1rchoice][p1cchoice+1]="o";
				b[p1rchoice][p1cchoice-1]="o";
			}else {
				while(1<2) {
					System.out.println("E");
				}
			}
		printBoard(b);
	}
	public static void printBoard(String[][] b) {
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
}
