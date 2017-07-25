package PieToast;
public class Enemytest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Enemy Timmy=new Enemy(10, "Timmy", 50, 20);
	System.out.println(Timmy.getdamage());
	System.out.println(Timmy.gethealth());
	System.out.println(Timmy.getspeed());
	System.out.println(Timmy.getName());
	Timmy.setdamage(30);
	System.out.println(Timmy.getdamage());
	Timmy.setspeed(60);
	System.out.println(Timmy.getspeed());
	Timmy.sethealth(20);
	System.out.println(Timmy.gethealth());
	}

}
