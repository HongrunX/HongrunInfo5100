package assignment4.Q1;

public class Rectangle extends Shape{
	private double width;
	private double height;
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public Rectangle(double width, double height) {
		this.width=width;
		this.height=height;
	}
	public double getArea() {
		System.out.println(width*height);
		return width*height;
	}
	public double getPerimeter(){
		System.out.println(2*(width*height));
		return 2*(width*height);
	}
	public void draw(){
		System.out.println("Drawing Rectange");
	}
	
}
