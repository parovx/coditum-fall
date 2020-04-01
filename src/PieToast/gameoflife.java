package PieToast;

import java.util.Scanner;

public class gameoflife {
	static int[][] board=new int[10][10];
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int boardfiller=0; boardfiller<10; boardfiller++) {
			for(int boardfiller1=0; boardfiller1<10; boardfiller1++) {
				board[boardfiller][boardfiller1]=0;
			}
		}
		int game=0;
		int gen=0;
		//placement
		Scanner scan=new Scanner(System.in);
		while(game==0) {
			System.out.println("Enter a cell X coordinate");
			int xcoord=scan.nextInt();
			System.out.println("Enter a cell y coordinate");
			int ycoord=scan.nextInt();
			board[xcoord][ycoord]=1;
			System.out.println("Would you like to add another live cell? (yes or no)");
			String cellyn=scan.next();
			if(cellyn.contentEquals("no")) {
				game=1;
			}else {
				game=0;
			}
			printboard();
		}
	}
	public static void printboard() {
		for(int boardprinter=0; boardprinter<10; boardprinter++) {
			for(int boardprinter1=0; boardprinter1<10; boardprinter1++) {
				System.out.print(board[boardprinter][boardprinter1]);
			}
			System.out.println();
		}
		System.out.println();

	}
	public static void game(int capacity, int gen) {
		if(gen==capacity) {
			return;
		}
		for(int killer=0; killer<10; killer++) {
			for(int killer1=0; killer1<10; killer1++) {
				if(board[killer][killer1]==1) {
					for(int circler=0; circler<)
				}
			}
		}
	}
}
