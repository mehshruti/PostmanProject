package com.MainPackage.Config;

public class EmployeeDetails {
	private long empId;
	private long salary;
	private String name;
	private long Mob;
public EmployeeDetails() {
		
	}
	public EmployeeDetails(long empId, long salary, String name, long mob) {
		super();
		this.empId = empId;
		this.salary = salary;
		this.name = name;
		this.Mob = mob;
	}
	

	
	public long getEmpId() {
		return empId;
	}
	public void setEmpId(long empId) {
		this.empId = empId;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getMob() {
		return Mob;
	}
	public void setMob(long mob) {
		this.Mob = mob;
	}
	
	

}
