package com.ems.DaoImpl;

import com.ems.pojo.Employee;

public class FullTimeEmployee extends Employee {
	 Employee emp = new Employee();
	    public void calculateSalary() {
	    	emp.setBasic(35000.00);
	    	emp.setAllowance(1500);
	    	emp.setDeducions(2000.00);
	    	 emp.setSal((emp.getBasic()+emp.getAllowance())-emp.getDeducions());
	    	
	    	System.out.println("Employee Basic amount :"+emp.getBasic());
	    	System.out.println("Employee Allowance : "+emp.getAllowance());
	    	System.out.println("Employee Deduction : "+emp.getDeducions());
	    	System.out.println("_____________________________________");
	    	System.out.println("Employee Salary :"+emp.getSal());
	    	System.out.println("_____________________________________");
}
}
