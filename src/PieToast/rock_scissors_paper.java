package PieToast;

import java.util.Random;
import java.util.Scanner;

public class rock_scissors_paper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		boolean wip = false;
		int tries=0;
		while (wip == false) {

			Random rand = new Random();
			System.out.println("Rock=1, Scissors=2, Paper=3.");
			int hello = 1 + (int) (Math.random() * 3);
			int choice = scan.nextInt();
			if (hello == choice) {
				tries++;
				System.out.println("Draw. You Are On Try "+tries+".");
			} else if ((hello==2&&choice==1) || (hello==3&&choice==2) || (hello==1&&choice==3)) {
				tries++;
				System.out.println("You Won On Attempt Number "+tries+".");
				wip = true;
			} else {
				tries++;
				System.out.println("You Did Not Win. You Are On Try "+tries+".");
				
			}

		}
	//	if(int choice==1&&) {
	//		tries++;
		//	System.out.println("You Won On Attempt Number "+tries+".");
	//		wip = true;
	//	}
	}
}
