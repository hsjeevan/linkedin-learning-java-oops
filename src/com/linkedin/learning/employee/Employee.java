package com.linkedin.learning.employee;

public class Employee {
	String name;
	int age;
	double salary;
	LocationType location;
	
	public Employee(String name, int age, double salary, LocationType location) {
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.location = location;
	}
	
	void raiseSalary() {
		this.salary = this.salary + (this.salary*10/100);
	}
	
}
