package com.ems.Client;

import java.util.Scanner;

import com.ems.DaoImpl.FullTimeEmployee;
import com.ems.DaoImpl.Manager;
import com.ems.DaoImpl.NightShiftEmployee;
import com.ems.DaoImpl.PartTimeEmployee;
import com.ems.pojo.Employee;

public class EmployeeClient {
	static Employee emp = new Employee();
	static PartTimeEmployee ptm = new PartTimeEmployee();
	static FullTimeEmployee ftm = new FullTimeEmployee();
	static NightShiftEmployee nsm = new NightShiftEmployee();
	static Manager m = new Manager();
	static Scanner scan = new Scanner(System.in);
	 public static void employeeDetails() 
{
		 System.out.println("Enter Employee id");
		 emp.setEid(scan.nextInt());
		 System.out.println("Enter Employee salary as 0");
		 emp.setSal(scan.nextDouble());
		 System.out.println("Enter Employee first name");
		 emp.setFname(scan.next());
		 System.out.println("Enter Employee Second name");
		 emp.setSname(scan.next());
		 System.out.println("Enter Employee Address");
		 emp.setAddress(scan.next());
		 System.out.println("Enter Employee pincode");
		 emp.setPincode(scan.next());
		 emp.setRealName(emp.getFname()+emp.getSname());
	 }
	 
	 public  static void display() {
		 System.out.println("Employee id : "+emp.getEid());  
		 System.out.println("Employee RealName : "+emp.getRealName());
		 System.out.println("Employee Address : "+emp.getAddress());
		 System.out.println("Employee pincode : "+emp.getPincode());
	 }

	public static void main(String[] args) {
		
		while(true) {
		System.out.println("=============================================");
		System.out.println("Enter which type of Employee you Are........?");
		System.out.println("1)PartTimeEmployee...........................");
		System.out.println("2)FullTimeEmployee...........................");
		System.out.println("3)NightShiftEmployee.........................");
		System.out.println("4)Manager....................................");
		System.out.println("5)Exit.......................................");
		System.out.println("=============================================");
		int choice = scan.nextInt();
		switch(choice) {
		case 1: employeeDetails();
		display();
		ptm.calculateSalary();
		break;
		case 2: employeeDetails();
		display();
		ftm.calculateSalary();
		break;
		case 3: employeeDetails();
		display();
		nsm.calculateSalary();
		break;
		case 4: employeeDetails();
	 display();
		m.calculateSalary();
		break;
		case 5: System.out.println("Thank you for using App!.....");
		break;
		default:System.out.println("Choose 1 to 5 only");
		} // end of switch
	}// end of while
	}

	}
