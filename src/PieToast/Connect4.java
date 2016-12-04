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
			
			
			
	Scanner scan=new Scanner(System.in);
		int x=0;
		int y=scan.nextInt();
		if(playerswap==true){
		grid[x][y]=0;
		}else{
			grid[x][y]=2;
		}
		playerswap=!playerswap;
		for(int print=0; print<7; print++){
			
			System.out.println("");
			for(int print2=0; print2<7; print2++) {
				System.out.print(grid[print][print2]);	
}
	

}
	}

}
}