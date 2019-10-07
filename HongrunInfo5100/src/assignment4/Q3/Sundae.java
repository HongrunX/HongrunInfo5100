package assignment4.Q3;

public class Sundae extends IceCream {

	public Sundae(String iceCreamName, int iceCreamPrice, String name, int price) {
		super(name + "Sundae with\n" + iceCreamName, iceCreamPrice + price);
	}

	public int getCost() {
		return Math.round(super.getCost());
	}

}