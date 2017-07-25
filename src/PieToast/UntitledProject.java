package PieToast;

public class UntitledProject {
	static boolean toast=true;
	public static int eggs(int w,int x){
{
	if(w==0){
		return 1;
	}else{
		return x*eggs(w-1,x);
	}

}
	}
	public static void main(String args[]){
System.out.println(eggs(3,4));
	}
}
