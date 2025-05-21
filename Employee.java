package com.constructor;

public class Employee {
	String name;
	double salary;
	public Employee(String na,double sal) {
		name=na;
		salary=sal;
	}
	
	public void displayDetails() {
		if(salary<0) {
			salary=0;
		}
		System.out.println("Name of the Employee :" + name );
		System.out.println("Salary of the Employee :" +salary);
	}
	public static void main(String[] args) {
		Employee emp = new Employee("Rakesh",100000);
		emp.displayDetails();
		
	}

}
