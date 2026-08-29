package com.rohith.assignment.employees;

public class Manager extends Employee {
	
	private int teamSize;
	
	public Manager(String name,int employeeId,double salary,int teamSize) {
		super(name,employeeId,salary);
		this.teamSize = teamSize;
	}
	   public int getTeamSize() {
	        return teamSize;
	    }
	   public void setTeamSize(int teamSize) {
		   this.teamSize = teamSize;
	   }
	   public void displayManagerInfo() {
	        displayEmployeeInfo();
	        System.out.println("Team Size: " + teamSize);
	        System.out.println("Company: " + company);
	    }
	   

	
}
