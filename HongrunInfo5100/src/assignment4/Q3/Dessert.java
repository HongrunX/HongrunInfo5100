package assignment4.Q3;

public abstract class Dessert {
	protected final String name;
	public Dessert(String name){
		this.name=name;
	}
	public final String getName(){
		return name;
	}
	public abstract double getCost();
}
