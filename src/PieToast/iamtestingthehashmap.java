package PieToast;

import java.util.Scanner;

public class iamtestingthehashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String> map=new HashMap<String>();
		map.adder("Pepe", "5664 Crawfordsville Rd, Speedway, IN, 46224");
		map.adder("Sal", "Egg Lake, Oregon");
		map.adder("Minecraft Steve", "1 Bass Pro Drive, Memphis, Tennessee");
		map.adder("Sans", "Pee Pee Island, Newfoundland And Labrador, Canada");
		map.adder("Joe", "Joe is not real. The only place he lives is inside your mind.");
		map.adder("Danny DeVito M&M", "14301 Capitol Dr, Tampa, FL 33613");
		Scanner scan= new Scanner(System.in);
		while(1<2) {
			System.out.println("Would you like to see an address or add a new one? Press 1 to see, or 2 to add.");
			String thescanforwhatyouwanttodo=scan.nextLine();
			if (thescanforwhatyouwanttodo.equals("1")) {
				System.out.println("Whose address would you like to see?");
				String theaddress=scan.nextLine();
				System.out.println(map.getvalue(theaddress));
			}else if(thescanforwhatyouwanttodo.equals("2")) {
				System.out.println("Add a name");
				String thenamethatwetake=scan.nextLine();
				System.out.println("Add an address");
				String theaddressthatwetake=scan.nextLine();
				map.adder(thenamethatwetake, theaddressthatwetake);
			}
		}
	}
}