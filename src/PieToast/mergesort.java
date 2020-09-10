package PieToast;

import java.lang.reflect.Array;

public class mergesort {
	static int[] array = {5, 2, 7, 4, 8, 3};
	public static void main(String[] agrs) {
		split(array);
		print(array);
	}
	public static int[] split(int[] ouray) {
		int[] lefthalf=new int[ouray.length/2];
		int[] righthalf=new int[ouray.length/2];
		for(int x=0; x<ouray.length/2; x++) {
			lefthalf[x]=ouray[x];
		}
		int y=0;
		for(int z=ouray.length/2; z<ouray.length; z++) {
			righthalf[y]=ouray[z];
			y++;
		}
		return merge(lefthalf, righthalf);
	}
	public static void print(int[] printed) {
		for(int printer=0; printer<printed.length; printer++) {
			System.out.print(printed[printer]+", ");
		}
	}
	public static int[] merge(int[] thearray, int[] anotherarray) {
		int[] finalmerged=new int[array.length];
		for(int x=0; x<thearray.length/2+1; x++){
			finalmerged[x]=thearray[x];
		}
		for(int x=0; x<anotherarray.length/2+1; x++){
			finalmerged[x+anotherarray.length/2+1]=anotherarray[x];
		}
		for(int x=1; x<array.length; x++) {
			int y=x-1;
			if(finalmerged[x]<finalmerged[y]) {
				int temp=finalmerged[x];
				finalmerged[x]=finalmerged[y];
				finalmerged[y]=temp;
				y=0;
				x=0;
			}
		}
		return finalmerged;
	}
	public static boolean oddoreven() {
		for(int x=0; x<1073741823; x++) {
			if(0+(2*x)==array.length){
				return true;
			}
		}
		return false;
			
	}
}
