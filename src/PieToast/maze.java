package PieToast;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class maze {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(new File("C:\\Users\\User\\git\\coditum-fall\\coditum-fall\\coditum-fall\\coditum-fall\\src\\PieToast\\themaze"));
		String isthisthemaze[][]=new String[scan.nextInt()][scan.nextInt()];
		String line=scan.nextLine();
		System.out.println(line);
		for(int thismightbethemazelength=0; thismightbethemazelength<(isthisthemaze.length); thismightbethemazelength++) {
			String[] whatifthelinewasanarray = isthisthemaze[thismightbethemazelength];
			line=scan.nextLine();
			for(int turnthelineintobrackets=0; turnthelineintobrackets<(isthisthemaze[0].length); turnthelineintobrackets++) {
				String nottheline=line;
				whatifthelinewasanarray[turnthelineintobrackets]=Character.toString(nottheline.charAt(turnthelineintobrackets));
			}

			isthisthemaze[thismightbethemazelength]=whatifthelinewasanarray;
		}
		printMaze(isthisthemaze);
	}
	public static void printMaze(String[][] isthisthemaze) {
		for(int e=0; e<7; e++) {
			for(int r=0; r<7; r++){
				System.out.print(isthisthemaze[e][r]);
			}
			System.out.println("");
		}
	}
}
