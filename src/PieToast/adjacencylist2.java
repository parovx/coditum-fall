package PieToast;

public class adjacencylist2 {

	public LinkedList<adjacencylist2node>[] lists;
	public adjacencylist2(int size){
		this.lists= new LinkedList [size];
		for(int unnulling=0; unnulling<size; unnulling++){
			lists[unnulling]= new LinkedList<adjacencylist2node>();
		}
	}
	public void print(){
		for(int othersizecounter=0; othersizecounter<lists.length; othersizecounter++) {
			System.out.print(othersizecounter+":  ");
			for(int sizecounter=0; sizecounter<lists[othersizecounter].size(); sizecounter++) {
				System.out.print(lists[othersizecounter].get(sizecounter).getD()+", ");
				//System.out.print(lists[othersizecounter].get(sizecounter).toString());
			}
			System.out.println();
		}
	}
	public void add(int Source, int dest, int cost) throws NullPointerException{
		adjacencylist2node addednode = new adjacencylist2node (dest,cost);
		adjacencylist2node swapnode = new adjacencylist2node(Source, cost);
		try{System.out.println(lists[Source].get(dest).Dest);
		}catch (NullPointerException e){
			
		}
		try {if((lists[Source].get(dest)==addednode)){
			System.out.println("the try f");
			return;
		}else{
			System.out.println("the try e");
			lists[Source].add(addednode);
			lists[dest].add(swapnode);
		}
		}catch(NullPointerException e){
			System.out.println("catch e");
			lists[Source].add(addednode);
			lists[dest].add(swapnode);
		}
		if(Source==dest ||  addednode.getD()==Source || swapnode.getD()==dest || lists[dest].contains(swapnode) || addednode==swapnode){
			System.out.println("the big f");
			return;
		}else{
			System.out.println("the big e");
			lists[Source].add(addednode);
			lists[dest].add(swapnode);
		}
	}
	/*	public int dijkstracalc(int Source, int dest) {
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
	public int getminv(int ){


	}*/
}
