package PieToast;

public class Arrays {
	public static void main(String[] args) {
		int[][] x=new int[4][4];
		for(int e=0; e<4; e++) {

			for(int r=0; r<4; r++) {
				x[e][r]=7;
			}
		}
		for(int e=0; e<4; e++) {
			;
			for(int r=0; r<4; r++) {
				x[e][r]=7;
				System.out.println(x[e][r]);
			}
		}

	}
}
