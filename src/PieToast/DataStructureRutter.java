package PieToast;

import java.util.ArrayList;

public class DataStructureRutter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arraylist DSR = new Arraylist();
		DSR.add(5);
		DSR.add("O");
		DSR.add(DSR);
		DSR.add(null);
		System.out.println(DSR.get(2));
		DSR.add(2, "O");
		System.out.println(DSR.get(2));
	}

}
