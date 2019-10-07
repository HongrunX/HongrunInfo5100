package assignment4.Q1;

public class Circle extends Shape{
	private double radius;
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public Circle(double radius){
		this.radius=radius;
	}
	public double getArea() {
		System.out.println(radius*radius*Math.PI);
		return radius*radius*Math.PI;
	}
	public double getPerimeter(){
		System.out.println(2*radius*Math.PI);
		return 2*radius*Math.PI;
	}
	public void draw(){
		System.out.println("Drawing Circle");
	}
	
}
