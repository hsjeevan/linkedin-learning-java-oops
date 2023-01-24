package com.linkedin.learning.employee;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee Jeevan = new Employee("Jeevan", 25, 1000.0,LocationType.Bengaluru);
		Employee Alex = new Employee("Alex", 29, 10000.0,LocationType.LosAngeles);
		System.out.println(Jeevan.location);
		Jeevan.raiseSalary();
		Alex.raiseSalary();
		System.out.println(Alex.salary);
	}

}
