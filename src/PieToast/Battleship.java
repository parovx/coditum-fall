package PieToast;

import java.util.Random;
import java.util.Scanner;
public class Battleship {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("(^_^)<(Find The Two Twos!)");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("(^_^)<(Pick any two numbers from zero to nine. A zero on the top board will change to a one if it is not a two. It will become a two if it is a two. The two twos will be right next to each other.)");
		int g=0;
		int[][] grid3 = new int[10][10];
		int[][] grid4 = new int[10][10];
		int[][] grid = new int[10][10];
		int[][] grid2 = new int[10][10];
			for(int countup=0; countup<10; countup++){
				for(int countup2=0; countup2<10; countup2++){
					grid[countup][countup2]=0;
							grid[countup][countup2]=0;
			}
				
		}
			Random rand =new Random();
			int a=rand.nextInt(10);
			int b=rand.nextInt(9);
			grid3[0][0]=1;
			grid2[a][b]=1;
			grid2[a][b+1]=1;
			boolean hit=false;
			while(hit==false){
			for(int print=0; print<10; print++){
				System.out.println("");
				for(int print2=0; print2<10; print2++) {
					System.out.print(grid[print][print2]);	
	}
		

}
			System.out.println("");
			System.out.print("----------");
			for(int print=0; print<10; print++){
	System.out.println("");
	for(int print2=0; print2<10; print2++) {
		System.out.print(grid3[print][print2]);	
}


}
			Scanner scan=new Scanner(System.in);
			if (g>1){
				System.out.println("(^_^)<(YOU WIN!)");
			}
			int x=scan.nextInt();
			int y=scan.nextInt();
			if(x==a&&y==b){
				grid[x][y]=2;
				g++;
}
			else if(x==a&&y==b+1){
				grid[x][y]=2;
				g++;
			}
			else{
	grid[x][y]=1;
}
	}
}
	}

