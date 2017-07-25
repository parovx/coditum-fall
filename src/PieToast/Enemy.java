package PieToast;

public class Enemy {
	private String Name;
	private int health;
	private int speed;
	private int damage;
	public Enemy(int h, String n, int s, int d){
		health=h;
		Name=n;
		speed=s;
		damage=d;
	}
	public int gethealth(){
		return health;
	}
	public int getspeed(){
		return speed;
	}
	public int getdamage(){
		return damage;
	}
	public String getName(){
		return Name;
	}
	public void sethealth(int h){
		health=h;
	}
	public void setspeed(int s){
		speed=s;
	}
	public void setdamage(int d){
		damage=d;
	}
	public void setName(String n){
		Name=n;
	}
}
