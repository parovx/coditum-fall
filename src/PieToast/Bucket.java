package PieToast;

public class Bucket {
public String kee;
public int value;
public Bucket(String kee, int value){
	this.kee=kee;
	this.value=value;
}
public String getkee(){
	return kee;
}
public void setkee(String setterofkee){
	kee=(setterofkee);
}
public int getvalue(){
	return value;
}
public void setvalue(int setterofvalue){
	value=(setterofvalue);
}
}
