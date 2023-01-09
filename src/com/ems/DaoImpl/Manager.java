package com.ems.DaoImpl;

import com.ems.pojo.Employee;

public class Manager extends Employee {
	private double extraAllowance = 4000;
	Employee emp = new Employee();
	
    public void calculateSalary() {
    	emp.setBasic(50000.00);
    	emp.setAllowance(3000);
    	emp.setDeducions(2000.00);
    	emp.setSal((emp.getBasic()+emp.getAllowance()+extraAllowance)-emp.getDeducions());
    	System.out.println("Employee Basic amount :"+emp.getBasic());
    	System.out.println("Employee Allowance    : "+emp.getAllowance());
    	System.out.println("Employee Extra Allowance : "+extraAllowance);
    	System.out.println("Employee Deduction    : "+emp.getDeducions());
    	System.out.println("_____________________________________");
    	System.out.println("Employee Salary       :"+emp.getSal());
    	System.out.println("_____________________________________");
}
}
