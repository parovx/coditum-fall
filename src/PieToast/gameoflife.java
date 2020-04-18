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
			printboard();
			System.out.println("Would you like to add another live cell? (yes or no)");
			String cellyn=scan.next();
			if(cellyn.contentEquals("no")) {
				game=1;
			}else {
				game=0;
			}

		}
		game(10, 0);
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
		}else{
			int[][] tempboard=new int[10][10];
			for(int boardtotemp1=0; boardtotemp1<10; boardtotemp1++) {
				for(int boardtotemp2=0; boardtotemp2<10; boardtotemp2++) {
					tempboard[boardtotemp1][boardtotemp2]=board[boardtotemp1][boardtotemp2];
				}
			}
			for(int neighborcheck1=0; neighborcheck1<10; neighborcheck1++) {
				for(int neighborcheck2=0; neighborcheck2<10; neighborcheck2++) {
					int neighbors=0;
					for(int circler1=-1; circler1<2; circler1++) {
						for(int circler2=-1; circler2<2; circler2++) {
							if((neighborcheck1+circler1>-1 && neighborcheck1+circler1<10) && (neighborcheck2+circler2>-1 && neighborcheck2+circler2<10) && board[neighborcheck1+circler1][neighborcheck2+circler2]==(1)) {
								neighbors++;
							}
						}
					}
					if(board[neighborcheck1][neighborcheck2]==0) {
						if(neighbors==3) {
							tempboard[neighborcheck1][neighborcheck2]=1;
						}
					}else{
						neighbors--;
						if(neighbors<2 || neighbors>3) {
							tempboard[neighborcheck1][neighborcheck2]=0;
						}
					}

				}
			}
			board=tempboard;
			printboard();
				game(capacity, gen+1);

		}
	}
}
