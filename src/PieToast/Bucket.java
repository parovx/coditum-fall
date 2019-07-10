package PieToast;

public class Bucket<T> {
public String kee;
public T value;
public Bucket(String kee, T value){
	this.kee=kee;
	this.value=value;
}
public String getkee(){
	return kee;
}
public void setkee(String setterofkee){
	kee=(setterofkee);
}
public T getvalue(){
	return value;
}
public void setvalue(T setterofvalue){
	value=(setterofvalue);
}
}
