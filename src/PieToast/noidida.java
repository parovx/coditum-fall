package PieToast;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class noidida {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(new File("/Users/coditum/git/coditum-fall/src/PieToast/addition"));
		int scanint=0;
		while(scan.hasNext()){
			scanint=scanint+Integer.parseInt(scan.nextLine());
		}
		System.out.print(scanint);
	}

}
