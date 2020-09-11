package practice;

public class Circle {
	
	double radius;
	String color;
	
	Circle(){
		radius = 2.0;
		color ="red";
	}

	public double getRadius() {
		return radius;
	}

	public String getColor() {
		return color;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public void setColor(String color) {
		this.color = color;
	}
	

	public double getArea() {
		
		double area = 0;
		
		radius = radius * radius;
		
		area = Math.PI* radius;
		
		System.out.println("Area of circle:" +area);
		
		return area;
		
		
	}
}
