package assignment4.Q1;

public class Square extends Shape{
	private double side;
	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	public Square(double side) {
		this.side=side;
	}
	public double getArea() {
		System.out.println(side*side);
		return side*side;
	}
	public double getPerimeter(){
		System.out.println(4*side);
		return 4*side;
	}
	public void draw(){
		System.out.println("Drawing Square");
	}
	
}
