package com.mohaiminur.assignment2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {
	
@Id	
@GeneratedValue(strategy=GenerationType.IDENTITY)
private long id;

@Column(name="Name")
private String Name;

@Column(name="Gender")
private String Gender;

@Column(name="Department")
private String Department;

@Column(name="City")
private String City;

public Employee() {
	
}

public Employee(String name, String gender, String department, String city) {
	super();
	Name = name;
	Gender = gender;
	Department = department;
	City = city;
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getGender() {
	return Gender;
}
public void setGender(String gender) {
	Gender = gender;
}
public String getDepartment() {
	return Department;
}
public void setDepartment(String department) {
	Department = department;
}
public String getCity() {
	return City;
}
public void setCity(String city) {
	City = city;
}

}
