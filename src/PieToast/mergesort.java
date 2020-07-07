package PieToast;

import java.lang.reflect.Array;

public class mergesort {
	static int size=5;
	static int[] array=new int[size];
	public static void main(String[] agrs) {

	}
	public static int[] split() {
		int split=size;
		int splitcounter=0;
		while(split!=2 || split!=1) {
			split=split/2;
			splitcounter++;
		}
		Arraylist[] temparray=new Arraylist[size];
		int[] smallarray=new int[split];
		for(int middletemp=0; middletemp<splitcounter; middletemp++) {
			for(int addtotemp=0; addtotemp<split; addtotemp++) {		
				smallarray[addtotemp]=array[addtotemp];	
			}
			if(smallarray[0]>smallarray[1]) {
				int templeft=smallarray[0];
				smallarray[0]=smallarray[1];
				smallarray[1]=templeft;
			}
			temparray[middletemp]=smallarray;
		}
	}
	public static int merge() {

	}
}
