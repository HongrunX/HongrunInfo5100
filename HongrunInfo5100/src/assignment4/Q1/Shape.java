package assignment4.Q1;

public class Shape {
	private String name;
	private double perimeter;
	private double area;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPerimeter() {
		return perimeter;
	}
	public double getArea() {
		return area;
	}
	public Shape(){
		
	}
	public Shape(double area, double perimeter){
		this.area=area;
		this.perimeter=perimeter;
	}

	public void draw(){
		System.out.println("Drawing Shape");
	}
}
