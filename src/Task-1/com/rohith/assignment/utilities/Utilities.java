package com.rohith.assignment.utilities;

import com.rohith.assignment.employees.Developer;
import com.rohith.assignment.employees.Employee;
import com.rohith.assignment.employees.Manager;



public class Utilities {
	
	public void displayEmployee(Employee employee) {
		employee.displayEmployeeInfo();
	}
	 public void displayManager(Manager manager) {
	        manager.displayManagerInfo();
    }
	 public void displayDeveloper(Developer developer) {
		 developer.displayDeveloperInfo();
	 }
	 public void increaseSalary(Employee employee, double percentage) {
	        double newSalary = employee.getSalary()
	                + (employee.getSalary() * percentage / 100);

	        employee.setSalary(newSalary);

	        System.out.println("Updated Salary: " + employee.getSalary());
	    }
	
}
