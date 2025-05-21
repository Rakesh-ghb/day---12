package com.constructor;

public class Rectangle {
	int length;
	int breadth;
	public Rectangle(){
		
	}
	public Rectangle(int l,int b) {
		length=l;
		breadth=b;
		System.out.println("Area of rectangle :"+ length);
		System.out.println("Area of Rectangle :"+ breadth);
	}
	public int area() {
		int res=length*breadth;
		System.out.println("Area of Rectangle:"+ res);
		return res;
	}
public static void main(String[] args) {
	Rectangle rectangle=new Rectangle(30,40);
	rectangle.area();
	
	
}
}
