package PieToast;

import java.util.ArrayList;

public class DataStructureRutter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Arraylist DSR = new Arraylist();
		DSR.add(5);
		DSR.add("O");
		System.out.println(DSR);
		DSR.add(2, "K");
		System.out.println(DSR.get(1));
		DSR.remove("K");
		System.out.println(DSR.get(1));
		LinkedList ATU = new LinkedList();
		ATU.add(99);
		ATU.add("E");
		ATU.add(3);
		System.out.println(ATU.get(0));
		System.out.println(ATU.get(1));
		System.out.println(ATU.get(2));
		ATU.add(0, "5");
		System.out.println(ATU.get(0));
		System.out.println(ATU.get(1));
		System.out.println(ATU.get(2));
		System.out.println(ATU.get(3));
		System.out.println(ATU);
		ATU.remove(0);
		System.out.println(ATU);
		System.out.println(ATU.indexOf("E"));*/
		Binary_Bearch_Bree BBB = new Binary_Bearch_Bree();
		System.out.println("a");
		BBB.add(10);
		System.out.println("b");
		BBB.add(11);
		System.out.println("c");
		BBB.add(9);
		System.out.println("d");
		BBB.add(12);
		System.out.println("e");
		BBB.add(9);
		System.out.println("f");
		BBB.remove(10);
		System.out.println("g");
		if(BBB.contains(10)){
			System.out.println("try");
		}else{
			System.out.println("success");
		}
	}

}
