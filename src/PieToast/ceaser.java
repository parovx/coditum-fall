package PieToast;

import java.util.Scanner;

public class ceaser {
//a=z b=a c=b d=c e=d f=e g=f h=g i=h j=i k=j l=k m=l n=m o=n p=o q=p r=q s=r t=s u=t v=u w=v x=w y=x z=y
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		String input=scan.next();
		String plaintext=input;
		char letter;
		/*String ciphertext="";
		for(int i=0; i<plaintext.length(); i++){
			letter=plaintext.charAt(i);
			ciphertext+="";
			//learn about switch statements
		 System.out.println(ciphertext);*/
		
		//(char) ascii_input
		for(int i=0; i<input.length(); i++) {
			char c = input.charAt(i);
			System.out.println(c);
		}
		
	}
}
//}
