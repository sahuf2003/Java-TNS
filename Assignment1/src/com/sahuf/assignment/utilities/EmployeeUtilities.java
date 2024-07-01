package com.sahuf.assignment.utilities;
import com.sahuf.assignment.employees.*;
public class EmployeeUtilities {
//	Created a getinfo method to display the data of the Employee
	
	public static void getinfo(Employee employee) {
		System.out.println("Name:" + employee.getName());
		System.out.println("EmployeeID:" + employee.getEmployeeid());
		System.out.println("Salary: "+employee.getSalary());
		
	}
	
// Created the getRoleInfo method to get the role of the manager 
	public static void getRoleInfo(Manager manager) {
		System.out.println("Role:" + manager.getRole());
	}
// Created the getRoleInfo method to get the role of the developer 
	public static void getRoleInfo(Developer developer) {
		System.out.println("Role:" + developer.getRole());

	}
// Created a method to give the bonus to the employee for the good work
	public static void Bonus(Employee employee) {
		int salaryWithBonus = employee.getSalary() + 10000;
		System.out.println("Congratulations " + employee.getName()+ "You are getting the bonus Your salary for this month is " +salaryWithBonus );
		employee.setSalary(salaryWithBonus);
	}
}
