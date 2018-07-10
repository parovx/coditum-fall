package PieToast;

public class forloop {
	public static void main(String[] args) {
		for(int i=5; i>0; i--) {
			System.out.print("");
			for(int o=0; o<i; o++) {
				System.out.print(" ");
				
			}
			for(int s=0; s<6-i; s++) {
			System.out.print("* ");
		}
			System.out.println(" ");
		
		
		}
		for(int p=0; p<5; p++) {
			System.out.print("");
			for(int a=0; a<p+1; a++) {
				System.out.print(" ");
				
			}
			for( int f=0; f<4-p; f++) {
			System.out.print(" *");
		}
			System.out.println(" ");
		}
	}
}
