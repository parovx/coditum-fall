package PieToast;

import java.util.Scanner;

public class Connect4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
boolean playerswap=true;
boolean loop=true;
		int[][] grid = new int[7][7];
		for(int setgrid=0; setgrid<7; setgrid++){
			for(int setgrid2=0; setgrid2<7; setgrid2++){
				grid[setgrid][setgrid2]=1;
			}
		}
		while (loop==true){
			
			
			
			
	Scanner scan=new Scanner(System.in);
		int x=0;
		int y=scan.nextInt();
		if(grid[x][y]==1){
		if(playerswap==true){
		grid[x][y]=0;
		}else{
			grid[x][y]=2;
		}
		}
		playerswap=!playerswap;
		
		for(int m=0; m<7; m++){
				for(int m2=0; m2<7; m2++){
					if(m>0){
						if(grid[m][m2]==1){
							grid[m][m2]=grid[m-1][m2];
							grid[m-1][m2]=1;
						}
					}
				}
				}
		for(int b=0; b<7; b++){
			for(int w=0; w<7; w++){
				if(w>2){
					if(grid[b][w]==0&&grid[b][w-1]==0&&grid[b][w-2]==0&&grid[b][w-3]==0){
						System.out.println("Player x Won!");
						loop=false;
					}
					if(grid[b][w]==2&&grid[b][w-1]==2&&grid[b][w-2]==2&&grid[b][w-3]==2){
						System.out.println("Player o Won!");
						loop=false;
					}
					if(grid[w][b]==2&&grid[w-1][b]==2&&grid[w-2][b]==2&&grid[w-3][b]==2){
						System.out.println("Player o Won!");
						loop=false;
					}
					if(grid[w][b]==0&&grid[w-1][b]==0&&grid[w-2][b]==0&&grid[w-3][b]==0){
						System.out.println("Player x Won!");
						loop=false;
					}
					if(b>2&&grid[w][b]==0&&grid[w-1][b-1]==0&&grid[w-2][b-2]==0&&grid[w-3][b-3]==0){
						System.out.println("Player x Won!");
						loop=false;
					}
					if(b>2&&grid[w][b]==2&&grid[w-1][b-1]==2&&grid[w-2][b-2]==2&&grid[w-3][b-3]==2){
						System.out.println("Player o Won!");
						loop=false;
					}
					if(b<4&&grid[w][b]==2&&grid[w-1][b+1]==2&&grid[w-2][b+2]==2&&grid[w-3][b+3]==2){
						System.out.println("Player o Won!");
						loop=false;
					}
					if(b<4&&grid[w][b]==0&&grid[w-1][b+1]==0&&grid[w-2][b+2]==0&&grid[w-3][b+3]==0){
						System.out.println("Player x Won!");
						loop=false;
					}
				}
			}
		}
		for(int print=0; print<7; print++){
			
			System.out.println("");
			for(int print2=0; print2<7; print2++) {
			if(grid[print][print2]==0){
				System.out.print("x");
			}
			if(grid[print][print2]==1){
				System.out.print("-");
			}
			if(grid[print][print2]==2){
				System.out.print("o");
			}
}
	

}
	}

}
}