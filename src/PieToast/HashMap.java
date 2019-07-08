package PieToast;

public class HashMap {
	private Bucket[] map;
	public HashMap(int hmm){
		map=new Bucket[hmm];
	}
	public HashMap(){
		map=new Bucket[4];
	}
	public boolean torf(String value){
		int check= hash(value);
		Bucket tempBucket=map[check];
		while(tempBucket!=null&&!(tempBucket.getkee().equals(hash(value)))){
			
		}
	}

	public void adder(String kee, int value){
		int notthevalue=hash(kee);
		String kee2="person";
		int value2=hash(kee2);
		new Bucket(kee2, value2);
		String kee3="name";
		int value3 = hash(kee3);
		new Bucket(kee3, value3);
		String kee4="entity";
		int value4 = hash(kee4);
		new Bucket(kee4, value4);
		String kee5="title";
		int value5 = hash(kee5);
		new Bucket(kee5, value5);
	}
		

	public int hash(String data){ 
		int sum=0;
		for(int a=0; a<data.length(); a++){
			int b=data.charAt(a);
			sum=sum+b;
					}
		return sum;
	}

}