package PieToast;

import java.lang.reflect.Array;

public class mergesort {
	static int size=5;
	static int[] array = {1, 2, 3, 4, 5, 6};
	public static void main(String[] agrs) {
		split();
	}
	public static void split() {
		int split=size;
		int splitcounter=0;
		while(split!=2 || split!=1) {
			split=split/2;
			splitcounter++;
		}
		int[][] temparray=new int[size][];
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
		merge(temparray);
	}
	public static void print(int[] printed) {
		for(int printer=0; printer<printed.length; printer++) {
			System.out.print(printed[printer]+", ");
		}
	}
	public static int merge(int[][] thearray) {
		int[] finalmerged=new int[size];
		for(int x=0; x<size; x++) {
			finalmerged[x]=thearray[x];
		}
	}
}
