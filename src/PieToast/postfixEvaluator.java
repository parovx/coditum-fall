package PieToast;

import java.util.Scanner;

public class postfixEvaluator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		System.out.println("Put in a number");
		int iiii=scan.nextInt();
		System.out.println("Put in a number");
		int oooo=scan.nextInt();
		System.out.println("Put in an operator(+, -, *, /)");
		String pppp=scan.next();
		if(!(pppp.equals("+") || pppp.equals("-") || pppp.equals("*") || pppp.equals("/"))){
			ree.main(new String[0]);
		}
		
	}

}
