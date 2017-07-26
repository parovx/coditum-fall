package PieToast;

import java.util.Random;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		Random rand=new Random();
		boolean boolean1=false;
		while (boolean1==false){
			int int1=scan.nextInt();
			String string1=scan.next();
			int int2=scan.nextInt();
			if (string1.equals("+")){
				int1+=int2;
				System.out.println(int1);
			}else if (string1.equals("-")){
				int1-=int2;
				System.out.println(int1);
			}else if(string1.equals("x")){
				int1*=int2;
				System.out.println(int1);
			}else if(string1.equals("/")){
				int1/=int2;
				System.out.println(int1);
			}else {
				
				String Strange=("Dhjdyh janf eijowmf faoisuni nrjnhga wenjunhoiuewf iuugnfoiaer riuwhgueb!");
				int wudmg = rand.nextInt();
				int wuhhlt=rand.nextInt();
				int wuspe=rand.nextInt();
				String Wuname=("Ugsfu");
				Enemy lalala=new Enemy(wudmg, Wuname, wuspe, wuhhlt );
				System.out.println(lalala.getName()+" says: "+Strange+"!");
			}
		}
	}
}