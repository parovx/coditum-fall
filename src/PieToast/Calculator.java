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
				int char11=rand.nextInt(26);
				if (char11==1){
					System.out.print("A");
				}else if(char11==2){
					System.out.print("B");
				}else if(char11==3){
					System.out.print("C");
				}else if(char11==4){
					System.out.print("D");
				}else if(char11==5){
					System.out.print("E");
				}else if(char11==6){
					System.out.print("F");
				}else if(char11==7){
					System.out.print("G");
				}else if(char11==8){
					System.out.print("H");
				}else if(char11==9){
					System.out.print("I");
				}else if(char11==10){
					System.out.print("J");
				}else if(char11==11){
					System.out.print("K");
				}else if(char11==12){
					System.out.print("L");
				}else if(char11==13){
					System.out.print("M");
				}else if(char11==14){
					System.out.print("N");
				}else if(char11==15){
					System.out.print("O");
				}else if(char11==16){
					System.out.print("P");
				}else if(char11==17){
					System.out.print("Q");
				}else if(char11==18){
					System.out.print("R");
				}else if(char11==19){
					System.out.print("S");
				}else if(char11==20){
					System.out.print("T");
				}else if(char11==21){
					System.out.print("U");
				}else if(char11==22){
					System.out.print("V");
				}else if(char11==23){
					System.out.print("W");
				}else if(char11==24){
					System.out.print("X");
				}else if(char11==25){
					System.out.print("Y");
				}else{
					System.out.print("Z");
				}
				int char12=rand.nextInt(26);
				if (char12==1){
					System.out.print("a");
				}else if(char12==2){
					System.out.print("b");
				}else if(char12==3){
					System.out.print("c");
				}else if(char12==4){
					System.out.print("d");
				}else if(char12==5){
					System.out.print("e");
				}else if(char12==6){
					System.out.print("f");
				}else if(char12==7){
					System.out.print("g");
				}else if(char12==8){
					System.out.print("h");
				}else if(char12==9){
					System.out.print("i");
				}else if(char12==10){
					System.out.print("j");
				}else if(char12==11){
					System.out.print("k");
				}else if(char12==12){
					System.out.print("l");
				}else if(char12==13){
					System.out.print("m");
				}else if(char12==14){
					System.out.print("n");
				}else if(char12==15){
					System.out.print("o");
				}else if(char12==16){
					System.out.print("p");
				}else if(char12==17){
					System.out.print("q");
				}else if(char12==18){
					System.out.print("r");
				}else if(char12==19){
					System.out.print("s");
				}else if(char12==20){
					System.out.print("t");
				}else if(char12==21){
					System.out.print("u");
				}else if(char12==22){
					System.out.print("v");
				}else if(char12==23){
					System.out.print("w");
				}else if(char12==24){
					System.out.print("x");
				}else if(char12==25){
					System.out.print("y");
				}else{
					System.out.print("z");
				}
				int char13=rand.nextInt(26);
				if (char13==1){
					System.out.print("a");
				}else if(char13==2){
					System.out.print("b");
				}else if(char13==3){
					System.out.print("c");
				}else if(char13==4){
					System.out.print("d");
				}else if(char13==5){
					System.out.print("e");
				}else if(char13==6){
					System.out.print("f");
				}else if(char13==7){
					System.out.print("g");
				}else if(char13==8){
					System.out.print("h");
				}else if(char13==9){
					System.out.print("i");
				}else if(char13==10){
					System.out.print("j");
				}else if(char13==11){
					System.out.print("k");
				}else if(char13==12){
					System.out.print("l");
				}else if(char13==13){
					System.out.print("m");
				}else if(char13==14){
					System.out.print("n");
				}else if(char13==15){
					System.out.print("o");
				}else if(char13==16){
					System.out.print("p");
				}else if(char13==17){
					System.out.print("q");
				}else if(char13==18){
					System.out.print("r");
				}else if(char13==19){
					System.out.print("s");
				}else if(char13==20){
					System.out.print("t");
				}else if(char13==21){
					System.out.print("u");
				}else if(char13==22){
					System.out.print("v");
				}else if(char13==23){
					System.out.print("w");
				}else if(char13==24){
					System.out.print("x");
				}else if(char13==25){
					System.out.print("y");
				}else{
					System.out.print("z");
				}
				int char14=rand.nextInt(26);
				if (char14==1){
					System.out.print("a");
				}else if(char14==2){
					System.out.print("b");
				}else if(char14==3){
					System.out.print("c");
				}else if(char14==4){
					System.out.print("d");
				}else if(char14==5){
					System.out.print("e");
				}else if(char14==6){
					System.out.print("f");
				}else if(char14==7){
					System.out.print("g");
				}else if(char14==8){
					System.out.print("h");
				}else if(char14==9){
					System.out.print("i");
				}else if(char14==10){
					System.out.print("j");
				}else if(char14==11){
					System.out.print("k");
				}else if(char14==12){
					System.out.print("l");
				}else if(char14==13){
					System.out.print("m");
				}else if(char14==14){
					System.out.print("n");
				}else if(char14==15){
					System.out.print("o");
				}else if(char14==16){
					System.out.print("p");
				}else if(char14==17){
					System.out.print("q");
				}else if(char14==18){
					System.out.print("r");
				}else if(char14==19){
					System.out.print("s");
				}else if(char14==20){
					System.out.print("t");
				}else if(char14==21){
					System.out.print("u");
				}else if(char14==22){
					System.out.print("v");
				}else if(char14==23){
					System.out.print("w");
				}else if(char14==24){
					System.out.print("x");
				}else if(char14==25){
					System.out.print("y");
				}else{
					System.out.print("z");
				}
				int char15=rand.nextInt(26);
				if (char15==1){
					System.out.print("a");
				}else if(char15==2){
					System.out.print("b");
				}else if(char15==3){
					System.out.print("c");
				}else if(char15==4){
					System.out.print("d");
				}else if(char15==5){
					System.out.print("e");
				}else if(char15==6){
					System.out.print("f");
				}else if(char15==7){
					System.out.print("g");
				}else if(char15==8){
					System.out.print("h");
				}else if(char15==9){
					System.out.print("i");
				}else if(char15==10){
					System.out.print("j");
				}else if(char15==11){
					System.out.print("k");
				}else if(char15==12){
					System.out.print("l");
				}else if(char15==13){
					System.out.print("m");
				}else if(char15==14){
					System.out.print("n");
				}else if(char15==15){
					System.out.print("o");
				}else if(char15==16){
					System.out.print("p");
				}else if(char15==17){
					System.out.print("q");
				}else if(char15==18){
					System.out.print("r");
				}else if(char15==19){
					System.out.print("s");
				}else if(char15==20){
					System.out.print("t");
				}else if(char15==21){
					System.out.print("u");
				}else if(char15==22){
					System.out.print("v");
				}else if(char15==23){
					System.out.print("w");
				}else if(char15==24){
					System.out.print("x");
				}else if(char15==25){
					System.out.print("y");
				}else{
					System.out.print("z");
				}
					System.out.print(" says ");
			int char1=rand.nextInt(26);
				if (char1==1){
					System.out.print("a");
				}else if(char1==2){
					System.out.print("b");
				}else if(char1==3){
					System.out.print("c");
				}else if(char1==4){
					System.out.print("d");
				}else if(char1==5){
					System.out.print("e");
				}else if(char1==6){
					System.out.print("f");
				}else if(char1==7){
					System.out.print("g");
				}else if(char1==8){
					System.out.print("h");
				}else if(char1==9){
					System.out.print("i");
				}else if(char1==10){
					System.out.print("j");
				}else if(char1==11){
					System.out.print("k");
				}else if(char1==12){
					System.out.print("l");
				}else if(char1==13){
					System.out.print("m");
				}else if(char1==14){
					System.out.print("n");
				}else if(char1==15){
					System.out.print("o");
				}else if(char1==16){
					System.out.print("p");
				}else if(char1==17){
					System.out.print("q");
				}else if(char1==18){
					System.out.print("r");
				}else if(char1==19){
					System.out.print("s");
				}else if(char1==20){
					System.out.print("t");
				}else if(char1==21){
					System.out.print("u");
				}else if(char1==22){
					System.out.print("v");
				}else if(char1==23){
					System.out.print("w");
				}else if(char1==24){
					System.out.print("x");
				}else if(char1==25){
					System.out.print("y");
				}else{
					System.out.print("z");
				}
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
				int char3=rand.nextInt(26);
				if (char2==1){
					System.out.print("a");
				}else if(char3==2){
					System.out.print("b");
				}else if(char3==3){
					System.out.print("c");
				}else if(char3==4){
					System.out.print("d");
				}else if(char3==5){
					System.out.print("e");
				}else if(char3==6){
					System.out.print("f");
				}else if(char3==7){
					System.out.print("g");
				}else if(char3==8){
					System.out.print("h");
				}else if(char3==9){
					System.out.print("i");
				}else if(char3==10){
					System.out.print("j");
				}else if(char3==11){
					System.out.print("k");
				}else if(char3==12){
					System.out.print("l");
				}else if(char3==13){
					System.out.print("m");
				}else if(char3==14){
					System.out.print("n");
				}else if(char3==15){
					System.out.print("o");
				}else if(char3==16){
					System.out.print("p");
				}else if(char3==17){
					System.out.print("q");
				}else if(char3==18){
					System.out.print("r");
				}else if(char3==19){
					System.out.print("s");
				}else if(char3==20){
					System.out.print("t");
				}else if(char3==21){
					System.out.print("u");
				}else if(char3==22){
					System.out.print("v");
				}else if(char3==23){
					System.out.print("w");
				}else if(char3==24){
					System.out.print("x");
				}else if(char3==25){
					System.out.print("y");
				}else{
					System.out.print("z");
				}
				int char4=rand.nextInt(26);
				if (char4==1){
					System.out.print("a");
				}else if(char4==2){
					System.out.print("b");
				}else if(char4==3){
					System.out.print("c");
				}else if(char4==4){
					System.out.print("d");
				}else if(char4==5){
					System.out.print("e");
				}else if(char4==6){
					System.out.print("f");
				}else if(char4==7){
					System.out.print("g");
				}else if(char4==8){
					System.out.print("h");
				}else if(char4==9){
					System.out.print("i");
				}else if(char4==10){
					System.out.print("j");
				}else if(char4==11){
					System.out.print("k");
				}else if(char4==12){
					System.out.print("l");
				}else if(char4==13){
					System.out.print("m");
				}else if(char4==14){
					System.out.print("n");
				}else if(char4==15){
					System.out.print("o");
				}else if(char4==16){
					System.out.print("p");
				}else if(char4==17){
					System.out.print("q");
				}else if(char4==18){
					System.out.print("r");
				}else if(char4==19){
					System.out.print("s");
				}else if(char4==20){
					System.out.print("t");
				}else if(char4==21){
					System.out.print("u");
				}else if(char4==22){
					System.out.print("v");
				}else if(char4==23){
					System.out.print("w");
				}else if(char4==24){
					System.out.print("x");
				}else if(char4==25){
					System.out.print("y");
				}else{
					System.out.print("z");
					}
				System.out.print("!");
				
		}
	}
}
}
