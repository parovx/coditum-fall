package PieToast;

import java.lang.reflect.Array;

public class mergesort {
	static int size=8;
	static int[] array = {1, 2, 3, 4};
	public static void main(String[] agrs) {
		split(array);
		print(array);
	}
	public static void split(int[] ouray) {
		int[] lefthalf=new int[size/2];
		int[] righthalf=new int[size/2];
		for(int x=0; x<size/2; x++) {
			lefthalf[x]=ouray[x];
		}
		int y=0;
		for(int z=size/2; z<size; z++) {
			righthalf[y]=ouray[z];
			y++;
		}
		merge(lefthalf, righthalf);
	}
	public static void print(int[] printed) {
		for(int printer=0; printer<printed.length; printer++) {
			System.out.print(printed[printer]+", ");
		}
	}
	public static void merge(int[] thearray, int[] anotherarray) {
		int[] finalmerged=new int[size];
		for(int x=0; x<size/2; x++){
			finalmerged[x]=thearray[x];
		}
		for(int x=0; x<size/2; x++){
			finalmerged[x+size/2]=anotherarray[x];
		}
		for(int x=1; x<size; x++) {
			int y=x-1;
			if(finalmerged[x]<finalmerged[y]) {
				int temp=finalmerged[x];
				finalmerged[x]=finalmerged[y];
				finalmerged[y]=temp;
				y=0;
				x=0;
			}
		}
		array=finalmerged;
		return;
	}
}
