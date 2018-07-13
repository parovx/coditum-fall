package PieToast;

import java.util.Random;
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
		int p1upordown=0;
		int p1rchoice=0;
		int p1cchoice=0;
		boolean taken=true;
		while(taken==true) {
			taken=false;
			System.out.println("Would you like your ship that takes up "+I+" spaces to be going up and down or left and right?( Press 1 for up and down, press 2 for left and right.)");
			p1upordown=scan.nextInt();
			System.out.println("Choose the row of the upmost (if you chose up and down) or the furthest left (if you chose left and right) part of your ship that takes up "+I+" spaces.");
			p1rchoice=scan.nextInt();
			p1rchoice--;
			System.out.println("Choose the column of the upmost (if you chose up and down) or the furthest left (if you chose left and right) part of your ship that takes up "+I+" spaces.");
			p1cchoice=scan.nextInt();
			p1cchoice--;
			for(int y=0; y<I; y++) {
				if(p1upordown==1) {
					if(!b[p1rchoice+y][p1cchoice].equals("-")) {
						System.out.println("That space is taken.");	
						taken=true;
						break;
					}
				}else if(p1upordown==2) {
					if(!b[p1rchoice][p1cchoice+y].equals("-")) {
						System.out.println("That space is taken.");	
						taken=true;
						break;
					}
				}
			}
		}
		for(int t=0; t<I; t++) {
			if(p1upordown==1) {
				b[p1rchoice+t][p1cchoice]="o";
			}else if(p1upordown==2) {
				b[p1rchoice][p1cchoice+t]="o";
			}else {
				while(1<2) {
					for(int E=0; E<9999; E++) {
						for (int EEEE=0; EEEE<9999; EEEE++){
							Random rand=new Random();
							int char1=rand.nextInt(26);
							if (char1==1){
								int caps=rand.nextInt();
								if (caps==1) {
								System.out.print("A");
							}else if(char1==2){
								System.out.print("B");
							}else if(char1==3){
								System.out.print("C");
							}else if(char1==4){
								System.out.print("D");
							}else if(char1==5){
								System.out.print("E");
							}else if(char1==6){
								System.out.print("F");
							}else if(char1==7){
								System.out.print("G");
							}else if(char1==8){
								System.out.print("H");
							}else if(char1==9){
								System.out.print("I");
							}else if(char1==10){
								System.out.print("J");
							}else if(char1==11){
								System.out.print("K");
							}else if(char1==12){
								System.out.print("L");
							}else if(char1==13){
								System.out.print("M");
							}else if(char1==14){
								System.out.print("N");
							}else if(char1==15){
								System.out.print("O");
							}else if(char1==16){
								System.out.print("P");
							}else if(char1==17){
								System.out.print("Q");
							}else if(char1==18){
								System.out.print("R");
							}else if(char1==19){
								System.out.print("S");
							}else if(char1==20){
								System.out.print("T");
							}else if(char1==21){
								System.out.print("U");
							}else if(char1==22){
								System.out.print("V");
							}else if(char1==23){
								System.out.print("W");
							}else if(char1==24){
								System.out.print("X");
							}else if(char1==25){
								System.out.print("Y");
							}else{
								System.out.print("Z");
							}
							}else {
								int char2=rand.nextInt(26);
								if (char2==1){
									System.out.print("a");
								}else if(char2==2){
									System.out.print("b");
								}else if(char2==3){
									System.out.print("c");
								}else if(char2==4){
									System.out.print("d");
								}else if(char2==5){
									System.out.print("e");
								}else if(char2==6){
									System.out.print("f");
								}else if(char2==7){
									System.out.print("g");
								}else if(char2==8){
									System.out.print("h");
								}else if(char2==9){
									System.out.print("i");
								}else if(char2==10){
									System.out.print("j");
								}else if(char2==11){
									System.out.print("k");
								}else if(char2==12){
									System.out.print("l");
								}else if(char2==13){
									System.out.print("m");
								}else if(char2==14){
									System.out.print("n");
								}else if(char2==15){
									System.out.print("o");
								}else if(char2==16){
									System.out.print("p");
								}else if(char2==17){
									System.out.print("q");
								}else if(char2==18){
									System.out.print("r");
								}else if(char2==19){
									System.out.print("s");
								}else if(char2==20){
									System.out.print("t");
								}else if(char2==21){
									System.out.print("u");
								}else if(char2==22){
									System.out.print("v");
								}else if(char2==23){
									System.out.print("w");
								}else if(char2==24){
									System.out.print("x");
								}else if(char2==25){
									System.out.print("y");
								}else{
									System.out.print("z");
								}
							}
						}
						System.out.println();
					}
					System.out.println("WHAT DID I TELL YOU?");
				}
			}
		}
	}
}
