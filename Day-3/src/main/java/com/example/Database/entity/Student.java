package com.example.Database.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
@Entity
@Table(name="Student")
public class Student {
	@jakarta.persistence.Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private int Id;
	@Column(name="EMPLOYEENAME")
	private String employeename;
	@Column(name="EMPLOYEEAGE")
	private int employeeage;
	@Column (name="SALARY")
	private long salary;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getEmployeename() {
		return employeename;
	}
	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}
	public int getEmployeeage() {
		return employeeage;
	}
	public void setEmployeeage(int employeeage) {
		this.employeeage = employeeage;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public Student(int id, String employeename, int employeeage, long salary) {
		super();
		Id = id;
		this.employeename = employeename;
		this.employeeage = employeeage;
		this.salary = salary;
	}
	public Student() {
		
	}
}