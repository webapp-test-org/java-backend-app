package com.ems.pojo;

public class Employee {

	private int eid; 
	private double sal = 0;
	private double Basic;
	private double Allowance;
	private double Deducions;
	private String fname;
	private String sname;
	private String address;
	private String pincode;
	
	
	

	

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}





	public Employee(int eid, double sal, String fname, String sname, String address, String pincode) {
		super();
		this.eid = eid;
		this.sal = sal;
		this.fname = fname;
		this.sname = sname;
		this.address = address;
		this.pincode = pincode;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public double getBasic() {
		return Basic;
	}





	public void setBasic(double basic) {
		Basic = basic;
	}





	public double getAllowance() {
		return Allowance;
	}





	public void setAllowance(double allowance) {
		Allowance = allowance;
	}





	public double getDeducions() {
		return Deducions;
	}





	public void setDeducions(double deducions) {
		Deducions = deducions;
	}

	private String realName ;
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public void calculateSalary() {
		sal = Basic+Allowance-Deducions; 
		
	}
	 
}
