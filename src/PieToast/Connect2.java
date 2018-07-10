package PieToast;

import java.util.Scanner;

public class Connect2 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Player red, choose your one-word name.");
		String playerrname=scan.next();
		System.out.println("Player yellow, choose your one-word name.");
		String playeryname=scan.next();
		String[][] q=new String[6][7];
		for(int e=0; e<6; e++) {
			for(int r=0; r<7; r++) {
				q[e][r]="-";
			}
		}
		for(int e=0; e<6; e++) {
			for(int r=0; r<7; r++){
				System.out.print(q[e][r]+" ");
			}
			System.out.println("");
		}
	}
}
