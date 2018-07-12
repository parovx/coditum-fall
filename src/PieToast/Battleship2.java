package PieToast;

import java.util.Scanner;

public class Battleship2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] b=new String[10][10];
		for(int a=0; a<10; a++) {
			for(int c=0; c<10; c++) {
				b[a][c]="-";
			}
		}
		printBoard(b);
		System.out.println("Choose the row of the center of your ship that takes up three spaces.");
		Scanner scan=new Scanner(System.in);
		int player1rowchoice=scan.nextInt();
		System.out.println("Choose the column of the center of your ship that takes up three spaces.");
		int player1columnchoice=scan.nextInt();
		System.out.println("Would you like your ship to be going up or down?( Press 1 for up, press 2 for down.)");
		b[player1rowchoice][player1columnchoice]="o";
		b[player1rowchoice+1][player1columnchoice]="o";
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
