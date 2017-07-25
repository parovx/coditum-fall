package PieToast;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(factorial1(5));
	}
	public static int factorial1(int y){
		if (y==1){
			return 1;
		}else{
			return y*factorial1(y-1);
		}

	}
}
