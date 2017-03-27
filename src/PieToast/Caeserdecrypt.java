package PieToast;

import java.util.Scanner;

public class Caeserdecrypt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		String input=scan.next();
		String plaintext=input;
		String ciphertext="";
		char letter;
		char key=scan.next().charAt(0);
		
		int shift=key-97;
		for(int i=0; i<input.length(); i++) {
			char c = input.charAt(i);
			int nv=c;
			nv-=shift;
			if(nv<97){
			nv+=26;}
			c=(char)nv;
			System.out.print(c);
	}

}
}