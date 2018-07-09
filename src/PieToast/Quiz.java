package PieToast;

import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int score=0;
		System.out.println("How do you spell hello?");
		String answer1=scan.nextLine();
		if(answer1.equals("hello")) {
			System.out.println("Yes.");
			score++;
		}else{
System.out.println("No.");
		}
	}

}
