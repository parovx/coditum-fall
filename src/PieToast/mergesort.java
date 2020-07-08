package PieToast;

import java.lang.reflect.Array;

public class mergesort {
	static int size=4;
	static int[] array = {1, 2, 3, 4};
	public static void main(String[] agrs) {
		merge(array, );
	}
	public static void split() {
		int split=size;
		int splitcounter=0;
		int[]righthalf=new int[size];
		while(split>2) {
			split=split/2;
		}
		int[]smallarray=new int[split];
		for(int addtotemp=0; addtotemp<split; addtotemp++) {		
			smallarray[addtotemp]=array[addtotemp];
		}
		if(smallarray[0]>smallarray[1]) {
			int templeft=smallarray[0];
			smallarray[0]=smallarray[1];
			smallarray[1]=templeft;
		}
		merge(smallarray, righthalf);
	}
	public static void print(int[] printed) {
		for(int printer=0; printer<printed.length; printer++) {
			System.out.print(printed[printer]+", ");
		}
	}
	public static void merge(int[] thearray, int[] anotherarray) {
		int[] finalmerged=new int[size];
			
		array=finalmerged;
		return;
	}
}
