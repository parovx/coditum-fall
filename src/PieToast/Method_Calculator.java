package PieToast;

import java.util.Scanner;

public class Method_Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int x=scan.nextInt();
		int y=scan.nextInt();
		System.out.println(f(x,y));
		System.out.println(g(x,y));
		System.out.println(e(x,y));
		System.out.println(h(x,y));
	}
	public static int e(int p,int q){
		return p*q;
	}
	public static int f(int p,int q){
		return p+q;
}
	public static int g(int p,int q){
	return p-q;
}
	public static int h(int p,int q){
		return p/q;

}
}
