package PieToast;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class filereeding {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(new File("\\Users\\user\\git\\coditum-fall\\src\\PieToast\\idliketoreportabruhmoment"));
		while(scan.hasNext()){
			System.out.println(scan.nextLine());
		}
	}

}