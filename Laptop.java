package com.constructor;

public class Laptop {
	String brand;
	int ramSize;
	public Laptop(String brand,int ram) {
		brand = brand;
		ramSize = ram;
		
	}
	public Laptop() {
		brand="hp victus";
		ramSize=16;
	}
	public void showSpecs() {
		System.out.println("Laptop brand is:"+brand);
		System.out.println("Laptop ramSize is:"+ramSize);
	}
public static void main() {
	Laptop lap=new Laptop();
	lap.showSpecs();
	Laptop lap1=new Laptop();
	lap1.showSpecs();
}
}
