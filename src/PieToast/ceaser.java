package PieToast;

import java.util.Scanner;

public class ceaser {
	//٩(^‿^)۶
	//Asetgttq i
//a=z b=a c=b d=c e=d f=e g=f h=g i=h j=i k=j l=k m=l n=m o=n p=o q=p r=q s=r t=s u=t v=u w=v x=w y=x z=y
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
			nv+=shift;
			if(nv>=122){
			nv-=26;}
			c=(char)nv;
			System.out.print(c);
			
		}
		
	}
}

