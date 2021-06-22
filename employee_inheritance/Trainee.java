package com.perscholas.java_basics.exercises.employee_inheritance;

public class Trainee extends Employee {
	
	public Trainee(long id, String name, String address, long phone, double salary) {
		super(id, name, address, phone);
		super.basicSalary = salary;
	}
}