package PieToast;

import java.util.Scanner;

public class Cipher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your text.");
		String text=scan.next();
		//replace E with your key
		System.out.println(caeserencrypt(text, 'E'));
		//q
	}
	public static String caeserencrypt(String plaintext,char key){
		int shift=key-97;
		String ciphertext="";
		for(int i=0; i<plaintext.length(); i++) {
			char c = plaintext.charAt(i);
			int nv=c;
			nv+=shift;
			if(nv>=122){
				nv-=26;}
			c=(char)nv;
			//System.out.print(c);
			ciphertext+=c;



		}
		return ciphertext;
	}
}
