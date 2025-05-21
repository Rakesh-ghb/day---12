package com.constructor;

public class Circle {
	public double radius;
	public Circle() {
		radius=50;
		System.out.println("Radius of the circle :" + radius);
	}
	
	public double getArea() {
	double area=22/7*radius*radius;
	System.out.println("Area of the Circle :" + area);
		return area;
	}
	public double getCircumference() {
		double circumference=2*22/7*radius;
		System.out.println("Circumference of the Circle :" + circumference );
		return  circumference;
	}
	public static void main(String[] args) {
		Circle circle = new Circle();
		circle.getArea();
		circle.getCircumference();
	}
}