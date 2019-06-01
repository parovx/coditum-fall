package PieToast;

public class HashMap {
	private Bucket map[];
	public HashMap(int hmm){
		map=new Bucket[hmm];
	}
	public HashMap(){
		map=new Bucket[4];
	}
	/*public boolean torf(String value){
		int check= hash(value);
		Bucket tempBucket=map[check];
		while(tempBucket!=null&&!(tempBucket.getkee()==(hash(value)))){

		}
	}*/

	public void adder(String ake, String duckit){
		String first="a";
		String second="b";
		String third="c";
		String fourth="d";
		if(ake.equals(1)){
			duckit=first;
		}else if(ake.equals(2)){
			duckit=second;
		}else if(ake.equals(3)){
			duckit=third;
		}else{
			duckit=fourth;
		}
		//map [1]=;
	}

	public int hash(String data){
		int sum=0;
		for(int a=0; a<data.length(); a++){
			int b=data.charAt(a);
			sum=sum+b;
		}
		return sum/Integer.MAX_VALUE;
	}

}