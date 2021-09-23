package com.model;

public class Appraisal {
	private String appraisaldate;
	private String currentrole;
	private String newrole;
	private int empid;
	
	public Appraisal(String appraisaldate, String currentrole, String newrole, int empid) {
		super();
		this.appraisaldate = appraisaldate;
		this.currentrole = currentrole;
		this.newrole = newrole;
		this.empid = empid;
		
	}
	
	public Appraisal() {
		// TODO Auto-generated constructor stub
	}

	public String getAppraisaldate1() {
		return appraisaldate;
	}

	public void setAppraisaldate(String appraisaldate) {
		this.appraisaldate = appraisaldate;
	}

	public String getCurrentrole() {
		return currentrole;
	}

	public void setCurrentrole(String currentrole) {
		this.currentrole = currentrole;
	}

	public String getNewrole() {
		return newrole;
	}

	public void setNewrole(String newrole) {
		this.newrole = newrole;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	@Override
	public String toString() {
		return "Appraisal [appraisaldate=" + appraisaldate + ", currentrole=" + currentrole + ", newrole=" + newrole
				+ ", empid=" + empid + "]";
	}

	public String getAppraisaldate() {
		// TODO Auto-generated method stub
		return null;
	}

	

}


