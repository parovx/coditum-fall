package PieToast;

public class Stakk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack kcatS= new Stack();
		for(int kcountuP=0; kcountuP<10; kcountuP++){
			kcatS.add(kcountuP);
		}
		for(int kcountdowNremov=0; kcountdowNremov<10; kcountdowNremov++){
			System.out.println(kcatS.get());
			kcatS.remove();
		}
	}

}
