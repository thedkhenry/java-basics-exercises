package com.perscholas.java_basics.exercises.employee_inheritance;

public class Manager extends Employee{
	
	public Manager(long id, String name, String address, long phone, double salary) {
		super(id, name, address, phone);
		super.basicSalary = salary;
	}
	
	/**
	 * Override Employee class calculateTransportAllowance method.
	 * Calculate transportAllowance based on 15% of basicSalary.
	 */
	public void calculateTransportAllowance() {
		double transportAllowance = 15.0 / 100.0 * basicSalary;
		System.out.println(transportAllowance);
	}
}
