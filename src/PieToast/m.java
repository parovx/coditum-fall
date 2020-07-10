package PieToast;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class m {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.out.println("Don't talk to me about Minecraft");
		Scanner scan=new Scanner(System.in);
		String mm=scan.next();
		if(mm.equals("minecraft")){
			Scanner scan1=new Scanner(new File("/Users/coditum/git/coditum-fall/src/PieToast/tfarcenim"));
			while(scan1.hasNext()){
				System.out.println(scan1.nextLine());
			}
			
		}else{
			System.out.println("okay");
		}

	}

}
