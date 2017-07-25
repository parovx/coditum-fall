package PieToast;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(fib(0, 1 , 5));
	}
	public  static int fib(int no1, int no2, int steps){
		if (steps==0){
			return no1+no2;
		}else{
			return fib(no2, no1+no2, steps-1);
		}

	}

}
