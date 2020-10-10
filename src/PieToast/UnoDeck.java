package PieToast;
import java.util.ArrayList;
import java.util.Random;
public class UnoDeck {
	static ArrayList <UnoCards> deck=new ArrayList();
	public static void create(){
		for(int x=0; x<4; x++) {
			for(int y=0; y<2; y++) {
				for(int z=0; z<13; z++) {
					if(x==0) { 
						UnoCards c=new UnoCards("Red", z);
						deck.add(c);
					}else if(x==1) {
						UnoCards c=new UnoCards("Yellow", z);
						deck.add(c);
					}else if(x==2) {
						UnoCards c=new UnoCards("Green", z);
						deck.add(c);
					}else if(x==3) {
						UnoCards c=new UnoCards("Blue", z);
						deck.add(c);
					}
				}
			}
			UnoCards a=new UnoCards("Wild", 14);
			deck.add(a);
			UnoCards b=new UnoCards("+4", 15);
			deck.add(b);
		}
	}
	public static void shuffle(){
		Random rand=new Random();
		int randUshuffto=rand.nextInt(12345);
		for(int shuffleUno=0; shuffleUno<randUshuffto; shuffleUno++){
			int Ushuff1=(int)(Math.random()*deck.size());
			int Ushuff2=(int)(Math.random()*deck.size());
			UnoCards Utemp1=deck.get(Ushuff1);
			UnoCards Utemp2=deck.get(Ushuff2);
			deck.set(Ushuff1, Utemp2);
			deck.set(Ushuff2, Utemp1);
		}
	}
	public UnoCards get(int i) {
		// TODO Auto-generated method stub
		return deck.get(i);
	}
	public boolean remove(int i) {
		// TODO Auto-generated method stub
		if(indexOf(deck)>=0) {
			remove(indexOf(deck));
			return true;
		}
		return false;
	}
	private int indexOf(ArrayList<UnoCards> deck2) {
		// TODO Auto-generated method stub
		return(deck.indexOf(deck2));
	}
	public int size() {
		// TODO Auto-generated method stub
		return deck.size();
	}
	public UnoCards set(int i, UnoCards e) {
		return(deck.set(i, e));
	}
}