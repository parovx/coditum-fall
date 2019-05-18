package PieToast;

public class HashMap {
	private Bucket map[];
	public HashMap(int hmm){
		map=new Bucket[hmm];
	}
	public HashMap(){
		map=new Bucket[4];
	}
	public boolean torf(String value){
		int check= hash(value);
		Bucket tempBucket=map[check];
		while(tempBucket!=null&&!(tempBucket.getkee()==(hash(value)))){
			
		}
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