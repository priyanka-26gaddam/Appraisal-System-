package com.model;

public class Employee {

	// TODO Auto-generated constructor stub
	private int empid;
	private String empname;
	private String address;
	private int salary;
	private long mobile;
	private int deptid;
	private int roleid;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int empid, String empname, int salary, long mobile, int deptid, int roleid) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.salary = salary;
		this.mobile = mobile;
		this.deptid = deptid;
		this.roleid = roleid;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public int getDeptid() {
		return deptid;
	}

	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}

	public int getRoleid() {
		return roleid;
	}

	public void setRoleid(int roleid) {
		this.roleid = roleid;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", mobile=" + mobile + ", deptid=" + deptid
				+ ", roleid=" + roleid + "]";
	}
}
