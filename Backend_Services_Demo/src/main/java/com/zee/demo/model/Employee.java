package com.zee.demo.model;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity  // Table in db
public class Employee {

	@Id // Primary key
	private int employeeId;
	private String firstName;
	private double salary;
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	public Employee(int employeeId, String firstName, double salary) {
		//super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.salary = salary;
	}
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", firstName=" + firstName + ", salary=" + salary + "]";
	}
	// getter, setter, constructor, toString

	
}
