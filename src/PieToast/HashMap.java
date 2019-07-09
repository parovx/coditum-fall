package PieToast;

public class HashMap {
	private Bucket[] map;
	public HashMap(int hmm){
		map=new Bucket[hmm];
	}
	public HashMap(){
		map=new Bucket[4];
	}


	public void adder(String kee, int value){
		int notthevalue=hash(kee);
		if(map[notthevalue]==null) {
			map[notthevalue]=new Bucket(kee, value);
		}else if(map[notthevalue]!=null) {
			while(map[notthevalue]!=null) {
				notthevalue=(notthevalue+1)%map.length;
			}
			map[notthevalue]=new Bucket(kee, value);
		}
	}
	public int getvalue(String kee) {
		int hmmisthisthevalue=hash(kee);
		int thisisnotthevalueitisjusttemporary= hmmisthisthevalue;
		if(kee.equals(map[hmmisthisthevalue].getkee())) {
			return map[hmmisthisthevalue].getvalue();
		}else if(map[hmmisthisthevalue]!=null && !kee.equals(map[hmmisthisthevalue].getkee())){
			while(!kee.equals(map[hmmisthisthevalue].getkee())) {
				hmmisthisthevalue=(hmmisthisthevalue+1)%map.length;	
				if(hmmisthisthevalue==thisisnotthevalueitisjusttemporary) {
					System.out.println("This has no value"); 
					return 0;
				}
			}
			return map[hmmisthisthevalue].getvalue();
		}else {
			System.out.println("This has no value");
			return 0;
		}
	}

	public int hash(String data){ 
		int sum=0;
		for(int a=0; a<data.length(); a++){
			int b=data.charAt(a);
			sum=sum+b;
		}
		return sum%map.length;
	}

}