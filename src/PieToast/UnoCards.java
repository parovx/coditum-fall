package PieToast;

public class UnoCards {
	public String colour;
	public int value;
	public UnoCards(String coloor, int valoo){
		colour=coloor;
		value=valoo;
	}

	public int getValue() {
		return value;
	}

	public String getColour() {
		return colour;
	}
	public String printCard() {
		if(value==11) {
			return colour+" Skip Turn";
		}else if(value==12) {
			return colour+" Reverse";
		}else if(value==13) {
			return colour+" +2";
		}else if(value==14) {
			return colour;
		}else if(value==15) {
			return colour;
		}else {
			return colour+" "+value;
		}
	}
}
