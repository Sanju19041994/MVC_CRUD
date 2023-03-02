package com.bIT.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int eid;
	
	private String ename;
	
	private String eusername;
	
	private String euserpass;
	
	private String edept;
	
	private double epackage;

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEusername() {
		return eusername;
	}

	public void setEusername(String eusername) {
		this.eusername = eusername;
	}

	public String getEuserpass() {
		return euserpass;
	}

	public void setEuserpass(String euserpass) {
		this.euserpass = euserpass;
	}

	public String getEdept() {
		return edept;
	}

	public void setEdept(String edept) {
		this.edept = edept;
	}

	public double getEpackage() {
		return epackage;
	}

	public void setEpackage(double epackage) {
		this.epackage = epackage;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int eid, String ename, String eusername, String euserpass, String edept, double epackage) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.eusername = eusername;
		this.euserpass = euserpass;
		this.edept = edept;
		this.epackage = epackage;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", eusername=" + eusername + ", euserpass=" + euserpass
				+ ", edept=" + edept + ", epackage=" + epackage + "]";
	}

	
}
