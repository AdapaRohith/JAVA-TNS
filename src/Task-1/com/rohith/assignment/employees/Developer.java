package com.rohith.assignment.employees;

public class Developer extends Employee{
	
	private String programmingLanguage;
	
	public Developer(String name, int employeeId, double salary,
            String programmingLanguage) {
super(name, employeeId, salary);
this.programmingLanguage = programmingLanguage;
}
	
	public String getLanguage() {
		return programmingLanguage;
	}
	public void setLanguage(String programmingLanguage) {
		this.programmingLanguage = programmingLanguage;
	}
	
	public void displayDeveloperInfo() {
        displayEmployeeInfo();
        System.out.println("Programming Language: " + programmingLanguage);
        System.out.println("Company: " + company);
    }

}
