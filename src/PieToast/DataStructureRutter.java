package PieToast;

import java.util.ArrayList;

public class DataStructureRutter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arraylist DSR = new Arraylist();
		DSR.add(5);
		DSR.add("O");
		System.out.println(DSR);
		DSR.add(2, "K");
		System.out.println(DSR.get(1));
		DSR.remove("K");
		System.out.println(DSR.get(1));
	}

}
