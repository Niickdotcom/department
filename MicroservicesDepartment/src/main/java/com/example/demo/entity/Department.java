package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="department")
public class Department {
	
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="dept_id")
	private Integer depid;
	
	@Column(name="dept_name")
	private String deptname;
	
	@Column(name="dept_address")
	private String deptaddress;
	
	@Column(name="dept_code")
	private String deptcode; 
	
	
	
	
	public Department() {
		
	}

	public Integer getDepid() {
		return depid;
	}

	public void setDepid(Integer depid) {
		this.depid = depid;
	}

	public String getDeptname() {
		return deptname;
	}

	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}

	public String getDeptaddress() {
		return deptaddress;
	}

	public void setDeptaddress(String deptaddress) {
		this.deptaddress = deptaddress;
	}

	public String getDeptcode() {
		return deptcode;
	}

	public void setDeptcode(String deptcode) {
		this.deptcode = deptcode;
	}

	public Department(Integer depid, String deptname, String deptaddress, String deptcode) {
		super();
		this.depid = depid;
		this.deptname = deptname;
		this.deptaddress = deptaddress;
		this.deptcode = deptcode;
	}

	@Override
	public String toString() {
		return "Department [depid=" + depid + ", deptname=" + deptname + ", deptaddress=" + deptaddress + ", deptcode="
				+ deptcode + "]";
	}

	

}
