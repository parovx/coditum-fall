package PieToast;

import java.io.File;
import java.util.Scanner;

public class maze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  scan=new Scanner(new File("\\Users\\user\\git\\coditum-fall\\src\\PieToast\\themaze"));
		int isthisthemaze[][]=new int[scan.nextInt()][scan.nextInt()];
		String line=scan.nextLine();
		for(int thismightbethemazelength=0; thismightbethemazelength<isthisthemaze.length; thismightbethemazelength++) {
			isthisthemaze[thismightbethemazelength][thismightbethemazelength]=line.charAt(thismightbethemazelength);
		}
	}

}
