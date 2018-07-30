package PieToast;
import java.util.Random;
import java.util.Scanner;
public class randomwordgenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand=new Random();
		System.out.println("How many characters long would you like your word to be?");
		Scanner scan= new Scanner(System.in);
		int chars=scan.nextInt();
		int char1=rand.nextInt(26);
		if (char1==1){
			System.out.print("A");
		}else if(char1==2){
			System.out.print("B");
		}else if(char1==3){
			System.out.print("C");
		}else if(char1==4){
			System.out.print("D");
		}else if(char1==5){
			System.out.print("E");
		}else if(char1==6){
			System.out.print("F");
		}else if(char1==7){
			System.out.print("G");
		}else if(char1==8){
			System.out.print("H");
		}else if(char1==9){
			System.out.print("I");
		}else if(char1==10){
			System.out.print("J");
		}else if(char1==11){
			System.out.print("K");
		}else if(char1==12){
			System.out.print("L");
		}else if(char1==13){
			System.out.print("M");
		}else if(char1==14){
			System.out.print("N");
		}else if(char1==15){
			System.out.print("O");
		}else if(char1==16){
			System.out.print("P");
		}else if(char1==17){
			System.out.print("Q");
		}else if(char1==18){
			System.out.print("R");
		}else if(char1==19){
			System.out.print("S");
		}else if(char1==20){
			System.out.print("T");
		}else if(char1==21){
			System.out.print("U");
		}else if(char1==22){
			System.out.print("V");
		}else if(char1==23){
			System.out.print("W");
		}else if(char1==24){
			System.out.print("X");
		}else if(char1==25){
			System.out.print("Y");
		}else{
			System.out.print("Z");
		}
		for(int c=0; c<chars-1; c++) {
			int char2=rand.nextInt(26);
			if (char2==1){
				System.out.print("a");
			}else if(char2==2){
				System.out.print("b");
			}else if(char2==3){
				System.out.print("c");
			}else if(char2==4){
				System.out.print("d");
			}else if(char2==5){
				System.out.print("e");
			}else if(char2==6){
				System.out.print("f");
			}else if(char2==7){
				System.out.print("g");
			}else if(char2==8){
				System.out.print("h");
			}else if(char2==9){
				System.out.print("i");
			}else if(char2==10){
				System.out.print("j");
			}else if(char2==11){
				System.out.print("k");
			}else if(char2==12){
				System.out.print("l");
			}else if(char2==13){
				System.out.print("m");
			}else if(char2==14){
				System.out.print("n");
			}else if(char2==15){
				System.out.print("o");
			}else if(char2==16){
				System.out.print("p");
			}else if(char2==17){
				System.out.print("q");
			}else if(char2==18){
				System.out.print("r");
			}else if(char2==19){
				System.out.print("s");
			}else if(char2==20){
				System.out.print("t");
			}else if(char2==21){
				System.out.print("u");
			}else if(char2==22){
				System.out.print("v");
			}else if(char2==23){
				System.out.print("w");
			}else if(char2==24){
				System.out.print("x");
			}else if(char2==25){
				System.out.print("y");
			}else{
				System.out.print("z");
			}
		}
	}
}


