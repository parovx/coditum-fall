package PieToast;

import java.util.ArrayList;
import java.util.LinkedList;

public class adjacencylist2 {

	public LinkedList<adjacencylist2node>[] lists;
	public adjacencylist2(int size){
		this.lists= new LinkedList[size];
		for(int unnulling=0; unnulling<size; unnulling++){
			lists[unnulling]= new LinkedList<adjacencylist2node>();
		}
	}

	public void add(int Source, int dest, int cost){
		adjacencylist2node addednode = new adjacencylist2node (1,1);
		lists[Source].add(addednode);
	}
	public int dijkstracalc(int Source, int dest) {
		boolean[] checkingboolean= new boolean[lists.length];
		int[] distances=new int [lists.length];

		for(int chek=0; chek<lists.length; chek++) {
			distances[chek]=Integer.MAX_VALUE-1;		
			checkingboolean[chek]=false;
		}

		public int getminimumnode(int)

		distances[Source]=0;
		while(checkingboolean[dest]==false){
			for(int sheccloop1=0; sheccloop1<5; sheccloop1++) {
				int minvertex=getminimumvertex(checkingboolean, distances);
				checkingboolean[minvertex]=true;
				for(int sheccloop2=0; sheccloop2<5; sheccloop2++) {
					System.out.print(minvertex+" ");
					System.out.println(sheccloop2+" ");
					if(adjacencylist2[minvertex][sheccloop2]>0) {
						if(checkingboolean[sheccloop2]==false) {
							int newminimum=distances[minvertex]+adjacencylist2[minvertex][sheccloop2];
							if(distances[sheccloop2]>newminimum) {
								System.out.print(minvertex+" ");
								System.out.print(sheccloop2+" ");
								System.out.println(adjacencyarray[minvertex][sheccloop2]);
								distances[sheccloop2]=newminimum;

								System.out.println();
							}
						}
					}

				}
			}
		}
		return distances[length-1];
	}
	public int getminv(int)
		
	}
}
