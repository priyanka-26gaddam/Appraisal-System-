package com.model;

public class Department {
	private int Deptid;
	private String Deptname;
	public Department(int Deptid, String Deptname) {
		super();
		this.Deptid = Deptid;
		this.Deptname = Deptname;
	}
	public int getDeptid() {
		return Deptid;
	}
	public void setDeptid(int Deptid) {
		this.Deptid = Deptid;
	}
	public String getDeptname() {
		return Deptname;
	}
	public void setDeptname(String Deptname) {
		this.Deptname = Deptname;
	}
	@Override
	public String toString() {
		return "Role [Deptid=" + Deptid + ", Deptname=" + Deptname + "]";
	}
	public Department() {
		// TODO Auto-generated constructor stub
	}
	}



