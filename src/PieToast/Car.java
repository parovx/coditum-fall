package PieToast;

public class Car {
public String colour;

public float gas;

public void setcolour(String newcolour){
	colour=newcolour;
}

public void drive(int miles){
if(gas>=miles){
	gas=gas-miles;
}
}
public Car(String newcolour, float newgas){
	setcolour(newcolour);
	gas=newgas;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Car quasar=new Car("Green",5);
System.out.println(quasar.colour);
System.out.println(quasar.gas);
quasar.gas=quasar.gas-2;
System.out.println(quasar.gas);
quasar.drive(1);
System.out.println(quasar.gas);
	}

}
