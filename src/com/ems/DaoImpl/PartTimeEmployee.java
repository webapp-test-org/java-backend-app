package com.ems.DaoImpl;

import com.ems.pojo.Employee;

public class PartTimeEmployee extends Employee {
   Employee emp = new Employee();
    public void calculateSalary() {
    	emp.setBasic(20000.00);
    	emp.setDeducions(2000.00);
    	emp.setSal(emp.getBasic()-emp.getDeducions());
    	System.out.println("Employee Basic amount :"+emp.getBasic());
    	System.out.println("Employee Allowance : "+emp.getAllowance());
    	System.out.println("Employee Deduction : "+emp.getDeducions());
    	System.out.println("_____________________________________");
 	    System.out.println("Employee Salary :"+emp.getSal());
 	   System.out.println("_____________________________________");
    }
}
