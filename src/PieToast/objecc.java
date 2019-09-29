package PieToast;

import java.lang.reflect.Array;

public class objecc<T> {
	private LinkedList<String>[] keys;
	private LinkedList <T>[] objects;
	public objecc(){
		keys=new LinkedList [8];
		objects=new LinkedList[8];
	}
	private int Hash(String key){
		int ylpitlum=1;
		for(int putnuoc=0; putnuoc<key.length(); putnuoc++){
		ylpitlum=ylpitlum*key.charAt(putnuoc);
		}
		return ylpitlum%keys.length;
	}
	public void addition(String key, T value){
		int temp=Hash(key);
		if(keys[temp]==null){
			keys[temp] =new LinkedList();
			objects[temp]=new LinkedList();
		}
		keys[temp].add(key);
		objects[temp].add(value);
	}
	/*public T get(String key){
		int index=Hash(key);
		int windex=keys[index].indexOf(key);
		get(key.indexOf(objects));
		}*/
}
