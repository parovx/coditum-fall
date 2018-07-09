package PieToast;

import java.util.Scanner;

public class madlibs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Give me a verb ending in 'ing'.");
		String verb1=scan.nextLine();
		System.out.println("Give me a noun.");
		String noun1=scan.nextLine();
		System.out.println("Give me an adjective.");
		String adj1=scan.nextLine();
		System.out.println("Give me an adverb.");
		String adv1=scan.nextLine();
		System.out.println("Give me an adjective.");
		String adj2=scan.nextLine();
		System.out.println("Give me a noun.");
		String noun2=scan.nextLine();
		System.out.println("Give me a noun.");
		String noun3=scan.nextLine();
		System.out.println("Give me a noun.");
		String noun4=scan.nextLine();
		System.out.println("I was "+verb1+" this morning. A/An "+noun1+" fell on my "+adj1+" "+noun2+". 'Ow!' I "+adv1+" said. 'Hey, "+adj2+" "+noun3+"! Get over here you "+noun4+"!'I said to the "+noun1+".");
	}

}
