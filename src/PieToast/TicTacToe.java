package PieToast;

import java.util.Scanner;

public class TicTacToe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter name below.");
		String name=scan.nextLine();
		System.out.println("Enter name below.");
		String name2=scan.nextLine();
		System.out.println(""+name+" Select a place.");
		int[][] grid = new int[3][3];
		boolean player = true;
		boolean winornot =false;
		for (int int1 = 0; int1 < 3; int1++) {
			for (int int4 = 0; int4 < 3; int4++) {
				grid[int1][int4] = 2;
			}
		}
			while (winornot==false){
		if (player==true) System.out.println(""+name+" Select a place.");
		else System.out.println(""+name2+" Select a place.");
		System.out.print("Select a row:");
		int row=scan.nextInt();
		System.out.print("Select a column:");
		int col=scan.nextInt();
		if(player==true){ grid[row][col]=1;}
		if(player==false){ grid[row][col]=0;
		}
		for (int int2 = 0; int2 < 3; int2++) {
		
				for (int int3 = 0; int3 < 3; int3++) {
					
					if(grid[int2][int3]==0)
						System.out.print("O");
					else if(grid[int2][int3]==1)
					System.out.print("X");
					else
						System.out.print("  |");
				}

				System.out.println();
				System.out.println("--------");
		}
		/*if (grid[0][0]==1&& grid[1][0]==1&&grid[2][0]==1
			||grid[0][1]==1&&grid[1][1]==1&&grid[2][1]==1)*/
			
		player=!player;
	}
}
	}