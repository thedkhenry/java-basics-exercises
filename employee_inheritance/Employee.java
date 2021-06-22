package com.perscholas.java_basics.exercises.employee_inheritance;

public class Employee {
	protected long employeeId;
	protected String employeeName;
	protected String employeeAddress;
	protected long employeePhone;
	protected double basicSalary;
	protected double specialAllowance = 250.80;
	protected double hra = 1000.50;
	
	public Employee(long employeeId, String employeeName, String employeeAddress, long employeePhone) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeAddress = employeeAddress;
		this.employeePhone = employeePhone;
	}
	
	/**
	 * Calculate salary based on basicSalary , specialAllowance , and  hra.
	 */
	public void calculateSalary() {
		double salary = basicSalary + (basicSalary * specialAllowance/100) + (basicSalary * hra/100);
		System.out.println(salary);
	}
	
	/**
	 * Calculate transportAllowance based on 10% of basicSalary.
	 */
	public void calculateTransportAllowance() {
		double transportAllowance = 10.0 / 100.0 * basicSalary;
		System.out.println(transportAllowance);
	}
}