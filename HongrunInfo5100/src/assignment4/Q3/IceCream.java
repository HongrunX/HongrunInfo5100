package assignment4.Q3;

public class IceCream extends DessertItem {
	private int cost;

	public IceCream(String name, int price) {
		this.name = name;
		this.cost = price;
	}

	public int getCost() {
		return this.cost;
	}

}